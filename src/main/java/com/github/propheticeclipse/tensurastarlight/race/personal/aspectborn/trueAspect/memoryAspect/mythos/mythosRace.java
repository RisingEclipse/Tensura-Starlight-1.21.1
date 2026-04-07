package com.github.propheticeclipse.tensurastarlight.race.personal.aspectborn.trueAspect.memoryAspect.mythos;

import com.github.propheticeclipse.tensurastarlight.config.StarlightCommon;
import com.github.propheticeclipse.tensurastarlight.config.races.aspectBornRaceConfig;
import com.github.propheticeclipse.tensurastarlight.race.personal.aspectborn.trueAspect.memoryAspect.grandMemoryBornRace;
import com.github.propheticeclipse.tensurastarlight.registry.StarlightRaces;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUniqueSkills;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.network.api.util.Changeable;
import io.github.manasmods.manascore.race.api.ManasRace;
import io.github.manasmods.manascore.race.api.ManasRaceInstance;
import io.github.manasmods.manascore.skill.api.ManasSkill;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.manascore.skill.api.SkillAPI;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.ability.skill.Skill;
import io.github.manasmods.tensura.ability.skill.unique.PredatorSkill;
import io.github.manasmods.tensura.config.race.HumanConfig;
import io.github.manasmods.tensura.config.race.RaceConfig;
import io.github.manasmods.tensura.data.TensuraSkillTags;
import io.github.manasmods.tensura.entity.TensuraProjectile;
import io.github.manasmods.tensura.entity.magic.beam.PredatorMistProjectile;
import io.github.manasmods.tensura.race.template.EvolutionRequirement;
import io.github.manasmods.tensura.registry.TensuraStats;
import io.github.manasmods.tensura.registry.skill.UniqueSkills;
import io.github.manasmods.tensura.storage.Alignment;
import io.github.manasmods.tensura.world.TensuraGameRules;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class mythosRace extends aspectOfRegressionRace {
    public mythosRace(Difficulty difficulty) {
        super(difficulty);
    }

    public mythosRace() {
        this(Difficulty.EXTREME);
        this.applyDefaultCustomAttributeModifiers();
        this.applyDefaultAttributeModifiers();
    }

    public RaceConfig.Default getDefaultConfig() {
        return (ConfigRegistry.getConfig(aspectBornRaceConfig.class)).mythos;
    }
    
    public StarlightCommon.RaceDefault getAttributeDefaultConfig() {
        return (ConfigRegistry.getConfig(aspectBornRaceConfig.class)).mythos;
    }

    public Alignment getAlignment() {
        return Alignment.HOLY;
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
        return List.of();
    }

    public Map<EvolutionRequirement, Float> getEvolutionRequirements(ManasRaceInstance previous, LivingEntity entity) {
        aspectBornRaceConfig.mythos config = (ConfigRegistry.getConfig(aspectBornRaceConfig.class)).mythos;
        return Map.of(new EvolutionRequirement() {
            public float getProgress(ManasRaceInstance raceInstance, LivingEntity entity) {
                float progress = 0.0F;
                // Boss Kills, Sufficient EP (as designated by config), Some other shit?
                if (SkillUtils.isSkillMastered(entity, StarlightUniqueSkills.VESTIGES_OF_EIDOLONS.get())) {
                    progress += 0.05F;
                }
                // 5%
                if (SkillUtils.isSkillMastered(entity, StarlightUniqueSkills.REMNANTS_OF_ASCENSION.get())) {
                    progress += 0.05F;
                }
                // 10%
                if (entity instanceof Player player) {
                    if (TensuraStats.getBossDefeated(player) != 0) {
                        int bossesMurked = TensuraStats.getBossDefeated(player);
                        double maxBossProgress = 0.5F;
                        double bossProgress = bossesMurked * 0.05F;

                        if (bossProgress > maxBossProgress) {
                            bossProgress = maxBossProgress;
                        }

                        progress += bossProgress;
                    }
                }
                // 60% Further Below is commented out until guaranteed functionality.
                /*
                List<ManasSkill> targetSkills = SkillAPI.getSkillsFrom(entity).getLearnedSkills().stream().filter((instance) -> ultimateSkillFilter(instance)).toList();
                for (ManasSkill targetInstance : targetSkills) {
                    if (SkillUtils.hasSkillFully(entity, targetInstance) && progress < 1.0F) {
                        progress += 0.1F;
                    }
                }
                 */
                progress += 0.4F;

                return progress;
            }

            public Component getRequirementComponent(ManasRaceInstance instance, LivingEntity entity) {
                return Component.translatable("trstarlight.evolution_menu.mythos_requirements");
            }
        }, 90.0F, new EvolutionRequirement.EPRequirement(config.epRequirement), 10.0F);
    }

    protected boolean ultimateSkillFilter(ManasSkillInstance instance) {
        if (!instance.isTemporarySkill() && !(instance.getMastery() < (double)0.0F)) {
                ManasSkill var5 = instance.getSkill();
                Skill devouredSkill = (Skill)var5;

                return devouredSkill.getType().equals(Skill.SkillType.ULTIMATE);

        } else {
            return false;
        }
    }

    public List<ManasSkill> getIntrinsicSkills(ManasRaceInstance instance, LivingEntity entity) {
        return ConfigRegistry.getConfig(aspectBornRaceConfig.class)
                .mythos.intrinsics.stream()
                .map(id -> (ManasSkill) SkillAPI.getSkillRegistry().get(ResourceLocation.parse(id)))
                .filter(Objects::nonNull)
                .toList();
    }
}
