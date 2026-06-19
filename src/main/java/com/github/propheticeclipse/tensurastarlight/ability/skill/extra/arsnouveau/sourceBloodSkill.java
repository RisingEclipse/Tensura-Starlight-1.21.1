package com.github.propheticeclipse.tensurastarlight.ability.skill.extra.arsnouveau;

import com.github.propheticeclipse.tensurastarlight.config.skills.arsnouveauSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.aspectSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.registry.StarlightEffects;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightExtraSkills;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUniqueSkills;
import com.github.propheticeclipse.tensurastarlight.utils.StarlightUtils;
import com.hollingsworth.arsnouveau.api.util.ManaUtil;
import com.hollingsworth.arsnouveau.common.capability.ManaCap;
import com.hollingsworth.arsnouveau.setup.registry.CapabilityRegistry;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.ability.skill.Skill;
import io.github.manasmods.tensura.registry.attribute.TensuraAttributes;
import io.github.manasmods.tensura.storage.TensuraStorages;
import io.github.manasmods.tensura.storage.ep.IExistence;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class sourceBloodSkill extends Skill {

    private static final arsnouveauSeriesSkillConfig.sourceBlood CONFIG = ConfigRegistry.getConfig(arsnouveauSeriesSkillConfig.class).sourceBlood;
    public static final ResourceLocation SOURCE_BLOOD = ResourceLocation.fromNamespaceAndPath("trstarlight", "source_blood_rejuvenation");

    public sourceBloodSkill() {
        super(SkillType.EXTRA);
    }

    public double getAcquiringMagiculeCost(ManasSkillInstance instance) {
        return CONFIG.acquirementCost;
    }

    public int getAcquirementMastery(LivingEntity entity) {
        return CONFIG.acquirementMastery;
    }

    public boolean checkAcquiringRequirement(Player entity, double newEP) {
        if (SkillUtils.hasSkillFully(entity, StarlightUniqueSkills.SOURCERY_CONSTITUTION.get())) {
            if (!SkillUtils.hasSkillFully(entity, StarlightExtraSkills.ABNORMALLY_LUCKY.get())) {
                return false;
            }
            if (!SkillUtils.hasSkillFully(entity, StarlightExtraSkills.HYPER_METABOLISTIC.get())) {
                return false;
            }
            if (!SkillUtils.hasSkillFully(entity, StarlightExtraSkills.PLASMATIC_SOURCE.get())) {
                return false;
            }
            if (!SkillUtils.hasSkillFully(entity, StarlightExtraSkills.SOURCE_POWERED.get())) {
                return false;
            }
            if (!SkillUtils.hasSkillFully(entity, StarlightExtraSkills.WILDEN_STALK.get())) {
                return false;
            }

            return newEP >= CONFIG.acquirementCost;
        }

        return false;
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

    public double getMagiculeCost(LivingEntity entity, ManasSkillInstance instance, int mode) {
        double cost;
        switch (mode) {
            case 0 -> cost = 0;
            default -> cost = 0.0;
        }

        return cost;
    }

    public int nextMode(LivingEntity entity, ManasSkillInstance instance, int mode, boolean reverse) {
        if (reverse) {
            return mode == 0 ? 1 : mode - 1;
        } else {
            return mode == 1 ? 0 : mode + 1; // (0 - 1) total is 2
        }
    }

    public boolean canBeToggled(ManasSkillInstance instance, LivingEntity entity) {
        return true;
    }

    public boolean canTick(ManasSkillInstance instance, LivingEntity entity) {
        return true;
    }

    /*
    Passive that replaces existing mana regen effect based on current health/shp percentages
    When learned trigger a bunch of glyph learnings?
    Leech a % of target's source as HP when attacking?
    Reduce Elemental Damage taken based on a % of max source (flat reduction)
    Way to modify HP based on how much source you have? Or alternatively health into source?
     */

    public void onTick(ManasSkillInstance instance, LivingEntity entity) {
        IExistence existence = TensuraStorages.getExistenceFrom(entity);
        double HP = entity.getHealth();
        double maxHP = entity.getMaxHealth();
        double SHP = existence.getSpiritualHealth();
        double maxSHP = entity.getAttributeValue(TensuraAttributes.MAX_SPIRITUAL_HEALTH);
        double curMana = ManaUtil.getCurrentMana(entity);
        ManaCap mana = CapabilityRegistry.getMana(entity);
        double maxMana = mana.getMaxMana();
        /*
        Thing that detects current HP level (based on being lower than 100/80/60/40/20%) and grants Mana Regen
         */

        if (curMana < maxMana || SHP < maxSHP || HP < maxHP) {
            StarlightUtils.applyEffect(entity, StarlightEffects.SOURCE_BLOOD_REJUVENATION, -1, 0);
        }
    }

}