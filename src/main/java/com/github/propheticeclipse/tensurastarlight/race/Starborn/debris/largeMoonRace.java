package com.github.propheticeclipse.tensurastarlight.race.Starborn.debris;

import com.github.propheticeclipse.tensurastarlight.config.StarlightCommon;
import com.github.propheticeclipse.tensurastarlight.config.races.starbornRaceConfig;
import com.github.propheticeclipse.tensurastarlight.registry.StarlightRaces;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.race.api.ManasRace;
import io.github.manasmods.manascore.race.api.ManasRaceInstance;
import io.github.manasmods.manascore.skill.api.ManasSkill;
import io.github.manasmods.manascore.skill.api.SkillAPI;
import io.github.manasmods.tensura.ability.TensuraSkill;
import io.github.manasmods.tensura.config.race.RaceConfig;
import io.github.manasmods.tensura.storage.Alignment;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class largeMoonRace extends smallMoonRace {
    private static final starbornRaceConfig.largeMoon CONFIG = ConfigRegistry.getConfig(starbornRaceConfig.class).largeMoon;
    public static final ResourceLocation LARGE_MOON = ResourceLocation.fromNamespaceAndPath("trstarlight", "large_moon");

    public largeMoonRace(Difficulty difficulty) {
        super(difficulty);
    }

    public largeMoonRace() {
        this(Difficulty.HARD);
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
        return StarlightRaces.SMALL_MOLECULAR_CLOUD.get();
    }

    public @Nullable ManasRace getAwakeningEvolution(ManasRaceInstance instance, LivingEntity entity) {
        return StarlightRaces.SMALL_MOLECULAR_CLOUD.get();
    }

    public @Nullable ManasRace getHarvestFestivalEvolution(ManasRaceInstance instance, LivingEntity entity) {
        return StarlightRaces.SMALL_MOLECULAR_CLOUD.get();
    }

    public List<ManasRace> getNextEvolutions(ManasRaceInstance instance, LivingEntity entity) {
        List<ManasRace> list = new ArrayList();
        return list;
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
}
