package com.github.propheticeclipse.tensurastarlight.race.Starborn;

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

public class stardustRace extends largeMolecularCloudRace {
    private static final starbornRaceConfig.stardust CONFIG = ConfigRegistry.getConfig(starbornRaceConfig.class).stardust;
    public static final ResourceLocation STARDUST = ResourceLocation.fromNamespaceAndPath("trstarlight", "stardust");

    public stardustRace(Difficulty difficulty) {
        super(difficulty);
    }

    public stardustRace() {
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
        return Alignment.DEFAULT;
    }

    public @Nullable ManasRace getDefaultEvolution(ManasRaceInstance instance, LivingEntity entity) {
        return StarlightRaces.SMALL_METEOROID.get();
    }

    public @Nullable ManasRace getAwakeningEvolution(ManasRaceInstance instance, LivingEntity entity) {
        return StarlightRaces.LARGE_METEOROID.get();
    }

    public @Nullable ManasRace getHarvestFestivalEvolution(ManasRaceInstance instance, LivingEntity entity) {
        return StarlightRaces.SMALL_METEOROID.get();
    }

    public List<ManasRace> getNextEvolutions(ManasRaceInstance instance, LivingEntity entity) {
        List<ManasRace> list = new ArrayList();
        list.add(StarlightRaces.SMALL_METEOROID.get());
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
