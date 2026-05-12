package com.github.propheticeclipse.tensurastarlight.ability.skill.intrinsic.arsnoveau;

import com.github.propheticeclipse.tensurastarlight.config.skills.arsnouveauSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.aspectSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUniqueSkills;
import com.hollingsworth.arsnouveau.api.perk.PerkAttributes;
import com.hollingsworth.arsnouveau.setup.registry.ModEntities;
import dev.shadowsoffire.apothic_attributes.api.ALObjects;
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

public class wildenHunterGeneticsSkill extends Skill {

    private static final arsnouveauSeriesSkillConfig.wildenHunterGenetics CONFIG;
    public static final ResourceLocation WILDEN_HUNTER_GENETICS;

    public wildenHunterGeneticsSkill() {
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
            return LightVestiges && (servPlayer.getStats().getValue(Stats.ENTITY_KILLED.get(ModEntities.WILDEN_HUNTER.get())) >= 100);
        } else {
            return false;
        }
    }

    public boolean canBeToggled(ManasSkillInstance instance, LivingEntity entity) {
        return true;
    }

    public void onToggleOn(ManasSkillInstance instance, LivingEntity entity) {
        double arrowVelocityBonus = instance.isMastered(entity) ? CONFIG.arrowVelocityBonusMastered : CONFIG.arrowVelocityBonusUnmastered;
        double drawSpeedBonus = instance.isMastered(entity) ? CONFIG.drawSpeedBonusMastered : CONFIG.drawSpeedBonusUnmastered;

        AttributeInstance arrowVelocity = entity.getAttribute(ALObjects.Attributes.ARROW_VELOCITY);
        AttributeInstance drawSpeed = entity.getAttribute(ALObjects.Attributes.DRAW_SPEED);

        if (arrowVelocity != null) {
            if (!arrowVelocity.hasModifier(WILDEN_HUNTER_GENETICS)) {
                arrowVelocity.addOrReplacePermanentModifier(new AttributeModifier(WILDEN_HUNTER_GENETICS, arrowVelocityBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }

        if (drawSpeed != null) {
            if (!drawSpeed.hasModifier(WILDEN_HUNTER_GENETICS)) {
                drawSpeed.addOrReplacePermanentModifier(new AttributeModifier(WILDEN_HUNTER_GENETICS, drawSpeedBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }
    }

    public void onToggleOff(ManasSkillInstance instance, LivingEntity entity) {
        AttributeInstance arrowVelocity = entity.getAttribute(ALObjects.Attributes.ARROW_VELOCITY);
        AttributeInstance drawSpeed = entity.getAttribute(ALObjects.Attributes.DRAW_SPEED);

        if (arrowVelocity != null) {
            arrowVelocity.removeModifier(WILDEN_HUNTER_GENETICS);
        }

        if (drawSpeed != null) {
            drawSpeed.removeModifier(WILDEN_HUNTER_GENETICS);
        }
    }

    public void onRespawn(ManasSkillInstance instance, ServerPlayer entity, boolean conqueredEnd) {
        if (instance.isToggled()) {
            double arrowVelocityBonus = instance.isMastered(entity) ? CONFIG.arrowVelocityBonusMastered : CONFIG.arrowVelocityBonusUnmastered;
            double drawSpeedBonus = instance.isMastered(entity) ? CONFIG.drawSpeedBonusMastered : CONFIG.drawSpeedBonusUnmastered;

            AttributeInstance arrowVelocity = entity.getAttribute(ALObjects.Attributes.ARROW_VELOCITY);
            AttributeInstance drawSpeed = entity.getAttribute(ALObjects.Attributes.DRAW_SPEED);

            if (arrowVelocity != null) {
                if (!arrowVelocity.hasModifier(WILDEN_HUNTER_GENETICS)) {
                    arrowVelocity.addOrReplacePermanentModifier(new AttributeModifier(WILDEN_HUNTER_GENETICS, arrowVelocityBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }

            if (drawSpeed != null) {
                if (!drawSpeed.hasModifier(WILDEN_HUNTER_GENETICS)) {
                    drawSpeed.addOrReplacePermanentModifier(new AttributeModifier(WILDEN_HUNTER_GENETICS, drawSpeedBonus, AttributeModifier.Operation.ADD_VALUE));
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
        WILDEN_HUNTER_GENETICS = ResourceLocation.fromNamespaceAndPath("trstarlight", "wilden_hunter_genetics");
        CONFIG = ConfigRegistry.getConfig(arsnouveauSeriesSkillConfig.class).wildenHunterGenetics;
    }
}