package com.github.propheticeclipse.tensurastarlight.ability.skill.intrinsic;

import com.github.propheticeclipse.tensurastarlight.config.skills.aspectSeriesSkillConfig;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.skill.Skill;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class luckySkill extends Skill {

    private static final aspectSeriesSkillConfig.MemoryRecreation CONFIG;
    public static final ResourceLocation MEMORY_RECREATION;

    public luckySkill() {
        super(SkillType.INTRINSIC);
    }

    public double getAcquiringMagiculeCost(ManasSkillInstance instance) {
        return CONFIG.acquirementCost;
    }

    public int getAcquirementMastery(LivingEntity entity) {
        return CONFIG.acquirementMastery;
    }

    public boolean checkAcquiringRequirement(Player entity, double newEP) {
        return false;
    }

    static {
        MEMORY_RECREATION = ResourceLocation.fromNamespaceAndPath("trstarlight", "skill_id");
        CONFIG = ConfigRegistry.getConfig(aspectSeriesSkillConfig.class).MemoryRecreation;
    }
}