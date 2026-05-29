package com.github.propheticeclipse.tensurastarlight.race.personal.aspectborn.convergence;

import com.github.propheticeclipse.tensurastarlight.ability.skill.unique.evolvedUnique.VestigesOfEidolonsSkill;
import com.github.propheticeclipse.tensurastarlight.config.StarlightCommon;
import com.github.propheticeclipse.tensurastarlight.config.races.aspectBornRaceConfig;
import com.github.propheticeclipse.tensurastarlight.registry.StarlightRaces;
import com.github.propheticeclipse.tensurastarlight.registry.attachments.StarlightAttachments;
import com.github.propheticeclipse.tensurastarlight.registry.attachments.StarlightPlayerAttachments;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.race.api.ManasRace;
import io.github.manasmods.manascore.race.api.ManasRaceInstance;
import io.github.manasmods.manascore.race.api.RaceAPI;
import io.github.manasmods.manascore.race.api.Races;
import io.github.manasmods.manascore.skill.api.ManasSkill;
import io.github.manasmods.manascore.skill.api.SkillAPI;
import io.github.manasmods.tensura.client.TensuraClient;
import io.github.manasmods.tensura.config.race.RaceConfig;
import io.github.manasmods.tensura.item.misc.ResetScrollItem;
import io.github.manasmods.tensura.menu.ReincarnationMenu;
import io.github.manasmods.tensura.race.template.EvolutionRequirement;
import io.github.manasmods.tensura.storage.Alignment;
import io.github.manasmods.tensura.storage.TensuraStorages;
import io.github.manasmods.tensura.storage.ep.IExistence;
import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class elderConvergenceBornRace extends greaterConvergenceBornRace {
    public elderConvergenceBornRace(Difficulty difficulty) {
        super(difficulty);
    }

    public elderConvergenceBornRace() {
        this(Difficulty.EXTREME);
        this.applyDefaultCustomAttributeModifiers();
        this.applyDefaultAttributeModifiers();
    }

    public RaceConfig.Default getDefaultConfig() {
        return (ConfigRegistry.getConfig(aspectBornRaceConfig.class)).elderConvergenceBorn;
    }
    
    public StarlightCommon.RaceDefault getAttributeDefaultConfig() {
        return (ConfigRegistry.getConfig(aspectBornRaceConfig.class)).elderConvergenceBorn;
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
        return List.of(StarlightRaces.FALSE_ASPECT_OF_REGRESSION.get());
    }

    @Override
    public void onRaceEvolution(ManasRaceInstance raceInstance, LivingEntity entity, ManasRaceInstance evolution) {
        // Move this function to elder and delay it significantly, maybe add some shlore smore to it? Dunno, Either way, it works, SHIP IT BITCHES!
        if (entity instanceof ServerPlayer player) {
            StarlightPlayerAttachments data = player.getData(StarlightAttachments.STARLIGHT_PLAYER_ATTACHMENT.get());
            data.setAspectbornFalseReset(true);
            IExistence existence = TensuraStorages.getExistenceFrom(entity);

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
                ReincarnationMenu.setRace(player, StarlightRaces.LESSER_ASPECT_BORN.get(), true, false);
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

    public Map<EvolutionRequirement, Float> getEvolutionRequirements(ManasRaceInstance previous, LivingEntity entity) {
        return Map.of(new EvolutionRequirement.EPRequirement((ConfigRegistry.getConfig(aspectBornRaceConfig.class)).elderConvergenceBorn.epRequirement), 100.0F);
    }

    public List<ManasSkill> getIntrinsicSkills(ManasRaceInstance instance, LivingEntity entity) {
        return ConfigRegistry.getConfig(aspectBornRaceConfig.class)
                .elderConvergenceBorn.elderConvergenceBornIntrinsics.stream()
                .map(id -> (ManasSkill) SkillAPI.getSkillRegistry().get(ResourceLocation.parse(id)))
                .filter(Objects::nonNull)
                .toList();
    }
}
