package com.github.propheticeclipse.tensurastarlight.ability.skill.unique.raceUniques;

import com.github.propheticeclipse.tensurastarlight.config.skills.aspectSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.utils.StarlightUtils;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.skill.Skill;
import io.github.manasmods.tensura.enchantment.TensuraEnchantments;
import io.github.manasmods.tensura.util.EnergyHelper;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;

public class MemoryRecreationSkill extends Skill {
    private static final aspectSeriesSkillConfig.MemoryRecreation CONFIG;
    public static final ResourceLocation MEMORY_RECREATION;

    public MemoryRecreationSkill() {
        super(SkillType.UNIQUE);
    }

    public double getAcquiringMagiculeCost(ManasSkillInstance instance) {
        return CONFIG.acquirementCost;
    }
    public int getAcquirementMastery(LivingEntity entity) {
        return CONFIG.acquirementMastery;
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

    public void onPressed(ManasSkillInstance instance, LivingEntity entity, int keyNumber, int mode) {
        if (mode == 0) {
            double maxAura = EnergyHelper.getMaxAura(entity);
            double maxMana = EnergyHelper.getMaxMagicule(entity);
            double totalAuraCost = ((maxAura * CONFIG.blockMemoryAPCostPercent) + CONFIG.blockMemoryAPCostFlat);
            double totalManaCost = ((maxMana * CONFIG.blockMemoryMPCostPercent) + CONFIG.blockMemoryMPCostFlat);
            StarlightUtils.DupeTargetBlock(entity, CONFIG.blockMemoryRange, CONFIG.blockMemorySuccessRate, CONFIG.blockMemoryDestroyRate, CONFIG.blockMemoryCopies, totalAuraCost, totalManaCost);
        }
    }

    static {
        MEMORY_RECREATION = ResourceLocation.fromNamespaceAndPath("trstarlight", "light_remains");
        CONFIG = ConfigRegistry.getConfig(aspectSeriesSkillConfig.class).MemoryRecreation;
    }
}
