package com.github.propheticeclipse.tensurastarlight.utils;

import com.github.propheticeclipse.tensurastarlight.config.StarlightCommon;
import com.github.propheticeclipse.tensurastarlight.registry.StarlightRaces;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUltimateSkills;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUniqueSkills;
import com.sammy.malum.common.data.attachment.ProgressionData;
import com.sammy.malum.registry.common.MalumAttachmentTypes;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.race.api.ManasRaceInstance;
import io.github.manasmods.manascore.race.api.RaceAPI;
import io.github.manasmods.manascore.race.api.Races;
import io.github.manasmods.manascore.race.api.SpawnPointHelper;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.data.TensuraTags;
import io.github.manasmods.tensura.registry.effect.TensuraMobEffects;
import io.github.manasmods.tensura.storage.TensuraStorages;
import io.github.manasmods.tensura.storage.ep.IExistence;
import io.github.manasmods.tensura.util.EnergyHelper;
import io.github.manasmods.tensura.util.ObjectSelectionHelper;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.StreamSupport;

public class StarlightUtils {
    private static final StarlightCommon.GlobalLists CONFIG = ConfigRegistry.getConfig(StarlightCommon.class).GlobalLists;

    public static void TeleportToSpawnpoint(LivingEntity player) {
        if (player instanceof ServerPlayer serverPlayer) {
            ResourceKey<Level> spawnDim = serverPlayer.getRespawnDimension();
            ServerLevel dimLevel = player.getServer().getLevel(spawnDim);

            if (serverPlayer.getRespawnPosition() != null) {
                double spawnX = serverPlayer.getRespawnPosition().getX();
                double spawnY = serverPlayer.getRespawnPosition().getY();
                double spawnZ = serverPlayer.getRespawnPosition().getZ();

                SpawnPointHelper.teleportToAcrossDimensions(serverPlayer, dimLevel, spawnX, spawnY, spawnZ, 0, 0);
            } else {
                serverPlayer.displayClientMessage(Component.translatable("trstarlight.generic.spawnpoint_not_located").setStyle(Style.EMPTY.withColor(ChatFormatting.DARK_PURPLE)), false);
            }
        }
    }

    public static boolean rejectedByWell(LivingEntity entity) {
        ProgressionData progression = entity.getData(MalumAttachmentTypes.PROGRESSION_DATA);
        return progression.hasBeenRejected;
    }

    public static void DupeTargetBlock(LivingEntity entity, double range, double successRate, double destroyRate, int copies, double costAP, double costMP) {
        if (entity instanceof Player player && !EnergyHelper.isOutOfEnergy(entity, costAP, costMP)) {
            Level level = player.level();
            BlockHitResult blockTarget = ObjectSelectionHelper.getPlayerPOVHitResult(level, entity, ClipContext.Fluid.NONE, range);
            BlockPos position = blockTarget.getBlockPos();
            BlockState state = level.getBlockState(position);
            Block block = state.getBlock();

            if (level instanceof ServerLevel serverLevel && !state.isAir()) {

                LootParams.Builder paramsBuilder = new LootParams.Builder(serverLevel)
                        .withParameter(LootContextParams.ORIGIN, Vec3.atCenterOf(position))
                        .withParameter(LootContextParams.TOOL, ItemStack.EMPTY)
                        .withOptionalParameter(LootContextParams.BLOCK_STATE, state)
                        .withOptionalParameter(LootContextParams.THIS_ENTITY, entity);

                LootContext.Builder builder = new LootContext.Builder(paramsBuilder.create(LootContextParamSets.BLOCK));
                List<ItemStack> drops = block.defaultBlockState().getDrops(paramsBuilder);

                if (!drops.isEmpty()) {
                    for (int i = 0; i <= copies; i++) {
                        if (entity.getRandom().nextDouble() < successRate) {
                            ItemStack stack = (ItemStack) drops.get(entity.getRandom().nextInt(drops.size()));
                            ItemStack copy = stack.copyWithCount(1);
                            entity.spawnAtLocation(copy);
                        }
                    }
                }

                if (entity.getRandom().nextDouble() < destroyRate) {
                    level.setBlock(position, Blocks.AIR.defaultBlockState(), 1); // remove block
                }
            }
        }
    }

    public static void DupeHeldItem(LivingEntity entity, double successRate, double destroyRate, int copies, double costAP, double costMP) {
        if (entity instanceof Player player && !EnergyHelper.isOutOfEnergy(entity, costAP, costMP)) {
            ItemStack heldItem = player.getMainHandItem();

            for (int i = 0; i < copies; i++) {
                if (!heldItem.isEmpty() && entity.getRandom().nextDouble() < successRate) {
                    ItemStack copy = heldItem.copyWithCount(1);
                    // TEST ME
                    entity.spawnAtLocation(copy);
                }

                if (entity.getRandom().nextDouble() < destroyRate) {
                    heldItem.shrink(1);
                }
            }
        }
    }

    public static void CreateEngraveInHand(LivingEntity entity, ResourceKey<Enchantment> addedEnchant, int level, double successRate, double destroyRate, double costAP, double costMP) {
        if (entity instanceof Player player && !EnergyHelper.isOutOfEnergy(entity, costAP, costMP)) {
            Level playerLevel = player.level();
            Holder<Enchantment> holder = playerLevel.registryAccess()
                    .registryOrThrow(Registries.ENCHANTMENT)
                    .getHolder(addedEnchant)
                    .orElseThrow();

            ItemStack heldItem = player.getMainHandItem();
            if (heldItem.isEmpty()) {
                player.displayClientMessage(Component.literal("You must hold an item to enchant!"), true);
                return;
            }

            if (!heldItem.isEmpty() && entity.getRandom().nextDouble() < successRate) {
                heldItem.enchant(holder, level);
            }

            if (entity.getRandom().nextDouble() < destroyRate) {
                heldItem.shrink(1);
            }
            player.displayClientMessage(Component.literal("Your item has been enchanted with " + addedEnchant + "!"), true);

        }
    }


    public static void CreateRandomEngraveInHand(LivingEntity entity, int level, double successRate, double destroyRate, int randomEnchantTriggers, double costAP, double costMP, List<String> blacklistConfig) {
        if (entity instanceof Player player && !EnergyHelper.isOutOfEnergy(entity, costAP, costMP)) {
            ItemStack heldItem = player.getMainHandItem();
            if (heldItem.isEmpty()) {
                player.displayClientMessage(Component.literal("You must hold an item to enchant!"), true);
                return;
            }

            Registry<Enchantment> registry = player.level().registryAccess()
                    .registryOrThrow(Registries.ENCHANTMENT);

            List<Holder<Enchantment>> allEngraves = getFilteredEnchantTag(
                    registry,
                    TensuraTags.Enchantments.ENGRAVING,
                    blacklistConfig
            );

            if (allEngraves.isEmpty()) {
                player.displayClientMessage(Component.literal("No applicable engravements found for this item."), true);
                return;
            }

            for (int i = 0; i < randomEnchantTriggers; i++) {
                if (!heldItem.isEmpty() && entity.getRandom().nextDouble() < successRate) {
                    int randomChoice = new Random().nextInt(allEngraves.size());
                    Holder<Enchantment> selectedHolder = allEngraves.get(randomChoice);
                    heldItem.enchant(selectedHolder, level);
                    if (entity.getRandom().nextDouble() < destroyRate) {
                        heldItem.shrink(1);
                    }
                    player.displayClientMessage(Component.literal("Your weapon has been engraved with " + selectedHolder.getRegisteredName() + "!"), true);
                }
            }
        }
    }

    public static void CreateRandomEngraveInHand(LivingEntity entity, int level, double successRate, double destroyRate, int randomEnchantTriggers, double costAP, double costMP, List<String> blacklistConfig, List<String> whitelistConfig) {
        if (entity instanceof Player player && !EnergyHelper.isOutOfEnergy(entity, costAP, costMP)) {
            ItemStack heldItem = player.getMainHandItem();
            if (heldItem.isEmpty()) {
                player.displayClientMessage(Component.literal("You must hold an item to enchant!"), true);
                return;
            }

            Registry<Enchantment> registry = player.level().registryAccess()
                    .registryOrThrow(Registries.ENCHANTMENT);

            List<Holder<Enchantment>> allEngraves = getFilteredEnchantTag(
                    registry,
                    TensuraTags.Enchantments.ENGRAVING,
                    blacklistConfig,
                    whitelistConfig
            );

            if (allEngraves.isEmpty()) {
                player.displayClientMessage(Component.literal("No applicable engravements found for this item."), true);
                return;
            }

            for (int i = 0; i < randomEnchantTriggers; i++) {
                if (!heldItem.isEmpty() && entity.getRandom().nextDouble() < successRate) {
                    int randomChoice = new Random().nextInt(allEngraves.size());
                    Holder<Enchantment> selectedHolder = allEngraves.get(randomChoice);
                    heldItem.enchant(selectedHolder, level);
                    if (entity.getRandom().nextDouble() < destroyRate) {
                        heldItem.shrink(1);
                    }
                    player.displayClientMessage(Component.literal("Your weapon has been engraved with " + selectedHolder.getRegisteredName() + "!"), true);
                }
            }
        }
    }

    public static void applyTensuraEffect(ManasSkillInstance instance, LivingEntity target, RegistrySupplier<MobEffect> effect, int duration, int masteredAmplifier, int unmasteredAmplifier) {
        target.addEffect(new MobEffectInstance(TensuraMobEffects.getReference(effect), duration, instance.isMastered(target) ? masteredAmplifier : unmasteredAmplifier, false, false, false));
    }

    public static void applyTensuraEffect(LivingEntity target, RegistrySupplier<MobEffect> effect, int duration, int amplifier) {
        target.addEffect(new MobEffectInstance(TensuraMobEffects.getReference(effect), duration, amplifier, false, false, false));
    }

    public static void applyTensuraEffect(ManasSkillInstance instance, LivingEntity target, RegistrySupplier<MobEffect> effect, int duration, int masteredAmplifier, int unmasteredAmplifier, boolean ambient, boolean visible, boolean showIcon) {
        target.addEffect(new MobEffectInstance(TensuraMobEffects.getReference(effect), duration, instance.isMastered(target) ? masteredAmplifier : unmasteredAmplifier, ambient, visible, showIcon));
    }

    public static void applyTensuraEffect(ManasSkillInstance instance, LivingEntity target, RegistrySupplier<MobEffect> effect, int masteredDuration, int unmasteredDuration, int masteredAmplifier, int unmasteredAmplifier, boolean ambient, boolean visible, boolean showIcon) {
        target.addEffect(new MobEffectInstance(TensuraMobEffects.getReference(effect), instance.isMastered(target) ? masteredDuration : unmasteredDuration, instance.isMastered(target) ? masteredAmplifier : unmasteredAmplifier, ambient, visible, showIcon));
    }

    public static void applyTensuraEffect(ManasSkillInstance instance, LivingEntity target, RegistrySupplier<MobEffect> effect, int masteredDuration, int unmasteredDuration, int masteredAmplifier, int unmasteredAmplifier) {
        target.addEffect(new MobEffectInstance(TensuraMobEffects.getReference(effect), instance.isMastered(target) ? masteredDuration : unmasteredDuration, instance.isMastered(target) ? masteredAmplifier : unmasteredAmplifier));
    }

    public static void applyEffect(LivingEntity target, Holder<MobEffect> effect, int duration, int amplifier) {
        target.addEffect(new MobEffectInstance(effect, duration, amplifier, false, false, false));
    }

    public static List<MobEffectInstance> getFilteredEffects(Player player, List<String> blacklistConfig, List<String> whitelistConfig) {
        return player.getActiveEffects()
                .stream()
                .filter(effect -> {
                    ResourceLocation id = BuiltInRegistries.MOB_EFFECT.getKey(effect.getEffect().value());

                    return id != null && (whitelistConfig.isEmpty() || whitelistConfig.contains(id.toString())) && !blacklistConfig.contains(id.toString()) && !CONFIG.globalEffectBlacklist.contains(id.toString());
                })
                .toList();
    }

    public static List<MobEffectInstance> getFilteredEffects(Player player, List<String> blacklistConfig) {
        return player.getActiveEffects()
                .stream()
                .filter(effect -> {
                    ResourceLocation id = BuiltInRegistries.MOB_EFFECT.getKey(effect.getEffect().value());

                    return id != null && !blacklistConfig.contains(id.toString()) && !CONFIG.globalEffectBlacklist.contains(id.toString());
                })
                .toList();
    }

    public static List<Holder<Enchantment>> getFilteredEnchantTag(Registry<Enchantment> registry, TagKey<Enchantment> enchantTag, List<String> blacklistConfig) {
        return StreamSupport.stream(
                registry.getTagOrEmpty(enchantTag).spliterator(),
                false
        ).filter(holder -> holder.unwrapKey()
                .map(ResourceKey::location)
                .map(id -> !blacklistConfig.contains(id.toString()) && !CONFIG.globalEnchantmentBlacklist.contains(id.toString()))
                .orElse(true)
        ).toList();
    }

    public static List<Holder<Enchantment>> getFilteredEnchantTag(Registry<Enchantment> registry, TagKey<Enchantment> enchantTag, List<String> blacklistConfig, List<String> whitelistConfig) {
        return StreamSupport.stream(
                registry.getTagOrEmpty(enchantTag).spliterator(),
                false
        ).filter(holder -> holder.unwrapKey()
                .map(ResourceKey::location)
                .map(id -> (whitelistConfig.isEmpty() || whitelistConfig.contains(id.toString())) && !blacklistConfig.contains(id.toString()) && !CONFIG.globalEnchantmentBlacklist.contains(id.toString()))
                .orElse(true)
        ).toList();
    }

    public static boolean isLightRemainsMastered(LivingEntity entity) {
        return SkillUtils.isSkillMastered(entity, StarlightUniqueSkills.LIGHT_REMAINS.get());
    }

    public static boolean isLightRemainsAcquired(LivingEntity entity) {
        return SkillUtils.hasSkillPermanently(entity, StarlightUniqueSkills.LIGHT_REMAINS.get());
    }

    public static boolean isVestigesAcquired(LivingEntity entity) {
        return SkillUtils.hasSkillPermanently(entity, StarlightUniqueSkills.VESTIGES_OF_EIDOLONS.get());
    }

    public static boolean isRemnantsAcquired(LivingEntity entity) {
        return SkillUtils.hasSkillPermanently(entity, StarlightUniqueSkills.REMNANTS_OF_ASCENSION.get());
    }

    public static boolean isLetheAcquired(LivingEntity entity) {
        return SkillUtils.hasSkillPermanently(entity, StarlightUltimateSkills.LETHE.get());
    }

    public static boolean isLightMasteredOrVestigesAcquired(LivingEntity entity) {
        return isLightRemainsMastered(entity) && isVestigesAcquired(entity);
    }

    public static boolean readyAspectOfReality(LivingEntity entity) {
        return isLightRemainsMastered(entity) && SkillUtils.isSkillMastered(entity, StarlightUniqueSkills.ECHO_ENDURES.get()) && SkillUtils.isSkillMastered(entity, StarlightUniqueSkills.LIFE_RETURNS.get());
    }

    public static boolean readyAspectOfPower(LivingEntity entity) {
        IExistence existence = TensuraStorages.getExistenceFrom(entity);

        boolean egg = existence.isHeroEgg();
        boolean seed = existence.isDemonLordSeed();
        boolean seedOrEgg = egg || seed;
        return seedOrEgg && SkillUtils.isSkillMastered(entity, StarlightUniqueSkills.EMBER_REMAINS.get()) && SkillUtils.isSkillMastered(entity, StarlightUniqueSkills.CURRENT_UNBROKEN.get()) && SkillUtils.isSkillMastered(entity, StarlightUniqueSkills.SHAPE_FORGOTTEN.get());
    }

    public static boolean isAspectborn(LivingEntity entity) {
        return isEarlyAspectborn(entity) || isConvergenceAspectborn(entity) || isMemoryAspectborn(entity) || isMythos(entity);
    }

    public static boolean isConvergenceAspectborn(LivingEntity entity) {
        Races storage = RaceAPI.getRaceFrom(entity);
        Optional<ManasRaceInstance> optional = storage.getRace();
        if (optional.isPresent()) {
            ManasRaceInstance instance = optional.get();

            if (instance.getRace() == StarlightRaces.LESSER_CONVERGENCE_BORN.get()) {
                return true;
            }

            if (instance.getRace() == StarlightRaces.CONVERGENCE_BORN.get()) {
                return true;
            }

            if (instance.getRace() == StarlightRaces.GREATER_CONVERGENCE_BORN.get()) {
                return true;
            }

            if (instance.getRace() == StarlightRaces.ELDER_CONVERGENCE_BORN.get()) {
                return true;
            }
        }

        return false;
    }

    public static boolean isEarlyAspectborn(LivingEntity entity) {

        Races storage = RaceAPI.getRaceFrom(entity);
        Optional<ManasRaceInstance> optional = storage.getRace();
        if (optional.isPresent()) {
            ManasRaceInstance instance = optional.get();

            if (instance.getRace() == StarlightRaces.LESSER_ASPECT_BORN.get()) {
                return true;
            }

            if (instance.getRace() == StarlightRaces.ASPECT_BORN.get()) {
                return true;
            }

            if (instance.getRace() == StarlightRaces.GREATER_ASPECT_BORN.get()) {
                return true;
            }
        }

        return false;
    }

    public static boolean isMemoryAspectborn(LivingEntity entity) {
        Races storage = RaceAPI.getRaceFrom(entity);
        Optional<ManasRaceInstance> optional = storage.getRace();
        if (optional.isPresent()) {
            ManasRaceInstance instance = optional.get();

            if (instance.getRace() == StarlightRaces.LESSER_MEMORY_BORN.get()) {
                return true;
            }

            if (instance.getRace() == StarlightRaces.MEMORY_BORN.get()) {
                return true;
            }

            if (instance.getRace() == StarlightRaces.GREATER_MEMORY_BORN.get()) {
                return true;
            }

            if (instance.getRace() == StarlightRaces.GRAND_MEMORY_BORN.get()) {
                return true;
            }

            if (instance.getRace() == StarlightRaces.ASPECT_OF_REGRESSION.get()) {
                return true;
            }

            if (instance.getRace() == StarlightRaces.FALSE_ASPECT_OF_REGRESSION.get()) {
                return true;
            }
        }

        return false;
    }

    public static boolean isMythos(LivingEntity entity) {
        Races storage = RaceAPI.getRaceFrom(entity);
        Optional<ManasRaceInstance> optional = storage.getRace();
        if (optional.isPresent()) {
            ManasRaceInstance instance = optional.get();

            if (instance.getRace() == StarlightRaces.MYTHOS.get()) {
                return true;
            }

        }
        return false;
    }
}
