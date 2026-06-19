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
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
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
        double maxMana = mana.getMaxMana();

        // Ability Config Relevance:
        double healingEfficiency = CONFIG.healingEfficency;
        double efficiencyPerLevel = healingEfficiency * level;

        // Some quick math for references
        double HPtoHeal = Math.clamp((maxHP - HP) * efficiencyPerLevel, 0.0, maxHP);
        double SHPtoHeal = Math.clamp((maxSHP - SHP) * efficiencyPerLevel, 0.0, maxSHP);
        double ManatoHeal = Math.clamp((maxMana - curMana) * efficiencyPerLevel, 0.0, maxMana);

        double HPConversion = CONFIG.HPConversionRatio;
        double SHPConversion = CONFIG.SHPConversionRatio;

        double aboveHPRegenReq = maxHP * 0.46;
        double FlooredDamageTaken = Math.clamp((ManatoHeal / HPConversion), 0.0, Math.abs(HP - aboveHPRegenReq));

        if (HP <= maxHP * 0.451) {

            if (curMana >= HPtoHeal * HPConversion) {
                entity.heal((float) HPtoHeal);
                mana.removeMana(HPtoHeal * HPConversion);
            } else if (curMana < HPtoHeal * HPConversion) {
                entity.heal((float) Math.clamp(curMana * HPConversion, 0.0, HPtoHeal));
                mana.removeMana(curMana);
            }

        } else

        if (HP >= maxHP * 0.551 && curMana < maxMana) {

            /*
            if: has enough Health to spend -> proceed
            If: has not enough health: spend all until the limit (0.46x)
             */

            if (HP >= ManatoHeal / HPConversion) {
                entity.invulnerableTime = 0;
                entity.hurt(TensuraDamageTypes.getDamageSource(entityLevel, TensuraDamageTypes.MAGIC_GENERIC), (float) (ManatoHeal / HPConversion));
                mana.addMana(ManatoHeal);
            } else if (HP <= ManatoHeal / HPConversion) {
                entity.invulnerableTime = 0;
                entity.hurt(TensuraDamageTypes.getDamageSource(entityLevel, TensuraDamageTypes.MAGIC_GENERIC), (float) (FlooredDamageTaken));
                mana.addMana(FlooredDamageTaken / CONFIG.HPConversionRatio);
            }
        }

        if (level >= 5 && SHP < maxSHP) {

        }

        return true;
    }

    public boolean shouldApplyEffectTickThisTick(int pDuration, int pAmplifier) {
        return pDuration > 0 && pDuration % CONFIG.tickRate == 0;
    }
}
