package com.github.propheticeclipse.tensurastarlight.ability.skill.intrinsic.arsnoveau;

import com.alexthw.sauce.registry.ModRegistry;
import com.github.propheticeclipse.tensurastarlight.config.skills.arsnouveauSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.aspectSeriesSkillConfig;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.skill.Skill;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;

public class flashjackGeneticsSkill extends Skill {

    private static final arsnouveauSeriesSkillConfig.flashjackGenetics CONFIG;
    public static final ResourceLocation FLASHJACK_GENETICS;

    public flashjackGeneticsSkill() {
        super(SkillType.UNIQUE);
    }

    public double getAcquiringMagiculeCost(ManasSkillInstance instance) {
        return CONFIG.acquirementCost;
    }

    public int getAcquirementMastery(LivingEntity entity) {
        return CONFIG.acquirementMastery;
    }

    public void onToggleOn(ManasSkillInstance instance, LivingEntity entity) {
        double airSpellBonus = instance.isMastered(entity) ? CONFIG.airSpellBonusMastered : CONFIG.airSpellBonusUnmastered;
        double manaDiscountBonus = instance.isMastered(entity) ? CONFIG.manaDiscountBonusMastered : CONFIG.manaDiscountBonusUnmastered;

        AttributeInstance airSpell = entity.getAttribute(ModRegistry.AIR_POWER);
        AttributeInstance manaDiscount = entity.getAttribute(ModRegistry.MANA_DISCOUNT);

        if (airSpell != null) {
            if (!airSpell.hasModifier(FLASHJACK_GENETICS)) {
                airSpell.addOrReplacePermanentModifier(new AttributeModifier(FLASHJACK_GENETICS, airSpellBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }

        if (manaDiscount != null) {
            if (!manaDiscount.hasModifier(FLASHJACK_GENETICS)) {
                manaDiscount.addOrReplacePermanentModifier(new AttributeModifier(FLASHJACK_GENETICS, manaDiscountBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }

    }

    public void onToggleOff(ManasSkillInstance instance, LivingEntity entity) {
        AttributeInstance airSpell = entity.getAttribute(ModRegistry.AIR_POWER);
        AttributeInstance manaDiscount = entity.getAttribute(ModRegistry.MANA_DISCOUNT);

        if (airSpell != null) {
            airSpell.removeModifier(FLASHJACK_GENETICS);
        }

        if (manaDiscount != null) {
            manaDiscount.removeModifier(FLASHJACK_GENETICS);
        }
    }

    public void onRespawn(ManasSkillInstance instance, ServerPlayer owner, boolean conqueredEnd) {
        if (instance.isToggled()) {
            double airSpellBonus = instance.isMastered(owner) ? CONFIG.airSpellBonusMastered : CONFIG.airSpellBonusUnmastered;
            double manaDiscountBonus = instance.isMastered(owner) ? CONFIG.manaDiscountBonusMastered : CONFIG.manaDiscountBonusUnmastered;

            AttributeInstance airSpell = owner.getAttribute(ModRegistry.AIR_POWER);
            AttributeInstance manaDiscount = owner.getAttribute(ModRegistry.MANA_DISCOUNT);

            if (airSpell != null) {
                if (!airSpell.hasModifier(FLASHJACK_GENETICS)) {
                    airSpell.addOrReplacePermanentModifier(new AttributeModifier(FLASHJACK_GENETICS, airSpellBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }

            if (manaDiscount != null) {
                if (!manaDiscount.hasModifier(FLASHJACK_GENETICS)) {
                    manaDiscount.addOrReplacePermanentModifier(new AttributeModifier(FLASHJACK_GENETICS, manaDiscountBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }
        }
    }

    static {
        FLASHJACK_GENETICS = ResourceLocation.fromNamespaceAndPath("trstarlight", "flashjack_genetics");
        CONFIG = ConfigRegistry.getConfig(arsnouveauSeriesSkillConfig.class).flashjackGenetics;
    }
}