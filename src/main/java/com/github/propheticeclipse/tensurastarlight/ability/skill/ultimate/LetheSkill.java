package com.github.propheticeclipse.tensurastarlight.ability.skill.ultimate;

import com.github.propheticeclipse.tensurastarlight.config.skills.aspectSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.registry.StarlightRaces;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUniqueSkills;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.race.api.RaceAPI;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.ability.battlewill.utility.BattlewillArt;
import io.github.manasmods.tensura.ability.skill.Skill;
import io.github.manasmods.tensura.registry.battlewill.UtilityArts;
import io.github.manasmods.tensura.registry.skill.ExtraSkills;
import io.github.manasmods.tensura.storage.TensuraStorages;
import io.github.manasmods.tensura.storage.ep.IExistence;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class LetheSkill extends Skill {

    private static final aspectSeriesSkillConfig.Lethe CONFIG = ConfigRegistry.getConfig(aspectSeriesSkillConfig.class).Lethe;
    public static final ResourceLocation LETHE = ResourceLocation.fromNamespaceAndPath("trstarlight", "lethe_lady_of_phantasm");

    public LetheSkill() {
        super(SkillType.ULTIMATE);
    }

    public double getAcquiringMagiculeCost(ManasSkillInstance instance) {
        return CONFIG.acquirementCost;
    }

    public int getAcquirementMastery(LivingEntity entity) {
        return CONFIG.acquirementMastery;
    }

    public boolean checkAcquiringRequirement(Player entity, double newEP) {
        boolean vestiges = SkillUtils.isSkillMastered(entity, StarlightUniqueSkills.VESTIGES_OF_EIDOLONS.get());
        boolean remnants = SkillUtils.isSkillMastered(entity, StarlightUniqueSkills.REMNANTS_OF_ASCENSION.get());
        boolean law = SkillUtils.isSkillMastered(entity, ExtraSkills.LAW_MANIPULATION.get());
        // Maybe be removed
        boolean haze = SkillUtils.isSkillMastered(entity, UtilityArts.HAZE.get());
        // Race check may be broken.
        boolean raceCheck = RaceAPI.getRaceFrom(entity).equals(StarlightRaces.ASPECT_OF_REGRESSION.get());
        return vestiges && remnants && law && haze && raceCheck;
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