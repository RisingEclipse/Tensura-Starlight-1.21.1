package com.github.propheticeclipse.tensurastarlight.utils;

import com.sammy.malum.common.data.attachment.ProgressionData;
import com.sammy.malum.registry.common.MalumAttachmentTypes;
import io.github.manasmods.manascore.race.api.SpawnPointHelper;
import io.github.manasmods.tensura.data.TensuraTags;
import io.github.manasmods.tensura.util.EnergyHelper;
import io.github.manasmods.tensura.util.ObjectSelectionHelper;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
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
import java.util.Random;
import java.util.stream.StreamSupport;

public class StarlightUtils {

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
                            ItemStack copy = stack.copy();
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
                    ItemStack copy = heldItem.copy();
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


    public static void CreateRandomEngraveInHand(LivingEntity entity, int level, double successRate, double destroyRate, int randomEnchantTriggers, double costAP, double costMP, List<String> config) {
        if (entity instanceof Player player && !EnergyHelper.isOutOfEnergy(entity, costAP, costMP)) {
            ItemStack heldItem = player.getMainHandItem();
            if (heldItem.isEmpty()) {
                player.displayClientMessage(Component.literal("You must hold an item to enchant!"), true);
                return;
            }

            Registry<Enchantment> registry = player.level().registryAccess()
                    .registryOrThrow(Registries.ENCHANTMENT);

            List<Holder<Enchantment>> allEngraves = StreamSupport.stream(
                    registry.getTagOrEmpty(TensuraTags.Enchantments.ENGRAVING).spliterator(),
                    false
            ).filter(holder -> holder.unwrapKey()
                    .map(ResourceKey::location)
                    .map(id -> !config.contains(id.toString()))
                    .orElse(true)
            ).toList();

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
}
