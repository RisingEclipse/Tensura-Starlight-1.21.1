package com.github.propheticeclipse.tensurastarlight.ability.skill.intrinsic.arsnoveau;

import com.alexthw.sauce.registry.ModRegistry;
import com.github.propheticeclipse.tensurastarlight.config.skills.arsnouveauSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.aspectSeriesSkillConfig;
import com.hollingsworth.arsnouveau.api.perk.PerkAttributes;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.skill.Skill;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class flarecannonGeneticsSkill extends Skill {

    private static final arsnouveauSeriesSkillConfig.flarecannonGenetics CONFIG;
    public static final ResourceLocation FLARECANNON_GENETICS;

    public flarecannonGeneticsSkill() {
        super(SkillType.INTRINSIC);
    }

    public double getAcquiringMagiculeCost(ManasSkillInstance instance) {
        return CONFIG.acquirementCost;
    }

    public int getAcquirementMastery(LivingEntity entity) {
        return CONFIG.acquirementMastery;
    }

    public void onToggleOn(ManasSkillInstance instance, LivingEntity entity) {
        double fireSpellBonus = instance.isMastered(entity) ? CONFIG.fireSpellBonusMastered : CONFIG.fireSpellBonusUnmastered;
        double manaDiscountBonus = instance.isMastered(entity) ? CONFIG.manaDiscountBonusMastered : CONFIG.manaDiscountBonusUnmastered;

        AttributeInstance fireSpell = entity.getAttribute(ModRegistry.FIRE_POWER);
        AttributeInstance manaDiscount = entity.getAttribute(ModRegistry.MANA_DISCOUNT);

        if (fireSpell != null) {
            if (!fireSpell.hasModifier(FLARECANNON_GENETICS)) {
                fireSpell.addOrReplacePermanentModifier(new AttributeModifier(FLARECANNON_GENETICS, fireSpellBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }

        if (manaDiscount != null) {
            if (!manaDiscount.hasModifier(FLARECANNON_GENETICS)) {
                manaDiscount.addOrReplacePermanentModifier(new AttributeModifier(FLARECANNON_GENETICS, manaDiscountBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }

    }

    public void onToggleOff(ManasSkillInstance instance, LivingEntity entity) {
        AttributeInstance fireSpell = entity.getAttribute(ModRegistry.FIRE_POWER);
        AttributeInstance manaDiscount = entity.getAttribute(ModRegistry.MANA_DISCOUNT);

        if (fireSpell != null) {
            fireSpell.removeModifier(FLARECANNON_GENETICS);
        }

        if (manaDiscount != null) {
            manaDiscount.removeModifier(FLARECANNON_GENETICS);
        }
    }

    public void onRespawn(ManasSkillInstance instance, ServerPlayer owner, boolean conqueredEnd) {
        if (instance.isToggled()) {
            double fireSpellBonus = instance.isMastered(owner) ? CONFIG.fireSpellBonusMastered : CONFIG.fireSpellBonusUnmastered;
            double manaDiscountBonus = instance.isMastered(owner) ? CONFIG.manaDiscountBonusMastered : CONFIG.manaDiscountBonusUnmastered;

            AttributeInstance fireSpell = owner.getAttribute(ModRegistry.FIRE_POWER);
            AttributeInstance manaDiscount = owner.getAttribute(ModRegistry.MANA_DISCOUNT);

            if (fireSpell != null) {
                if (!fireSpell.hasModifier(FLARECANNON_GENETICS)) {
                    fireSpell.addOrReplacePermanentModifier(new AttributeModifier(FLARECANNON_GENETICS, fireSpellBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }

            if (manaDiscount != null) {
                if (!manaDiscount.hasModifier(FLARECANNON_GENETICS)) {
                    manaDiscount.addOrReplacePermanentModifier(new AttributeModifier(FLARECANNON_GENETICS, manaDiscountBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }
        }
    }

    static {
        FLARECANNON_GENETICS = ResourceLocation.fromNamespaceAndPath("trstarlight", "flarecannon_genetics");
        CONFIG = ConfigRegistry.getConfig(arsnouveauSeriesSkillConfig.class).flarecannonGenetics;
    }
}