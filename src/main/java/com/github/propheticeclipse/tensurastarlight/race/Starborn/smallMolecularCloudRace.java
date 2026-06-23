package com.github.propheticeclipse.tensurastarlight.race.Starborn;

import com.github.propheticeclipse.tensurastarlight.config.StarlightCommon;
import com.github.propheticeclipse.tensurastarlight.config.races.aspectBornRaceConfig;
import com.github.propheticeclipse.tensurastarlight.config.races.starbornRaceConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.aspectSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.race.StarlightRace;
import com.github.propheticeclipse.tensurastarlight.registry.StarlightRaces;
import com.github.propheticeclipse.tensurastarlight.registry.attachments.StarlightAttachments;
import com.github.propheticeclipse.tensurastarlight.registry.attachments.StarlightPlayerAttachments;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.race.api.ManasRace;
import io.github.manasmods.manascore.race.api.ManasRaceInstance;
import io.github.manasmods.manascore.skill.api.ManasSkill;
import io.github.manasmods.manascore.skill.api.SkillAPI;
import io.github.manasmods.tensura.ability.TensuraSkill;
import io.github.manasmods.tensura.config.race.DaemonConfig;
import io.github.manasmods.tensura.config.race.RaceConfig;
import io.github.manasmods.tensura.race.RaceUtils;
import io.github.manasmods.tensura.registry.race.TensuraRaces;
import io.github.manasmods.tensura.registry.sound.TensuraSoundEvents;
import io.github.manasmods.tensura.storage.Alignment;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class smallMolecularCloudRace extends StarlightRace {
    private static final starbornRaceConfig.smallMolecularCloud CONFIG = ConfigRegistry.getConfig(starbornRaceConfig.class).smallMolecularCloud;
    public static final ResourceLocation SMALL_MOLECULAR_CLOUD = ResourceLocation.fromNamespaceAndPath("trstarlight", "small_molecular_cloud");

    public smallMolecularCloudRace(Difficulty difficulty) {
        super(difficulty);
    }

    public smallMolecularCloudRace() {
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
        return StarlightRaces.LARGE_MOLECULAR_CLOUD.get();
    }

    public @Nullable ManasRace getAwakeningEvolution(ManasRaceInstance instance, LivingEntity entity) {
        return StarlightRaces.STARDUST.get();
    }

    public @Nullable ManasRace getHarvestFestivalEvolution(ManasRaceInstance instance, LivingEntity entity) {
        return StarlightRaces.LARGE_MOLECULAR_CLOUD.get();
    }

    public List<ManasRace> getNextEvolutions(ManasRaceInstance instance, LivingEntity entity) {
        List<ManasRace> list = new ArrayList();
        list.add(StarlightRaces.LARGE_MOLECULAR_CLOUD.get());
        return list;
    }

    public List<ManasSkill> getIntrinsicSkills(ManasRaceInstance instance, LivingEntity entity) {
        return CONFIG.intrinsics.stream()
                .map(id -> SkillAPI.getSkillRegistry().get(ResourceLocation.parse(id)))
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

    public void onActivateAbility(ManasRaceInstance instance, LivingEntity entity) {
        if (entity instanceof Player player) {
            if (!player.isSpectator() && !player.isCreative()) {
                if (player.getAbilities().mayfly) {
                    if (RaceUtils.canStillFly(player, true, true, false)) {
                        return;
                    }

                    player.getAbilities().mayfly = false;
                    player.getAbilities().flying = false;
                    player.getAbilities().setFlyingSpeed(0.05F);
                } else {
                    player.getAbilities().mayfly = true;
                    player.getAbilities().flying = true;
                    player.getAbilities().setFlyingSpeed(1.0F);
                }

                player.onUpdateAbilities();
            }
        }
    }
}
