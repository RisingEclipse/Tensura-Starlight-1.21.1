package com.github.propheticeclipse.tensurastarlight.race.Starborn;

import com.github.propheticeclipse.tensurastarlight.config.StarlightCommon;
import com.github.propheticeclipse.tensurastarlight.config.races.starbornRaceConfig;
import com.github.propheticeclipse.tensurastarlight.race.StarlightRace;
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

public class largeMolecularCloudRace extends smallMolecularCloudRace {
    private static final starbornRaceConfig.largeMolecularCloud CONFIG = ConfigRegistry.getConfig(starbornRaceConfig.class).largeMolecularCloud;
    public static final ResourceLocation LARGE_MOLECULAR_CLOUD = ResourceLocation.fromNamespaceAndPath("trstarlight", "large_molecular_cloud");

    public largeMolecularCloudRace(Difficulty difficulty) {
        super(difficulty);
    }

    public largeMolecularCloudRace() {
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
        return StarlightRaces.STARDUST.get();
    }

    public @Nullable ManasRace getAwakeningEvolution(ManasRaceInstance instance, LivingEntity entity) {
        return StarlightRaces.STARDUST.get();
    }

    public @Nullable ManasRace getHarvestFestivalEvolution(ManasRaceInstance instance, LivingEntity entity) {
        return StarlightRaces.STARDUST.get();
    }

    public List<ManasRace> getNextEvolutions(ManasRaceInstance instance, LivingEntity entity) {
        List<ManasRace> list = new ArrayList();
        list.add(StarlightRaces.STARDUST.get());
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
