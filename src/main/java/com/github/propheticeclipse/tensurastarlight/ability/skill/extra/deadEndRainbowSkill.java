package com.github.propheticeclipse.tensurastarlight.ability.skill.extra;

import com.github.propheticeclipse.tensurastarlight.config.skills.aspectSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.itemExtraSkillsConfig;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightExtraSkills;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.network.api.util.Changeable;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.SkillHelper;
import io.github.manasmods.tensura.ability.TensuraSkillInstance;
import io.github.manasmods.tensura.ability.skill.Skill;
import io.github.manasmods.tensura.damage.TensuraDamageHelper;
import io.github.manasmods.tensura.enchantment.TensuraEnchantments;
import io.github.manasmods.tensura.registry.attribute.TensuraAttributes;
import io.github.manasmods.tensura.registry.item.TensuraToolItems;
import io.github.manasmods.tensura.registry.skill.ExtraSkills;
import io.github.manasmods.tensura.storage.TensuraStorages;
import io.github.manasmods.tensura.storage.ep.IExistence;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.Level;

public class deadEndRainbowSkill extends Skill {

    private static final itemExtraSkillsConfig.deadEndRainbowSkill CONFIG;
    public static final ResourceLocation DEAD_END_RAINBOW_SKILL;

    public deadEndRainbowSkill() {
        super(SkillType.EXTRA);
    }

    public double getAcquiringMagiculeCost(ManasSkillInstance instance) {
        return CONFIG.acquirementCost;
    }

    public int getAcquirementMastery(LivingEntity entity) {
        return CONFIG.acquirementMastery;
    }

    public boolean checkAcquiringRequirement(Player entity, double newEP) {
        if (entity instanceof ServerPlayer player) {
            int AcquiredDeadEnd = player.getStats().getValue(Stats.ITEM_PICKED_UP.get(TensuraToolItems.DEAD_END_RAINBOW.get()));
            if (AcquiredDeadEnd >= 1) {
                TensuraSkillInstance thisSkillLol = new TensuraSkillInstance(StarlightExtraSkills.DEAD_END_RAINBOW_SKILL.get());
                thisSkillLol.getOrCreateTag().putBoolean("NoMagiculeCost", true);
                SkillHelper.learnSkill(entity, thisSkillLol);
                return true;
            }
        }
        return false;
    }

    public boolean canBeToggled(ManasSkillInstance instance, LivingEntity entity) {
        return true;
    }

    public boolean onDamageEntity(ManasSkillInstance instance, LivingEntity owner, LivingEntity target, DamageSource source, Changeable<Float> amount) {
        // Logic Here
        if (!instance.isToggled()) {
            return true;
        }

        Level level = owner.level();
        Holder<Enchantment> holder = level.registryAccess()
                .registryOrThrow(Registries.ENCHANTMENT)
                .getHolder(TensuraEnchantments.DEAD_END_RAINBOW)
                .orElseThrow();
        if (owner.getMainHandItem().getEnchantmentLevel(holder) >= 1) {
            IExistence targetExistence = TensuraStorages.getExistenceFrom(target);


            double curSHP = targetExistence.getSpiritualHealth();
            double dealPercent = isMastered(instance, owner) ? CONFIG.currentSHPBonusDamagePercentMastered : CONFIG.currentSHPBonusDamagePercentUnmastered; // Swap to configs M:UM
            double cookPercent = isMastered(instance, owner) ? CONFIG.cookDamagePercentMastered : CONFIG.cookDamagePercentUnmastered;

            double dealDamage = curSHP * dealPercent;
            double cookDamage = curSHP * cookPercent;

            if (dealDamage > CONFIG.currentSHPBonusDamageCapUnmastered && !isMastered(instance, owner)) {
                TensuraDamageHelper.directSpiritualHurt(target, owner, (float) CONFIG.currentSHPBonusDamageCapUnmastered);
            } else {
                TensuraDamageHelper.directSpiritualHurt(target, owner, (float) dealDamage);
            }

            AttributeInstance spiritualHealth = target.getAttribute(TensuraAttributes.MAX_SPIRITUAL_HEALTH);

            if (cookDamage > CONFIG.cookDamageCapUnmastered && !isMastered(instance, owner)) {
                if (spiritualHealth != null) {
                    AttributeModifier chefModifier = spiritualHealth.getModifier(DEAD_END_RAINBOW_SKILL);
                    if (chefModifier != null) {
                        cookDamage -= chefModifier.amount();
                    }

                    AttributeModifier attributemodifier = new AttributeModifier(DEAD_END_RAINBOW_SKILL,CONFIG.cookDamageCapUnmastered * (double) -1.0F, AttributeModifier.Operation.ADD_VALUE);
                    spiritualHealth.removeModifier(attributemodifier);
                    spiritualHealth.addOrReplacePermanentModifier(attributemodifier);
                }
            } else {
                if (spiritualHealth != null) {
                    AttributeModifier chefModifier = spiritualHealth.getModifier(DEAD_END_RAINBOW_SKILL);
                    if (chefModifier != null) {
                        cookDamage -= chefModifier.amount();
                    }

                    AttributeModifier attributemodifier = new AttributeModifier(DEAD_END_RAINBOW_SKILL,cookDamage * (double) -1.0F, AttributeModifier.Operation.ADD_VALUE);
                    spiritualHealth.removeModifier(attributemodifier);
                    spiritualHealth.addOrReplacePermanentModifier(attributemodifier);
                }
            }
        }


        // Dont touch me
        return true;
    }

    static {
        DEAD_END_RAINBOW_SKILL = ResourceLocation.fromNamespaceAndPath("trstarlight", "dead_end_rainbow_skill");
        CONFIG = ConfigRegistry.getConfig(itemExtraSkillsConfig.class).deadEndRainbowSkill;
    }
}