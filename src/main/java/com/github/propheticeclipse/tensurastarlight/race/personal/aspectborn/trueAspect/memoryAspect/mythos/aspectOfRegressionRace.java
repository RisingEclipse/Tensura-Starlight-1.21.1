package com.github.propheticeclipse.tensurastarlight.race.personal.aspectborn.trueAspect.memoryAspect.mythos;

import com.github.propheticeclipse.tensurastarlight.config.StarlightCommon;
import com.github.propheticeclipse.tensurastarlight.config.races.aspectBornRaceConfig;
import com.github.propheticeclipse.tensurastarlight.race.personal.aspectborn.trueAspect.memoryAspect.grandMemoryBornRace;
import com.github.propheticeclipse.tensurastarlight.race.personal.aspectborn.trueAspect.memoryAspect.greaterMemoryBornRace;
import com.github.propheticeclipse.tensurastarlight.registry.StarlightRaces;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUltimateSkills;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUniqueSkills;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.race.api.ManasRace;
import io.github.manasmods.manascore.race.api.ManasRaceInstance;
import io.github.manasmods.manascore.skill.api.ManasSkill;
import io.github.manasmods.manascore.skill.api.SkillAPI;
import io.github.manasmods.tensura.ability.SkillHelper;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.ability.TensuraSkill;
import io.github.manasmods.tensura.ability.TensuraSkillInstance;
import io.github.manasmods.tensura.config.race.RaceConfig;
import io.github.manasmods.tensura.race.template.EvolutionRequirement;
import io.github.manasmods.tensura.registry.skill.ExtraSkills;
import io.github.manasmods.tensura.storage.Alignment;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class aspectOfRegressionRace extends grandMemoryBornRace {
    private static final aspectBornRaceConfig.aspectOfRegression CONFIG = ConfigRegistry.getConfig(aspectBornRaceConfig.class).aspectOfRegression;

    public aspectOfRegressionRace(Difficulty difficulty) {
        super(difficulty);
    }

    public aspectOfRegressionRace() {
        this(Difficulty.EXTREME);
        this.applyDefaultCustomAttributeModifiers();
        this.applyDefaultAttributeModifiers();
    }

    public RaceConfig.Default getDefaultConfig() {
        return CONFIG;
    }
    
    public StarlightCommon.RaceDefault getAttributeDefaultConfig() {
        return CONFIG;
    }

    public Alignment getAlignment() {
        return Alignment.MAJIN;
    }

    public @Nullable ManasRace getDefaultEvolution(ManasRaceInstance instance, LivingEntity entity) {
        return StarlightRaces.MYTHOS.get();
    }

    public @Nullable ManasRace getAwakeningEvolution(ManasRaceInstance instance, LivingEntity entity) {
        return null;
    }

    public @Nullable ManasRace getHarvestFestivalEvolution(ManasRaceInstance instance, LivingEntity entity) {
        return null;
    }

    public List<ManasRace> getNextEvolutions(ManasRaceInstance instance, LivingEntity entity) {
        if (entity.getMaxHealth() >= 500) {
            return List.of(StarlightRaces.MYTHOS.get());
        } else {
            return List.of();
        }
    }

    public Map<EvolutionRequirement, Float> getEvolutionRequirements(ManasRaceInstance previous, LivingEntity entity) {
        return Map.of(new EvolutionRequirement.EPRequirement(CONFIG.epRequirement), 100.0F);
    }

    public List<ManasSkill> getIntrinsicSkills(ManasRaceInstance instance, LivingEntity entity) {
        return CONFIG.intrinsics.stream()
                .map(id -> (ManasSkill) SkillAPI.getSkillRegistry().get(ResourceLocation.parse(id)))
                .filter(Objects::nonNull)
                .toList();
    }

    public List<TensuraSkill> getIntrinsicLearnable(ManasRaceInstance instance, LivingEntity entity) {
        return CONFIG.learnableIntrinsics.stream()
                .map((id) -> SkillAPI.getSkillRegistry().get(ResourceLocation.parse(id)))
                .filter((skill) -> skill instanceof TensuraSkill)
                .map((skill) -> (TensuraSkill)skill)
                .toList();
    }

    @Override
    public void onRaceEvolution(ManasRaceInstance instance, LivingEntity entity, ManasRaceInstance evolution) {
        // Place Lethe evolution trigger here.
        if (SkillUtils.isSkillMastered(entity, StarlightUniqueSkills.VESTIGES_OF_EIDOLONS.get()) && SkillUtils.isSkillMastered(entity, StarlightUniqueSkills.REMNANTS_OF_ASCENSION.get()) && SkillUtils.isSkillMastered(entity, ExtraSkills.LAW_MANIPULATION.get())) {
            if (!SkillUtils.hasSkillFully(entity, StarlightUltimateSkills.LETHE.get())) {
                TensuraSkillInstance skill = new TensuraSkillInstance(StarlightUltimateSkills.LETHE.get());
                skill.getOrCreateTag().putBoolean("NoMagiculeCost", true);
                SkillHelper.learnSkill(entity, skill);
            }
        }
    }
}
