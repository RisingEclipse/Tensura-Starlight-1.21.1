package com.github.propheticeclipse.tensurastarlight.ability.skill.intrinsic.arsnoveau;

import com.alexthw.sauce.registry.ModRegistry;
import com.github.propheticeclipse.tensurastarlight.config.skills.arsnouveauSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.aspectSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUniqueSkills;
import com.github.propheticeclipse.tensurastarlight.utils.StarlightUtils;
import com.hollingsworth.arsnouveau.setup.registry.ModEntities;
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
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;

public class starbuncleGeneticsSkill extends Skill {

    private static final arsnouveauSeriesSkillConfig.starbuncleGenetics CONFIG;
    public static final ResourceLocation STARBUNCLE_GENETICS;

    public starbuncleGeneticsSkill() {
        super(SkillType.INTRINSIC);
    }

    public double getAcquiringMagiculeCost(ManasSkillInstance instance) {
        return CONFIG.acquirementCost;
    }

    public int getAcquirementMastery(LivingEntity entity) {
        return CONFIG.acquirementMastery;
    }

    public boolean checkAcquiringRequirement(Player entity, double newEP) {

        if (entity instanceof ServerPlayer serverPlayer) {
            if (StarlightUtils.isAspectborn(entity) || SkillUtils.hasSkillPermanently(entity, StarlightUniqueSkills.SOURCERY_CONSTITUTION.get()) || StarlightUtils.isLightMasteredOrVestigesAcquired(entity)) {
                int talentReduction = 0;
                if (SkillUtils.hasSkillPermanently(entity, StarlightUniqueSkills.SOURCERY_CONSTITUTION.get())) {
                    talentReduction -= CONFIG.talentReduction;
                }
                return serverPlayer.getStats().getValue(Stats.ENTITY_KILLED.get(ModEntities.STARBUNCLE_TYPE.get())) >= (CONFIG.killCountReq - talentReduction) && newEP >= CONFIG.acquirementCost && CONFIG.enabled;
            }
        }

        return false;
    }

    public boolean canBeToggled(ManasSkillInstance instance, LivingEntity entity) {
        return true;
    }

    public void onToggleOn(ManasSkillInstance instance, LivingEntity entity) {
        double speedBonus = instance.isMastered(entity) ? CONFIG.speedBonusMastered : CONFIG.speedBonusUnmastered;

        AttributeInstance speed = entity.getAttribute(Attributes.MOVEMENT_SPEED);

        if (speed != null) {
            if (!speed.hasModifier(STARBUNCLE_GENETICS)) {
                speed.addOrReplacePermanentModifier(new AttributeModifier(STARBUNCLE_GENETICS, speedBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }

    }

    public void onToggleOff(ManasSkillInstance instance, LivingEntity entity) {
        AttributeInstance speed = entity.getAttribute(Attributes.MOVEMENT_SPEED);
        if (speed != null) {
            speed.removeModifier(STARBUNCLE_GENETICS);
        }
    }

    public void onRespawn(ManasSkillInstance instance, ServerPlayer entity, boolean conqueredEnd) {
        if (instance.isToggled()) {
            double speedBonus = instance.isMastered(entity) ? CONFIG.speedBonusMastered : CONFIG.speedBonusUnmastered;

            AttributeInstance speed = entity.getAttribute(Attributes.MOVEMENT_SPEED);

            if (speed != null) {
                if (!speed.hasModifier(STARBUNCLE_GENETICS)) {
                    speed.addOrReplacePermanentModifier(new AttributeModifier(STARBUNCLE_GENETICS, speedBonus, AttributeModifier.Operation.ADD_VALUE));
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
        STARBUNCLE_GENETICS = ResourceLocation.fromNamespaceAndPath("trstarlight", "starbuncle_genetics");
        CONFIG = ConfigRegistry.getConfig(arsnouveauSeriesSkillConfig.class).starbuncleGenetics;
    }
}