package ladysnake.gaspunk.entity;

import com.sun.istack.internal.NotNull;
import ladysnake.gaspunk.init.ModItems;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

import javax.annotation.Nonnull;

public class EntityGrenade extends EntityThrowable {
    private static final DataParameter<ItemStack> ITEM = EntityDataManager.createKey(EntityGrenade.class, DataSerializers.ITEM_STACK);
    private static final DataParameter<Integer> COUNTDOWN = EntityDataManager.createKey(EntityGrenade.class, DataSerializers.VARINT);

    public EntityGrenade(World worldIn) {
        super(worldIn);
    }

    public EntityGrenade(World worldIn, EntityLivingBase throwerIn, ItemStack stack) {
        super(worldIn, throwerIn);
        setItem(stack);
    }

    @Override
    protected void entityInit() {
        getDataManager().register(COUNTDOWN, 60);
        getDataManager().register(ITEM, new ItemStack(ModItems.GRENADE));
    }

    public void setItem(ItemStack item) {
        getDataManager().set(ITEM, item);
    }

    public void setCountdown(int countdown) {
        getDataManager().set(COUNTDOWN, countdown);
    }

    private int getCountdown() {
        return getDataManager().get(COUNTDOWN);
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        int countdown = getCountdown();
        if (countdown < 1)
            explode();
        else
            setCountdown(getCountdown() - 1);
    }

    @Override
    protected void onImpact(@Nonnull RayTraceResult result) {
        explode();
    }

    protected void explode() {
        if (this.world instanceof WorldServer) {
            WorldServer worldServer = (WorldServer) this.world;
            worldServer.spawnParticle(EnumParticleTypes.SMOKE_LARGE, posX, posY, posZ, 0.5, 0.5, 0.5);
        }

    }
}
