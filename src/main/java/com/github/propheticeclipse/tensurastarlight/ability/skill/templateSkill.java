package com.github.propheticeclipse.tensurastarlight.ability.skill;

import com.github.propheticeclipse.tensurastarlight.config.skills.aspectSeriesSkillConfig;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.skill.Skill;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class templateSkill extends Skill {

    private static final aspectSeriesSkillConfig.MemoryRecreation CONFIG = ConfigRegistry.getConfig(aspectSeriesSkillConfig.class).MemoryRecreation;
    public static final ResourceLocation MEMORY_RECREATION = ResourceLocation.fromNamespaceAndPath("trstarlight", "skill_id");

    public templateSkill() {
        super(SkillType.UNIQUE);
    }

    public double getAcquiringMagiculeCost(ManasSkillInstance instance) {
        return CONFIG.acquirementCost;
    }

    public int getAcquirementMastery(LivingEntity entity) {
        return CONFIG.acquirementMastery;
    }

    public boolean checkAcquiringRequirement(Player entity, double newEP) {
        return true;
    }

    public int getModes(ManasSkillInstance instance) {
        return 1;
    }

    public String getModeId(ManasSkillInstance instance, int mode) {
        String var10000;
        switch (mode) {
            case 0 -> var10000 = "memory_recreation.block_memory";
            default -> var10000 = super.getModeId(instance, mode);
        }

        return var10000;
    }
}