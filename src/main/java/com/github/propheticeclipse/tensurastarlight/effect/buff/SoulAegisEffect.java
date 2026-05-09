package com.github.propheticeclipse.tensurastarlight.effect.buff;

import com.github.propheticeclipse.tensurastarlight.config.effects.BuffEffectsConfig;
import com.sammy.malum.registry.common.MalumAttributes;
import com.sammy.malum.registry.common.MalumMobEffects;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.tensura.effect.template.TensuraMobEffect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

import java.awt.*;

public class SoulAegisEffect extends TensuraMobEffect {
    public static final ResourceLocation SOUL_AEGIS = ResourceLocation.fromNamespaceAndPath("trstarlight", "soul_aegis");
    private static final BuffEffectsConfig.soulAegis CONFIG = ConfigRegistry.getConfig(BuffEffectsConfig.class).soulAegis;

    public SoulAegisEffect() {
        super(MobEffectCategory.BENEFICIAL, (new Color(255, 255, 255)).getRGB());
        this.addAttributeModifier(MalumAttributes.SOUL_WARD_CAPACITY, SOUL_AEGIS, CONFIG.soulWardBonus, AttributeModifier.Operation.ADD_VALUE);
        this.addAttributeModifier(MalumAttributes.MALIGNANT_AEGIS_CAPACITY, SOUL_AEGIS, CONFIG.malignantAegisBonus, AttributeModifier.Operation.ADD_VALUE);
        this.addAttributeModifier(MalumAttributes.ARCANE_RESONANCE, SOUL_AEGIS, CONFIG.arcaneResonanceMod, AttributeModifier.Operation.ADD_MULTIPLIED_BASE);


    }
}
