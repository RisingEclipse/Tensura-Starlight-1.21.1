package com.github.propheticeclipse.tensurastarlight.ability.skill.unique.raceUniques;

import com.github.propheticeclipse.tensurastarlight.config.skills.aspectSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.registry.StarlightRaces;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightExtraSkills;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUniqueSkills;
import com.github.propheticeclipse.tensurastarlight.utils.StarlightUtils;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.race.api.RaceAPI;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.SkillHelper;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.ability.TensuraSkillInstance;
import io.github.manasmods.tensura.ability.skill.Skill;
import io.github.manasmods.tensura.storage.TensuraStorages;
import io.github.manasmods.tensura.storage.ep.IExistence;
import io.github.manasmods.tensura.util.EnergyHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class PhantasmalCreationSkill extends Skill {
    private static final aspectSeriesSkillConfig.PhantasmalCreation CONFIG;
    public static final ResourceLocation PHANTASMAL_CREATION;

    public PhantasmalCreationSkill() {
        super(SkillType.UNIQUE);
    }

    public boolean checkAcquiringRequirement(Player entity, double newEP) {
        //boolean raceCorrect = RaceAPI.getRaceFrom(entity).equals(StarlightRaces.MYTHOS);
        boolean skill1 = (SkillUtils.isSkillMastered(entity, StarlightUniqueSkills.MAGICULE_ENGRAVEMENT.get()));
        boolean skill2 = (SkillUtils.isSkillMastered(entity, StarlightUniqueSkills.MEMORY_RECREATION.get()));

        if (skill1 && skill2) {
            TensuraSkillInstance thisSkillLol = new TensuraSkillInstance(StarlightUniqueSkills.PHANTASMAL_CREATION.get());
            thisSkillLol.getOrCreateTag().putBoolean("NoMagiculeCost", true);
            SkillHelper.learnSkill(entity, thisSkillLol);
            return true;
        }

        return false;
    }

    public double getAcquiringMagiculeCost(ManasSkillInstance instance) {
        return CONFIG.acquirementCost;
    }
    public int getAcquirementMastery(LivingEntity entity) {
        return CONFIG.acquirementMastery;
    }

    public int getModes(ManasSkillInstance instance) {
        return 3;
    }

    public String getModeId(ManasSkillInstance instance, int mode) {
        String var10000;
        switch (mode) {
            case 0 -> var10000 = "phantasmal_creation.block_memory";
            case 1 -> var10000 = "phantasmal_creation.magicule_imbuement";
            case 2 -> var10000 = "phantasmal_creation.item_memory";
            default -> var10000 = super.getModeId(instance, mode);
        }

        return var10000;
    }

    public int nextMode(LivingEntity entity, ManasSkillInstance instance, int mode, boolean reverse) {
        if (reverse) {
            return mode == 0 ? 2 : mode - 1;
        } else {
            return mode == 2 ? 0 : mode + 1; // (0 - 1) total is 2
        }
    }

    public void onPressed(ManasSkillInstance instance, LivingEntity entity, int keyNumber, int mode) {
        if (mode == 0) {

            double maxAura = EnergyHelper.getMaxAura(entity);
            double maxMana = EnergyHelper.getMaxMagicule(entity);
            double totalAuraCost = isMastered(instance, entity) ? ((maxAura * CONFIG.blockMemoryAPCostPercentMastered) + CONFIG.blockMemoryAPCostFlatMastered) : ((maxAura * CONFIG.blockMemoryAPCostPercentUnmastered) + CONFIG.blockMemoryAPCostFlatUnmastered);
            double totalManaCost = isMastered(instance, entity) ? ((maxMana * CONFIG.blockMemoryMPCostPercentMastered) + CONFIG.blockMemoryMPCostFlatMastered) : ((maxMana * CONFIG.blockMemoryMPCostPercentUnmastered) + CONFIG.blockMemoryMPCostFlatUnmastered);

            double permanentAuraCost = isMastered(instance, entity) ? ((maxAura * CONFIG.blockMemoryAPPermanentCostPercentMastered) + CONFIG.blockMemoryAPPermanentCostFlatMastered) : ((maxAura * CONFIG.blockMemoryAPPermanentCostPercentUnmastered) + CONFIG.blockMemoryAPPermanentCostFlatUnmastered);
            double permanentManaCost = isMastered(instance, entity) ? ((maxMana * CONFIG.blockMemoryMPPermanentCostPercentMastered) + CONFIG.blockMemoryMPPermanentCostFlatMastered) : ((maxMana * CONFIG.blockMemoryMPPermanentCostPercentUnmastered) + CONFIG.blockMemoryMPPermanentCostFlatUnmastered);

            double minimumMana = (maxMana - (permanentManaCost + 1000.0));
            double minimumAura = (maxAura - (permanentAuraCost + 1000.0));

            double blockMemoryRange = isMastered(instance, entity) ? CONFIG.blockMemoryRangeMastered : CONFIG.blockMemoryRangeUnmastered;
            double blockMemorySuccessRate = isMastered(instance, entity) ? CONFIG.blockMemorySuccessRateMastered : CONFIG.blockMemorySuccessRateUnmastered;
            double blockMemoryDestroyRate = isMastered(instance, entity) ? CONFIG.blockMemoryDestroyRateMastered : CONFIG.blockMemoryDestroyRateUnmastered;
            int blockMemoryCopies = isMastered(instance, entity) ? CONFIG.blockMemoryCopiesMastered : CONFIG.blockMemoryCopiesUnmastered;
            int blockMemoryCooldown = isMastered(instance, entity) ? CONFIG.blockMemoryCooldownMastered : CONFIG.blockMemoryCooldownUnmastered;

            if (minimumMana >= 1000.0 && minimumAura >= 1000.0) {

                StarlightUtils.DupeTargetBlock(entity, blockMemoryRange, blockMemorySuccessRate, blockMemoryDestroyRate, blockMemoryCopies, totalAuraCost, totalManaCost);

                instance.addMasteryPoint(entity);
                EnergyHelper.setMaxAura(entity, maxAura - permanentAuraCost);
                EnergyHelper.setMaxMagicule(entity, maxMana - permanentManaCost);
                instance.setCoolDown(blockMemoryCooldown, 0);
            }
        }
        if (mode == 1) {
            double maxAura = EnergyHelper.getMaxAura(entity);
            double maxMana = EnergyHelper.getMaxMagicule(entity);
            double totalAuraCost = isMastered(instance, entity) ? ((maxAura * CONFIG.engraveImbuementAPCostPercentMastered) + CONFIG.engraveImbuementAPCostFlatMastered) : ((maxAura * CONFIG.engraveImbuementAPCostPercentUnmastered) + CONFIG.engraveImbuementAPCostFlatUnmastered);
            double totalManaCost = isMastered(instance, entity) ? ((maxMana * CONFIG.engraveImbuementMPCostPercentMastered) + CONFIG.engraveImbuementMPCostFlatMastered) : ((maxMana * CONFIG.engraveImbuementMPCostPercentUnmastered) + CONFIG.engraveImbuementMPCostFlatUnmastered);

            double permanentAuraCost = isMastered(instance, entity) ? ((maxAura * CONFIG.engraveImbuementAPPermanentCostPercentMastered) + CONFIG.engraveImbuementAPPermanentCostFlatMastered) : ((maxAura * CONFIG.engraveImbuementAPPermanentCostPercentUnmastered) + CONFIG.engraveImbuementAPPermanentCostFlatUnmastered);
            double permanentManaCost = isMastered(instance, entity) ? ((maxMana * CONFIG.engraveImbuementMPPermanentCostPercentMastered) + CONFIG.engraveImbuementMPPermanentCostFlatMastered) : ((maxMana * CONFIG.engraveImbuementMPPermanentCostPercentUnmastered) + CONFIG.engraveImbuementMPPermanentCostFlatUnmastered);

            double minimumMana = (maxMana - (permanentManaCost + 1000.0));
            double minimumAura = (maxAura - (permanentAuraCost + 1000.0));

            int enchantLevel = isMastered(instance, entity) ? CONFIG.engraveImbuementLevelMastered : CONFIG.engraveImbuementLevelUnmastered;
            double successRate = isMastered(instance, entity) ? CONFIG.engraveImbuementSuccessRateMastered : CONFIG.engraveImbuementSuccessRateUnmastered;
            double destroyRate = isMastered(instance, entity) ? CONFIG.engraveImbuementDestroyRateMastered : CONFIG.engraveImbuementDestroyRateUnmastered;
            int copies = isMastered(instance, entity) ? CONFIG.engraveImbuementCopiesMastered : CONFIG.engraveImbuementCopiesUnmastered;
            int cooldown = isMastered(instance, entity) ? CONFIG.engraveImbuementCooldownMastered : CONFIG.engraveImbuementCooldownUnmastered;

            if (minimumMana >= 1000.0 && minimumAura >= 1000.0) {

                StarlightUtils.CreateRandomEngraveInHand(entity, enchantLevel, successRate, destroyRate, copies, totalAuraCost, totalManaCost, CONFIG.engraveImbuementBlacklist);

                instance.addMasteryPoint(entity);
                EnergyHelper.setMaxAura(entity, maxAura - permanentAuraCost);
                EnergyHelper.setMaxMagicule(entity, maxMana - permanentManaCost);
                instance.setCoolDown(cooldown, 1);
            }
        }
        if (mode == 2) {

            double maxAura = EnergyHelper.getMaxAura(entity);
            double maxMana = EnergyHelper.getMaxMagicule(entity);
            double totalAuraCost = isMastered(instance, entity) ? ((maxAura * CONFIG.itemMemoryAPCostPercentMastered) + CONFIG.itemMemoryAPCostFlatMastered) : ((maxAura * CONFIG.itemMemoryAPCostPercentUnmastered) + CONFIG.itemMemoryAPCostFlatUnmastered);
            double totalManaCost = isMastered(instance, entity) ? ((maxMana * CONFIG.itemMemoryMPCostPercentMastered) + CONFIG.itemMemoryMPCostFlatMastered) : ((maxMana * CONFIG.itemMemoryMPCostPercentUnmastered) + CONFIG.itemMemoryMPCostFlatUnmastered);

            double permanentAuraCost = isMastered(instance, entity) ? ((maxAura * CONFIG.itemMemoryAPPermanentCostPercentMastered) + CONFIG.itemMemoryAPPermanentCostFlatMastered) : ((maxAura * CONFIG.itemMemoryAPPermanentCostPercentUnmastered) + CONFIG.itemMemoryAPPermanentCostFlatUnmastered);
            double permanentManaCost = isMastered(instance, entity) ? ((maxMana * CONFIG.itemMemoryMPPermanentCostPercentMastered) + CONFIG.itemMemoryMPPermanentCostFlatMastered) : ((maxMana * CONFIG.itemMemoryMPPermanentCostPercentUnmastered) + CONFIG.itemMemoryMPPermanentCostFlatUnmastered);

            double minimumMana = (maxMana - (permanentManaCost + 1000.0));
            double minimumAura = (maxAura - (permanentAuraCost + 1000.0));

            double successRate = isMastered(instance, entity) ? CONFIG.itemMemorySuccessRateMastered : CONFIG.itemMemorySuccessRateUnmastered;
            double destroyRate = isMastered(instance, entity) ? CONFIG.itemMemoryDestroyRateMastered : CONFIG.itemMemoryDestroyRateUnmastered;
            int copies = isMastered(instance, entity) ? CONFIG.itemMemoryCopiesMastered : CONFIG.itemMemoryCopiesUnmastered;
            int cooldown = isMastered(instance, entity) ? CONFIG.itemMemoryCooldownMastered : CONFIG.itemMemoryCooldownUnmastered;

            if (minimumMana >= 1000.0 && minimumAura >= 1000.0) {

                StarlightUtils.DupeHeldItem(entity, successRate, destroyRate, copies, totalAuraCost, totalManaCost);

                instance.addMasteryPoint(entity);
                EnergyHelper.setMaxAura(entity, maxAura - permanentAuraCost);
                EnergyHelper.setMaxMagicule(entity, maxMana - permanentManaCost);
                instance.setCoolDown(cooldown, 2);
            }
        }
    }

    static {
        PHANTASMAL_CREATION = ResourceLocation.fromNamespaceAndPath("trstarlight", "phantasmal_creation");
        CONFIG = ConfigRegistry.getConfig(aspectSeriesSkillConfig.class).PhantasmalCreation;
    }
}
