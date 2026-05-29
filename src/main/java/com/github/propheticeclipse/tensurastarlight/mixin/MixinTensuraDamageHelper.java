package com.github.propheticeclipse.tensurastarlight.mixin;

import com.hollingsworth.arsnouveau.api.util.DamageUtil;
import io.github.manasmods.tensura.damage.TensuraDamageHelper;
import net.minecraft.world.damagesource.DamageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({TensuraDamageHelper.class})
public class MixinTensuraDamageHelper {

    @Inject(
            at = {@At("HEAD")},
            method = {"isTensuraMagic(Lnet/minecraft/world/damagesource/DamageSource;)Z"},
            cancellable = true
    )
    private static void isTensuraMagic(DamageSource damageSource, CallbackInfoReturnable<Boolean> cir) {
        if (damageSource instanceof DamageUtil.SpellDamageSource) {
            cir.setReturnValue(true);
        }

    }

}
