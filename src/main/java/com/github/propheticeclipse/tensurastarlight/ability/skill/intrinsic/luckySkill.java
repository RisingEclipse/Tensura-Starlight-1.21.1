package com.github.propheticeclipse.tensurastarlight.ability.skill.intrinsic;

import com.github.propheticeclipse.tensurastarlight.config.skills.aspectSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.genericIntrinsicSkillConfig;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightIntrinsicSkills;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUniqueSkills;
import dev.shadowsoffire.apothic_attributes.api.AttributeHelper;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.SkillHelper;
import io.github.manasmods.tensura.ability.TensuraSkillInstance;
import io.github.manasmods.tensura.ability.skill.Skill;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;

public class luckySkill extends Skill {

    private static final genericIntrinsicSkillConfig.lucky CONFIG;
    public static final ResourceLocation LUCKY;

    public luckySkill() {
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
        return entity.getAttributeValue(Attributes.LUCK) >= 20.0;
    }

    public void onToggleOn(ManasSkillInstance instance, LivingEntity entity) {
        double luckBonus = instance.isMastered(entity) ? CONFIG.luckBonusMastered : CONFIG.luckBonusUnmastered;

        AttributeInstance luck = entity.getAttribute(Attributes.LUCK);

        if (luck != null) {
            if (!luck.hasModifier(LUCKY)) {
                luck.addOrReplacePermanentModifier(new AttributeModifier(LUCKY, luckBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }
    }

    public void onToggleOff(ManasSkillInstance instance, LivingEntity entity) {
        AttributeInstance luck = entity.getAttribute(Attributes.LUCK);
        if (luck != null) {
            luck.removeModifier(LUCKY);
        }
    }

    public void onRespawn(ManasSkillInstance instance, ServerPlayer entity, boolean conqueredEnd) {
        if (instance.isToggled()) {
            double luckBonus = instance.isMastered(entity) ? CONFIG.luckBonusMastered : CONFIG.luckBonusUnmastered;

            AttributeInstance luck = entity.getAttribute(Attributes.LUCK);

            if (luck != null) {
                if (!luck.hasModifier(LUCKY)) {
                    luck.addOrReplacePermanentModifier(new AttributeModifier(LUCKY, luckBonus, AttributeModifier.Operation.ADD_VALUE));
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
        LUCKY = ResourceLocation.fromNamespaceAndPath("trstarlight", "lucky");
        CONFIG = ConfigRegistry.getConfig(genericIntrinsicSkillConfig.class).lucky;
    }
}