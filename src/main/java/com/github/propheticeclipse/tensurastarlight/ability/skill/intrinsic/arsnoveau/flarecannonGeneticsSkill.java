package com.github.propheticeclipse.tensurastarlight.ability.skill.intrinsic.arsnoveau;

import alexthw.ars_elemental.registry.ModEntities;
import com.alexthw.sauce.registry.ModRegistry;
import com.github.propheticeclipse.tensurastarlight.config.skills.arsnouveauSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.aspectSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUniqueSkills;
import com.hollingsworth.arsnouveau.api.perk.PerkAttributes;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.ability.skill.Skill;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;

public class flarecannonGeneticsSkill extends Skill {

    private static final arsnouveauSeriesSkillConfig.flarecannonGenetics CONFIG;
    public static final ResourceLocation FLARECANNON_GENETICS;

    public flarecannonGeneticsSkill() {
        super(SkillType.INTRINSIC);
    }

    public double getAcquiringMagiculeCost(ManasSkillInstance instance) {
        return CONFIG.acquirementCost;
    }

    public int getAcquirementMastery(LivingEntity entity) {
        return CONFIG.acquirementMastery;
    }

    public boolean checkAcquiringRequirement(Player entity, double newEP) {

        boolean LightVestiges = SkillUtils.hasSkillFully(entity, StarlightUniqueSkills.LIGHT_REMAINS.get()) || SkillUtils.hasSkillFully(entity, StarlightUniqueSkills.VESTIGES_OF_EIDOLONS.get());
        if (entity instanceof ServerPlayer servPlayer) {
            return LightVestiges && (servPlayer.getStats().getValue(Stats.ENTITY_KILLED.get(ModEntities.FIRENANDO_ENTITY.get())) >= 25);
        } else {
            return false;
        }
    }

    public boolean canBeToggled(ManasSkillInstance instance, LivingEntity entity) {
        return true;
    }

    public void onToggleOn(ManasSkillInstance instance, LivingEntity entity) {
        double fireSpellBonus = instance.isMastered(entity) ? CONFIG.fireSpellBonusMastered : CONFIG.fireSpellBonusUnmastered;
        double manaDiscountBonus = instance.isMastered(entity) ? CONFIG.manaDiscountBonusMastered : CONFIG.manaDiscountBonusUnmastered;

        AttributeInstance fireSpell = entity.getAttribute(ModRegistry.FIRE_POWER);
        AttributeInstance manaDiscount = entity.getAttribute(ModRegistry.MANA_DISCOUNT);

        if (fireSpell != null) {
            if (!fireSpell.hasModifier(FLARECANNON_GENETICS)) {
                fireSpell.addOrReplacePermanentModifier(new AttributeModifier(FLARECANNON_GENETICS, fireSpellBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }

        if (manaDiscount != null) {
            if (!manaDiscount.hasModifier(FLARECANNON_GENETICS)) {
                manaDiscount.addOrReplacePermanentModifier(new AttributeModifier(FLARECANNON_GENETICS, manaDiscountBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }

    }

    public void onToggleOff(ManasSkillInstance instance, LivingEntity entity) {
        AttributeInstance fireSpell = entity.getAttribute(ModRegistry.FIRE_POWER);
        AttributeInstance manaDiscount = entity.getAttribute(ModRegistry.MANA_DISCOUNT);

        if (fireSpell != null) {
            fireSpell.removeModifier(FLARECANNON_GENETICS);
        }

        if (manaDiscount != null) {
            manaDiscount.removeModifier(FLARECANNON_GENETICS);
        }
    }

    public void onRespawn(ManasSkillInstance instance, ServerPlayer owner, boolean conqueredEnd) {
        if (instance.isToggled()) {
            double fireSpellBonus = instance.isMastered(owner) ? CONFIG.fireSpellBonusMastered : CONFIG.fireSpellBonusUnmastered;
            double manaDiscountBonus = instance.isMastered(owner) ? CONFIG.manaDiscountBonusMastered : CONFIG.manaDiscountBonusUnmastered;

            AttributeInstance fireSpell = owner.getAttribute(ModRegistry.FIRE_POWER);
            AttributeInstance manaDiscount = owner.getAttribute(ModRegistry.MANA_DISCOUNT);

            if (fireSpell != null) {
                if (!fireSpell.hasModifier(FLARECANNON_GENETICS)) {
                    fireSpell.addOrReplacePermanentModifier(new AttributeModifier(FLARECANNON_GENETICS, fireSpellBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }

            if (manaDiscount != null) {
                if (!manaDiscount.hasModifier(FLARECANNON_GENETICS)) {
                    manaDiscount.addOrReplacePermanentModifier(new AttributeModifier(FLARECANNON_GENETICS, manaDiscountBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }
        }
    }

    public boolean canTick(ManasSkillInstance instance, LivingEntity entity) {
        return instance.isToggled();
    }

    public void onTick(ManasSkillInstance instance, LivingEntity living) {
        CompoundTag tag = instance.getOrCreateTag();
        int time = tag.getInt("activatedTimes");
        if (time % 20 == 0) {
            this.addMasteryPoint(instance, living);
        }

        tag.putInt("activatedTimes", time + 1);
    }

    static {
        FLARECANNON_GENETICS = ResourceLocation.fromNamespaceAndPath("trstarlight", "flarecannon_genetics");
        CONFIG = ConfigRegistry.getConfig(arsnouveauSeriesSkillConfig.class).flarecannonGenetics;
    }
}