package com.github.propheticeclipse.tensurastarlight.race.personal.aspectborn.trueAspect.memoryAspect.mythos;

import com.github.propheticeclipse.tensurastarlight.config.StarlightCommon;
import com.github.propheticeclipse.tensurastarlight.config.races.aspectBornRaceConfig;
import com.github.propheticeclipse.tensurastarlight.race.personal.aspectborn.trueAspect.memoryAspect.grandMemoryBornRace;
import com.github.propheticeclipse.tensurastarlight.race.personal.aspectborn.trueAspect.memoryAspect.greaterMemoryBornRace;
import com.github.propheticeclipse.tensurastarlight.registry.StarlightRaces;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.race.api.ManasRace;
import io.github.manasmods.manascore.race.api.ManasRaceInstance;
import io.github.manasmods.manascore.skill.api.ManasSkill;
import io.github.manasmods.manascore.skill.api.SkillAPI;
import io.github.manasmods.tensura.config.race.RaceConfig;
import io.github.manasmods.tensura.race.template.EvolutionRequirement;
import io.github.manasmods.tensura.storage.Alignment;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class aspectOfRegressionRace extends grandMemoryBornRace {
    public aspectOfRegressionRace(Difficulty difficulty) {
        super(difficulty);
    }

    public aspectOfRegressionRace() {
        this(Difficulty.EXTREME);
        this.applyDefaultCustomAttributeModifiers();
        this.applyDefaultAttributeModifiers();
    }

    public RaceConfig.Default getDefaultConfig() {
        return (ConfigRegistry.getConfig(aspectBornRaceConfig.class)).aspectOfRegression;
    }
    
    public StarlightCommon.RaceDefault getAttributeDefaultConfig() {
        return (ConfigRegistry.getConfig(aspectBornRaceConfig.class)).aspectOfRegression;
    }

    public Alignment getAlignment() {
        return Alignment.MAJIN;
    }

    public @Nullable ManasRace getDefaultEvolution(ManasRaceInstance instance, LivingEntity entity) {
        return null;
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
        return Map.of(new EvolutionRequirement.EPRequirement((ConfigRegistry.getConfig(aspectBornRaceConfig.class)).aspectOfRegression.epRequirement), 100.0F);
    }

    public List<ManasSkill> getIntrinsicSkills(ManasRaceInstance instance, LivingEntity entity) {
        return ConfigRegistry.getConfig(aspectBornRaceConfig.class)
                .aspectOfRegression.aspectOfRegressionIntrinsics.stream()
                .map(id -> (ManasSkill) SkillAPI.getSkillRegistry().get(ResourceLocation.parse(id)))
                .filter(Objects::nonNull)
                .toList();
    }
}
