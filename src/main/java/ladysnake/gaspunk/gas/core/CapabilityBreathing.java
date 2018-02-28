package ladysnake.gaspunk.gas.core;

import ladysnake.gaspunk.GasPunk;
import ladysnake.gaspunk.api.IBreathingHandler;
import ladysnake.gaspunk.api.IGas;
import ladysnake.gaspunk.api.event.GasEvent;
import ladysnake.gaspunk.item.ItemGasMask;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.INpc;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.ReflectionHelper;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Mod.EventBusSubscriber(modid = GasPunk.MOD_ID)
public class CapabilityBreathing {

    private static final MethodHandle entityLivingBase$decreaseAirSupply;

    static {
        MethodHandle temp = null;
        try {
            Method method = ReflectionHelper.findMethod(EntityLivingBase.class, "decreaseAirSupply", "func_70682_h", int.class);
            temp = MethodHandles.lookup().unreflect(method);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        entityLivingBase$decreaseAirSupply = temp;
    }

    @CapabilityInject(IBreathingHandler.class)
    public static Capability<IBreathingHandler> CAPABILITY_BREATHING;

    public static void register() {
        CapabilityManager.INSTANCE.register(IBreathingHandler.class, new Storage(), DefaultBreathingHandler::new);
    }

    public static Optional<IBreathingHandler> getHandler(Entity entity) {
        if (entity instanceof EntityLivingBase)
            return Optional.ofNullable(entity.getCapability(CAPABILITY_BREATHING, null));
        return Optional.empty();
    }

    @SubscribeEvent
    public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
        if (event.getObject() instanceof EntityLivingBase)
            event.addCapability(new ResourceLocation(GasPunk.MOD_ID, "breathing_cap"), new Provider((EntityLivingBase) event.getObject()));
    }

    @SubscribeEvent
    public static void onLivingUpdate(LivingEvent.LivingUpdateEvent event) {
        getHandler(event.getEntity()).ifPresent(IBreathingHandler::tick);
    }

    public static class DefaultBreathingHandler implements IBreathingHandler {
        /**
         * a value between 0 and 300, emulating the entity air stat with greater precision
         */
        protected float airSupply;
        protected int maxAirSupply;
        private final EntityLivingBase owner;
        private final Map<IGas, Float> prevConcentrations = new HashMap<>();
        private final Map<IGas, Float> concentrations = new HashMap<>();

        DefaultBreathingHandler() {
            this(null, 300);
        }

        public DefaultBreathingHandler(EntityLivingBase owner, int maxAirSupply) {
            this.owner = owner;
            this.maxAirSupply = maxAirSupply;
            this.airSupply = maxAirSupply;
        }

        /**
         * Sets a gas concentration surrounding an entity for this tick
         *
         * @param gas           the gas suffocating this entity
         * @param concentration a value between 0 and 1 representing the gas' concentration in the entity space
         */
        @Override
        public void setConcentration(IGas gas, float concentration) {
            if (concentrations.getOrDefault(gas, 0f) < concentration)
                concentrations.put(gas, concentration);
        }

        @Override
        public Map<IGas, Float> getGasConcentrations() {
            return concentrations;
        }

        @Override
        public void tick() {
            if (!owner.world.isRemote) {
                prevConcentrations.forEach((gas, concentration) -> {
                    if (!concentrations.containsKey(gas))
                        if (MinecraftForge.EVENT_BUS.post(new GasEvent.ExitGasCloudEvent(owner, this, gas, concentration))) {
                            concentrations.put(gas, concentration);
                        } else {
                            gas.onExitCloud(owner, this);
                        }
                });
                boolean appliedAirReduction = false;
                if (!isImmune()) {
                    float entityModifier = 1;
                    if (entityLivingBase$decreaseAirSupply != null) {
                        try {
                            // entities like iron golems get a chance to nullify the effect
                            entityModifier = airSupply - (int) entityLivingBase$decreaseAirSupply.invoke(owner, (int) airSupply);
                        } catch (Throwable throwable) {
                            throwable.printStackTrace();
                        }
                    }
                    for (Map.Entry<IGas, Float> gasEffect : concentrations.entrySet()) {
                        IGas gas = gasEffect.getKey();
                        float concentration = gasEffect.getValue() * entityModifier;
                        boolean firstTick = !prevConcentrations.containsKey(gasEffect.getKey());
                        if (MinecraftForge.EVENT_BUS.post(new GasEvent.GasTickEvent(owner, this, gas, concentration, firstTick)))
                            continue;
                        if (gas.isToxic()) {
                            if (airSupply > 0 && !appliedAirReduction) {
                                this.setAirSupply(airSupply - 2);
                            }
                            appliedAirReduction = true;
                        }
                        gas.applyEffect(owner, this, concentration, firstTick);
                    }
                }
                prevConcentrations.clear();
                prevConcentrations.putAll(concentrations);
                // regenerate air supply if no toxic gas was inhaled
                if (!appliedAirReduction && airSupply < maxAirSupply) {
                    this.setAirSupply(airSupply + 2);
                }
            }
            // invalidate concentration values for next tick
            concentrations.clear();
        }

        @Override
        public boolean isImmune() {
            boolean immune = owner.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof ItemGasMask;
            GasEvent.GasImmunityEvent event = new GasEvent.GasImmunityEvent(owner, this, immune);
            MinecraftForge.EVENT_BUS.post(event);
            return event.isImmune();
        }

        @Override
        public float getAirSupply() {
            return airSupply;
        }

        @Override
        public void setAirSupply(float airSupply) {
            this.airSupply = Math.min(airSupply, maxAirSupply);
        }
    }

    public static class Provider implements ICapabilitySerializable<NBTTagCompound> {
        final IBreathingHandler instance;

        Provider(EntityLivingBase object) {
            if (object instanceof EntityPlayerMP)
                this.instance = new PlayerBreathingHandler((EntityPlayerMP) object);
            else {
                int maxAir;
                if (object instanceof EntityPlayer)
                    maxAir = 300;
                else if (object instanceof INpc)
                    maxAir = 200;
                else
                    maxAir = 40;
                this.instance = new DefaultBreathingHandler(object, maxAir);
            }
        }

        @Override
        public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing facing) {
            return capability == CAPABILITY_BREATHING;
        }

        @Nullable
        @Override
        public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing) {
            return capability == CAPABILITY_BREATHING ? CAPABILITY_BREATHING.cast(instance) : null;
        }

        @Override
        public NBTTagCompound serializeNBT() {
            return (NBTTagCompound) CAPABILITY_BREATHING.getStorage().writeNBT(CAPABILITY_BREATHING, instance, null);
        }

        @Override
        public void deserializeNBT(NBTTagCompound nbt) {
            CAPABILITY_BREATHING.getStorage().readNBT(CAPABILITY_BREATHING, instance, null, nbt);
        }
    }

    public static class Storage implements Capability.IStorage<IBreathingHandler> {

        @Nullable
        @Override
        public NBTBase writeNBT(Capability<IBreathingHandler> capability, IBreathingHandler instance, EnumFacing side) {
            NBTTagCompound nbt = new NBTTagCompound();
            nbt.setFloat("breath", instance.getAirSupply());
            return nbt;
        }

        @Override
        public void readNBT(Capability<IBreathingHandler> capability, IBreathingHandler instance, EnumFacing side, NBTBase nbt) {
            instance.setAirSupply(((NBTTagCompound) nbt).getFloat("breath"));
        }
    }
}
