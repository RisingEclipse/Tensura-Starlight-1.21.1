package com.github.propheticeclipse.tensurastarlight.effect.buff;

import com.github.propheticeclipse.tensurastarlight.config.effects.BuffEffectsConfig;
import com.hollingsworth.arsnouveau.api.util.ManaUtil;
import com.hollingsworth.arsnouveau.common.capability.ManaCap;
import com.hollingsworth.arsnouveau.setup.registry.CapabilityRegistry;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.damage.TensuraDamageTypes;
import io.github.manasmods.tensura.effect.template.TensuraMobEffect;
import io.github.manasmods.tensura.registry.attribute.TensuraAttributes;
import io.github.manasmods.tensura.storage.TensuraStorages;
import io.github.manasmods.tensura.storage.ep.IExistence;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import java.awt.*;

public class SourceBloodRejuvenationEffect extends TensuraMobEffect {
    public static final ResourceLocation SOURCE_BLOOD = ResourceLocation.fromNamespaceAndPath("trstarlight", "source_blood");
    private static final BuffEffectsConfig.sourceBlood CONFIG = ConfigRegistry.getConfig(BuffEffectsConfig.class).sourceBlood;

    public SourceBloodRejuvenationEffect() {
        super(MobEffectCategory.BENEFICIAL, (new Color(255, 255, 255)).getRGB());
    }

    public boolean applyEffectTick(LivingEntity entity, int pAmplifier) {
        // Logic Here

        int level = pAmplifier + 1;

        /*
        Concept Logic:
        Heal Health/SHP when its low (Consuming Source)
        Regen Mana when Health/SHP is high (Consuming SHP)
         */
        Level entityLevel = entity.level();

        IExistence existence = TensuraStorages.getExistenceFrom(entity);
        double HP = entity.getHealth();
        double maxHP = entity.getMaxHealth();
        double SHP = existence.getSpiritualHealth();
        double maxSHP = entity.getAttributeValue(TensuraAttributes.MAX_SPIRITUAL_HEALTH);
        double curMana = ManaUtil.getCurrentMana(entity);
        ManaCap mana = CapabilityRegistry.getMana(entity);

        // Ability Config Relevance:
        double healingEfficiency = CONFIG.healingEfficency;
        double efficiencyPerLevel = healingEfficiency * level;
        double healAmount = CONFIG.healthBaseHeal * efficiencyPerLevel;
        double spiritualHealAmount = CONFIG.spiritualBaseHeal * efficiencyPerLevel;

        /*
        Moving to a source -> HP System
         */
        if (!SkillUtils.shouldCancelHealing(entity)) {
            if (HP < maxHP && curMana >= healAmount) {
                entity.heal((float) healAmount);
                mana.removeMana(healAmount * 2);
            } else if (HP < maxHP && curMana <= healAmount * 2){
                entity.heal((float) curMana / 2);
                mana.removeMana(curMana);
            }

            if (level >= 5 && SHP < maxSHP && curMana >= healAmount) {
                existence.setSpiritualHealth(SHP + spiritualHealAmount);
                mana.removeMana(spiritualHealAmount);
            } else if (SHP < maxSHP && level >= 5) {
                existence.setSpiritualHealth(SHP + curMana);
                mana.removeMana(curMana);
            }
        }

        return true;
    }

    public boolean shouldApplyEffectTickThisTick(int pDuration, int pAmplifier) {
        return pDuration > 0 && pDuration % CONFIG.tickRate == 0;
    }
}
