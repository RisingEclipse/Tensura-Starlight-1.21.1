package com.github.propheticeclipse.tensurastarlight.mixin.client;

import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.world.level.ItemLike;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

import java.util.Arrays;

@Mixin(ItemRenderer.class)
public abstract class MixinItemRendererFix {
    
    @ModifyArg(
        method = "<init>(Lnet/minecraft/client/Minecraft;Lnet/minecraft/client/renderer/texture/TextureManager;Lnet/minecraft/client/resources/model/ModelManager;Lnet/minecraft/client/color/item/ItemColors;Lnet/minecraft/client/renderer/BlockEntityWithoutLevelRenderer;)V",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/client/color/item/ItemColors;register(Lnet/minecraft/world/item/ItemColor;[Lnet/minecraft/world/level/ItemLike;)V"
        ),
        index = 1
    )
    private ItemLike[] filterNullItems(ItemLike[] items) {
        if (items == null) {
            return new ItemLike[0];
        }
        
        ItemLike[] filtered = Arrays.stream(items)
            .filter(item -> item != null)
            .toArray(ItemLike[]::new);
        
        return filtered.length > 0 ? filtered : new ItemLike[0];
    }
}

