package com.github.propheticeclipse.tensurastarlight.mixin;

import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUniqueSkills;
import io.github.Memoires.mysticism.ability.skill.unique.KyuremSkill;
import io.github.Memoires.mysticism.ability.skill.unique.ReducerSkill;
import io.github.Memoires.mysticism.registry.effects.MysticismMobEffects;
import io.github.Memoires.mysticism.registry.skill.UniqueMysticismSkills;
import io.github.manasmods.manascore.skill.api.ManasSkill;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.registry.effect.TensuraMobEffects;
import io.github.manasmods.tensura.storage.TensuraStorages;
import io.github.manasmods.tensura.util.EnergyHelper;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin({EnergyHelper.class})
public class MixinEnergyHelper {
    @ModifyVariable(
            method = {"isOutOfEnergy(Lnet/minecraft/world/entity/LivingEntity;DD)Z"},
            at = @At("HEAD"),
            ordinal = 1,
            argsOnly = true
    )
    private static double modifyMpCost(double original, LivingEntity entity, double apCost, double mpCost) {

        if (SkillUtils.hasSkill(entity, StarlightUniqueSkills.CURRENT_UNBROKEN.get())) {
            original *= 0.95;
        }

        return original;
    }
}
