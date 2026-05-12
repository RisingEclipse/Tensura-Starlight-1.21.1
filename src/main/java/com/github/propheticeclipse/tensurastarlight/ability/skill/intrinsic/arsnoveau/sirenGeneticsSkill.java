package com.github.propheticeclipse.tensurastarlight.ability.skill.intrinsic.arsnoveau;

import alexthw.ars_elemental.registry.ModEntities;
import com.alexthw.sauce.registry.ModRegistry;
import com.github.propheticeclipse.tensurastarlight.config.skills.arsnouveauSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.aspectSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUniqueSkills;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.ability.skill.Skill;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;

public class sirenGeneticsSkill extends Skill {

    private static final arsnouveauSeriesSkillConfig.sirenGenetics CONFIG;
    public static final ResourceLocation SIREN_GENETICS;

    public sirenGeneticsSkill() {
        super(SkillType.INTRINSIC);
    }

    public double getAcquiringMagiculeCost(ManasSkillInstance instance) {
        return CONFIG.acquirementCost;
    }

    public int getAcquirementMastery(LivingEntity entity) {
        return CONFIG.acquirementMastery;
    }

    public boolean checkAcquiringRequirement(Player entity, double newEP) {

        boolean LightVestiges = SkillUtils.hasSkillFully(entity, StarlightUniqueSkills.LIGHT_REMAINS.get()) || SkillUtils.hasSkillFully(entity, StarlightUniqueSkills.VESTIGES_OF_EIDOLONS.get());
        if (entity instanceof ServerPlayer servPlayer) {
            return LightVestiges && (servPlayer.getStats().getValue(Stats.ENTITY_KILLED.get(ModEntities.SIREN_ENTITY.get())) >= 25);
        } else {
            return false;
        }
    }

    public boolean canBeToggled(ManasSkillInstance instance, LivingEntity entity) {
        return true;
    }

    public void onToggleOn(ManasSkillInstance instance, LivingEntity entity) {
        double waterSpellBonus = instance.isMastered(entity) ? CONFIG.waterSpellBonusMastered : CONFIG.waterSpellBonusUnmastered;
        double manaDiscountBonus = instance.isMastered(entity) ? CONFIG.manaDiscountBonusMastered : CONFIG.manaDiscountBonusUnmastered;

        AttributeInstance waterSpell = entity.getAttribute(ModRegistry.WATER_POWER);
        AttributeInstance manaDiscount = entity.getAttribute(ModRegistry.MANA_DISCOUNT);

        if (waterSpell != null) {
            if (!waterSpell.hasModifier(SIREN_GENETICS)) {
                waterSpell.addOrReplacePermanentModifier(new AttributeModifier(SIREN_GENETICS, waterSpellBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }

        if (manaDiscount != null) {
            if (!manaDiscount.hasModifier(SIREN_GENETICS)) {
                manaDiscount.addOrReplacePermanentModifier(new AttributeModifier(SIREN_GENETICS, manaDiscountBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }

    }

    public void onToggleOff(ManasSkillInstance instance, LivingEntity entity) {
        AttributeInstance waterSpell = entity.getAttribute(ModRegistry.WATER_POWER);
        AttributeInstance manaDiscount = entity.getAttribute(ModRegistry.MANA_DISCOUNT);

        if (waterSpell != null) {
            waterSpell.removeModifier(SIREN_GENETICS);
        }

        if (manaDiscount != null) {
            manaDiscount.removeModifier(SIREN_GENETICS);
        }
    }

    public void onRespawn(ManasSkillInstance instance, ServerPlayer owner, boolean conqueredEnd) {
        if (instance.isToggled()) {
            double waterSpellBonus = instance.isMastered(owner) ? CONFIG.waterSpellBonusMastered : CONFIG.waterSpellBonusUnmastered;
            double manaDiscountBonus = instance.isMastered(owner) ? CONFIG.manaDiscountBonusMastered : CONFIG.manaDiscountBonusUnmastered;

            AttributeInstance waterSpell = owner.getAttribute(ModRegistry.WATER_POWER);
            AttributeInstance manaDiscount = owner.getAttribute(ModRegistry.MANA_DISCOUNT);

            if (waterSpell != null) {
                if (!waterSpell.hasModifier(SIREN_GENETICS)) {
                    waterSpell.addOrReplacePermanentModifier(new AttributeModifier(SIREN_GENETICS, waterSpellBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }

            if (manaDiscount != null) {
                if (!manaDiscount.hasModifier(SIREN_GENETICS)) {
                    manaDiscount.addOrReplacePermanentModifier(new AttributeModifier(SIREN_GENETICS, manaDiscountBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }
        }
    }

    public boolean canTick(ManasSkillInstance instance, LivingEntity entity) {
        return instance.isToggled();
    }

    public void onTick(ManasSkillInstance instance, LivingEntity living) {
        CompoundTag tag = instance.getOrCreateTag();
        int time = tag.getInt("activatedTimes");
        if (time % 20 == 0) {
            this.addMasteryPoint(instance, living);
        }

        tag.putInt("activatedTimes", time + 1);
    }

    static {
        SIREN_GENETICS = ResourceLocation.fromNamespaceAndPath("trstarlight", "siren_genetics");
        CONFIG = ConfigRegistry.getConfig(arsnouveauSeriesSkillConfig.class).sirenGenetics;
    }
}