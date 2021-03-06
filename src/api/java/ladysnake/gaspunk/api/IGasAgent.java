package ladysnake.gaspunk.api;

import net.minecraft.block.Block;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * A gas agent that defines the behaviour of a gas.
 */
public interface IGasAgent {

    /**
     * Whether this gas type suffocates entities by default (can be overridden by individual gases)
     * @return true if this gas is toxic
     */
    boolean isToxic();

    /**
     * Called each tick to affect entities inside a gas cloud
     *
     * @param entity        the entity breathing this gas
     * @param handler       the entity's breathing handler
     * @param concentration the concentration of this gas in the air breathed by the entity
     * @param firstTick     true if this entity was not affected by this gas during the previous tick
     * @param potency       the potency of the agent in the gas
     */
    default void applyEffect(EntityLivingBase entity, IBreathingHandler handler, float concentration, boolean firstTick, float potency) {
        applyEffect(entity, handler, concentration, firstTick, potency, false);
    }

    /**
     * Called each tick to affect entities inside a gas cloud
     *  @param entity        the entity breathing this gas
     * @param handler       the entity's breathing handler
     * @param concentration the concentration of this gas in the air breathed by the entity
     * @param firstTick     true if this entity was not affected by this gas during the previous tick
     * @param potency       the potency of the agent in the gas
     * @param forced        true if this agent should apply its effect without checking any prerequisite
     */
    default void applyEffect(EntityLivingBase entity, IBreathingHandler handler, float concentration, boolean firstTick, float potency, boolean forced) {
        // NO-OP
    }

    /**
     * Called the tick after an entity has stopped being affected directly by this gas
     * Can be used to clean up toggled effects
     *
     * @param entity  the entity that has stopped breathing this gas
     * @param handler the entity's breathing handler
     */
    default void onExitCloud(EntityLivingBase entity, IBreathingHandler handler) {
        // NO-OP
    }

    @SideOnly(Side.CLIENT)
    default String getLocalizedName() {
        return I18n.format(getUnlocalizedName());
    }

    /**
     * TODO 1.13 change to <code>getUnlocalizedName</code>
     * @return the unlocalized name for this gas agent
     * @see Item#getTranslationKey() ()
     * @see Block#getTranslationKey()
     */
    String getUnlocalizedName();
}
