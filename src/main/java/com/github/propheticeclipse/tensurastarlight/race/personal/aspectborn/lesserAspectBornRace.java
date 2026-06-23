package com.github.propheticeclipse.tensurastarlight.race.personal.aspectborn;

import com.github.propheticeclipse.tensurastarlight.config.StarlightCommon;
import com.github.propheticeclipse.tensurastarlight.config.races.aspectBornRaceConfig;
import com.github.propheticeclipse.tensurastarlight.config.races.starbornRaceConfig;
import com.github.propheticeclipse.tensurastarlight.race.StarlightRace;
import com.github.propheticeclipse.tensurastarlight.registry.StarlightRaces;
import com.sammy.malum.common.data.attachment.ProgressionData;
import com.sammy.malum.registry.common.MalumAttachmentTypes;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.race.api.ManasRace;
import io.github.manasmods.manascore.race.api.ManasRaceInstance;
import io.github.manasmods.manascore.skill.api.ManasSkill;
import io.github.manasmods.manascore.skill.api.SkillAPI;
import io.github.manasmods.tensura.ability.TensuraSkill;
import io.github.manasmods.tensura.ability.magic.Element;
import io.github.manasmods.tensura.ability.magic.spiritual.SpiritualMagic;
import io.github.manasmods.tensura.config.race.RaceConfig;
import io.github.manasmods.tensura.race.template.EvolutionRequirement;
import io.github.manasmods.tensura.registry.race.TensuraRaces;
import io.github.manasmods.tensura.storage.Alignment;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class lesserAspectBornRace extends StarlightRace {
    private static final aspectBornRaceConfig.lesserAspectBorn CONFIG = ConfigRegistry.getConfig(aspectBornRaceConfig.class).lesserAspectBorn;

    public lesserAspectBornRace(Difficulty difficulty) {
        super(difficulty);
    }

    public lesserAspectBornRace() {
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
        return StarlightRaces.ASPECT_BORN.get();
    }

    public @Nullable ManasRace getAwakeningEvolution(ManasRaceInstance instance, LivingEntity entity) {
        return StarlightRaces.GREATER_ASPECT_BORN.get();
    }

    public @Nullable ManasRace getHarvestFestivalEvolution(ManasRaceInstance instance, LivingEntity entity) {
        return StarlightRaces.ASPECT_BORN.get();
    }

    public List<ManasRace> getNextEvolutions(ManasRaceInstance instance, LivingEntity entity) {
        return List.of(StarlightRaces.ASPECT_BORN.get());
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

    public double getElementalSpiritsChance(Element element, SpiritualMagic.SpiritLevel level) {
        if (element == Element.LIGHT) {
            double var10000;
            switch (level) {
                case LESSER -> var10000 = 0.0;
                case MEDIUM -> var10000 = 45.0;
                case GREATER -> var10000 = 35.0;
                case LORD -> var10000 = 20.0;
                default -> throw new MatchException(null, null);
            }

            return var10000;
        }
        return super.getElementalSpiritsChance(element, level);
    }
}
