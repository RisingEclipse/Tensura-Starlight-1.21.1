package com.github.propheticeclipse.tensurastarlight.ability.skill.intrinsic.malum;

import com.github.propheticeclipse.tensurastarlight.config.skills.malumSeriesSkillConfig;
import com.sammy.malum.registry.common.MalumAttributes;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.skill.Skill;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;

public class soulPlundererSkill extends Skill {

    private static final malumSeriesSkillConfig.soulPlunderer CONFIG = ConfigRegistry.getConfig(malumSeriesSkillConfig.class).soulPlunderer;
    public static final ResourceLocation SOUL_PLUNDERER = ResourceLocation.fromNamespaceAndPath("trstarlight", "soul_plunderer");

    public soulPlundererSkill() {
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

    public void onToggleOn(ManasSkillInstance instance, LivingEntity entity) {
        double spiritSpoilsBonus = instance.isMastered(entity) ? CONFIG.spiritSpoilsBonusMastered : CONFIG.spiritSpoilsBonusUnmastered;

        AttributeInstance spiritSpoils = entity.getAttribute(MalumAttributes.SPIRIT_SPOILS);

        if (spiritSpoils != null) {
            if (!spiritSpoils.hasModifier(SOUL_PLUNDERER)) {
                spiritSpoils.addOrReplacePermanentModifier(new AttributeModifier(SOUL_PLUNDERER, spiritSpoilsBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }
    }

    public void onToggleOff(ManasSkillInstance instance, LivingEntity entity) {
        AttributeInstance spiritSpoils = entity.getAttribute(MalumAttributes.SOUL_WARD_CAPACITY);
        if (spiritSpoils != null) {
            spiritSpoils.removeModifier(SOUL_PLUNDERER);
        }
    }

    public void onRespawn(ManasSkillInstance instance, ServerPlayer entity, boolean conqueredEnd) {
        if (instance.isToggled()) {
            double spiritSpoilsBonus = instance.isMastered(entity) ? CONFIG.spiritSpoilsBonusMastered : CONFIG.spiritSpoilsBonusUnmastered;

            AttributeInstance spiritSpoils = entity.getAttribute(MalumAttributes.SPIRIT_SPOILS);

            if (spiritSpoils != null) {
                if (!spiritSpoils.hasModifier(SOUL_PLUNDERER)) {
                    spiritSpoils.addOrReplacePermanentModifier(new AttributeModifier(SOUL_PLUNDERER, spiritSpoilsBonus, AttributeModifier.Operation.ADD_VALUE));
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