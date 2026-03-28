package com.github.propheticeclipse.tensurastarlight.race.personal.aspectborn.trueAspect.memoryAspect;

import com.github.propheticeclipse.tensurastarlight.ability.skill.unique.evolvedUnique.VestigesOfEidolonsSkill;
import com.github.propheticeclipse.tensurastarlight.config.StarlightCommon;
import com.github.propheticeclipse.tensurastarlight.config.races.aspectBornRaceConfig;
import com.github.propheticeclipse.tensurastarlight.registry.StarlightRaces;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.race.api.ManasRace;
import io.github.manasmods.manascore.race.api.ManasRaceInstance;
import io.github.manasmods.manascore.skill.api.ManasSkill;
import io.github.manasmods.manascore.skill.api.SkillAPI;
import io.github.manasmods.tensura.config.race.RaceConfig;
import io.github.manasmods.tensura.item.misc.ResetScrollItem;
import io.github.manasmods.tensura.menu.ReincarnationMenu;
import io.github.manasmods.tensura.race.template.EvolutionRequirement;
import io.github.manasmods.tensura.storage.Alignment;
import io.github.manasmods.tensura.storage.TensuraStorages;
import io.github.manasmods.tensura.storage.ep.IExistence;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class grandMemoryBornRace extends greaterMemoryBornRace {
    public grandMemoryBornRace(Difficulty difficulty) {
        super(difficulty);
    }

    public grandMemoryBornRace() {
        this(Difficulty.EXTREME);
        this.applyDefaultCustomAttributeModifiers();
        this.applyDefaultAttributeModifiers();
    }

    public RaceConfig.Default getDefaultConfig() {
        return (ConfigRegistry.getConfig(aspectBornRaceConfig.class)).grandMemoryBorn;
    }
    
    public StarlightCommon.RaceDefault getAttributeDefaultConfig() {
        return (ConfigRegistry.getConfig(aspectBornRaceConfig.class)).grandMemoryBorn;
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
        return List.of(StarlightRaces.ASPECT_OF_REGRESSION.get());
    }

    public Map<EvolutionRequirement, Float> getEvolutionRequirements(ManasRaceInstance previous, LivingEntity entity) {
        return Map.of(new EvolutionRequirement.EPRequirement((ConfigRegistry.getConfig(aspectBornRaceConfig.class)).grandMemoryBorn.epRequirement), 100.0F);
    }

    @Override
    public void onRaceEvolution(ManasRaceInstance instance, LivingEntity entity, ManasRaceInstance evolution) {
        if (entity instanceof ServerPlayer player) {
            IExistence existence = TensuraStorages.getExistenceFrom(entity);

            // Replace logic with a de-obfuscated variant of all of this text.
            // Expected Results: Reset Name, Owner, Race (To Aspect of Regression), Skills


            player.displayClientMessage(
                    Component.translatable(
                            "trstarlight.race.false_aspect0",
                            player.getDisplayName()
                            //arg 1
                    ).withStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)),
                    false
            );
            player.displayClientMessage(
                    Component.translatable(
                            "trstarlight.race.false_aspect1"
                            //arg 1
                    ).withStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)),
                    false
            );
            player.displayClientMessage(
                    Component.translatable(
                            "trstarlight.race.false_aspect2"
                            //arg 1
                    ).withStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)),
                    false
            );
            VestigesOfEidolonsSkill.DelayedTask.run(200, () -> {
                existence.setName(null);
                existence.setPermanentOwner(null);
                existence.markDirty();
                ResetScrollItem.resetSkill(player, false);
                ReincarnationMenu.setRace(player, StarlightRaces.ASPECT_OF_REGRESSION.get(), true, false);
                player.displayClientMessage(
                        Component.translatable(
                                "trstarlight.race.false_aspect3"
                                //arg 1
                        ).withStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)),
                        false
                );
            });
        }
    }

    public List<ManasSkill> getIntrinsicSkills(ManasRaceInstance instance, LivingEntity entity) {
        return ConfigRegistry.getConfig(aspectBornRaceConfig.class)
                .grandMemoryBorn.grandMemoryBornIntrinsics.stream()
                .map(id -> (ManasSkill) SkillAPI.getSkillRegistry().get(ResourceLocation.parse(id)))
                .filter(Objects::nonNull)
                .toList();
    }
}
