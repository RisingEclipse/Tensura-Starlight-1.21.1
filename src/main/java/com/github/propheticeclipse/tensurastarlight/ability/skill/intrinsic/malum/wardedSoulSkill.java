package com.github.propheticeclipse.tensurastarlight.ability.skill.intrinsic.malum;

import com.github.propheticeclipse.tensurastarlight.config.skills.arsnouveauSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.malumSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightIntrinsicSkills;
import com.hollingsworth.arsnouveau.api.perk.PerkAttributes;
import com.sammy.malum.registry.common.MalumAttributes;
import dev.shadowsoffire.apothic_attributes.api.ALObjects;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.ability.skill.Skill;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;

public class wardedSoulSkill extends Skill {

    private static final malumSeriesSkillConfig.wardedSoul CONFIG = ConfigRegistry.getConfig(malumSeriesSkillConfig.class).wardedSoul;
    public static final ResourceLocation WARDED_SOUL = ResourceLocation.fromNamespaceAndPath("trstarlight", "warded_soul");

    public wardedSoulSkill() {
        super(SkillType.INTRINSIC);
    }

    public double getAcquiringMagiculeCost(ManasSkillInstance instance) {
        return CONFIG.acquirementCost;
    }

    public int getAcquirementMastery(LivingEntity entity) {
        return CONFIG.acquirementMastery;
    }

    public boolean canBeToggled(ManasSkillInstance instance, LivingEntity entity) {
        return true;
    }

    public boolean checkAcquiringRequirement(Player entity, double newEP) {
        return false;
    }

    // Warded Soul (Increase Soul Ward Cap, - Soul Ward Charge || Soul Ward Charge ++, -- Soul Ward Cap)

    public void onToggleOn(ManasSkillInstance instance, LivingEntity entity) {
        double soulWardBonus = instance.isMastered(entity) ? CONFIG.soulWardBonusMastered : CONFIG.soulWardBonusUnmastered;
        double soulWardChargeBonus = instance.isMastered(entity) ? CONFIG.soulWardChargeBonusMastered : CONFIG.soulWardChargeBonusUnmastered;

        AttributeInstance soulWard = entity.getAttribute(MalumAttributes.SOUL_WARD_CAPACITY);
        AttributeInstance soulWardCharge = entity.getAttribute(MalumAttributes.SOUL_WARD_RECOVERY_GAIN);

        if (soulWard != null) {
            if (!soulWard.hasModifier(WARDED_SOUL)) {
                soulWard.addOrReplacePermanentModifier(new AttributeModifier(WARDED_SOUL, soulWardBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }

        if (soulWardCharge != null) {
            if (!soulWardCharge.hasModifier(WARDED_SOUL)) {
                soulWardCharge.addOrReplacePermanentModifier(new AttributeModifier(WARDED_SOUL, soulWardChargeBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }
    }

    public void onToggleOff(ManasSkillInstance instance, LivingEntity entity) {
        double soulWardBonus = instance.isMastered(entity) ? CONFIG.soulWardBonusMastered2 : CONFIG.soulWardBonusUnmastered2;
        double soulWardChargeBonus = instance.isMastered(entity) ? CONFIG.soulWardChargeBonusMastered2 : CONFIG.soulWardChargeBonusUnmastered2;

        AttributeInstance soulWard = entity.getAttribute(MalumAttributes.SOUL_WARD_CAPACITY);
        AttributeInstance soulWardCharge = entity.getAttribute(MalumAttributes.SOUL_WARD_RECOVERY_GAIN);
        if (soulWard != null) {
            soulWard.removeModifier(WARDED_SOUL);
        }

        if (soulWardCharge != null) {
            soulWardCharge.removeModifier(WARDED_SOUL);
        }

        if (!instance.isToggled()) {
            if (soulWard != null) {
                if (!soulWard.hasModifier(WARDED_SOUL)) {
                    soulWard.addOrReplacePermanentModifier(new AttributeModifier(WARDED_SOUL, soulWardBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }

            if (soulWardCharge != null) {
                if (!soulWardCharge.hasModifier(WARDED_SOUL)) {
                    soulWardCharge.addOrReplacePermanentModifier(new AttributeModifier(WARDED_SOUL, soulWardChargeBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }
        }
    }

    public void onRespawn(ManasSkillInstance instance, ServerPlayer entity, boolean conqueredEnd) {
        if (instance.isToggled()) {
            double soulWardBonus = instance.isMastered(entity) ? CONFIG.soulWardBonusMastered : CONFIG.soulWardBonusUnmastered;
            double soulWardChargeBonus = instance.isMastered(entity) ? CONFIG.soulWardChargeBonusMastered : CONFIG.soulWardChargeBonusUnmastered;

            AttributeInstance soulWard = entity.getAttribute(MalumAttributes.SOUL_WARD_CAPACITY);
            AttributeInstance soulWardCharge = entity.getAttribute(MalumAttributes.SOUL_WARD_RECOVERY_GAIN);

            if (soulWard != null) {
                if (!soulWard.hasModifier(WARDED_SOUL)) {
                    soulWard.addOrReplacePermanentModifier(new AttributeModifier(WARDED_SOUL, soulWardBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }

            if (soulWardCharge != null) {
                if (!soulWardCharge.hasModifier(WARDED_SOUL)) {
                    soulWardCharge.addOrReplacePermanentModifier(new AttributeModifier(WARDED_SOUL, soulWardChargeBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }
        } else {
            double soulWardBonus = instance.isMastered(entity) ? CONFIG.soulWardBonusMastered2 : CONFIG.soulWardBonusUnmastered2;
            double soulWardChargeBonus = instance.isMastered(entity) ? CONFIG.soulWardChargeBonusMastered2 : CONFIG.soulWardChargeBonusUnmastered2;

            AttributeInstance soulWard = entity.getAttribute(MalumAttributes.SOUL_WARD_CAPACITY);
            AttributeInstance soulWardCharge = entity.getAttribute(MalumAttributes.SOUL_WARD_RECOVERY_GAIN);

            if (soulWard != null) {
                if (!soulWard.hasModifier(WARDED_SOUL)) {
                    soulWard.addOrReplacePermanentModifier(new AttributeModifier(WARDED_SOUL, soulWardBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }

            if (soulWardCharge != null) {
                if (!soulWardCharge.hasModifier(WARDED_SOUL)) {
                    soulWardCharge.addOrReplacePermanentModifier(new AttributeModifier(WARDED_SOUL, soulWardChargeBonus, AttributeModifier.Operation.ADD_VALUE));
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
}