package com.github.propheticeclipse.tensurastarlight.ability.skill.extra.arsnouveau;

import com.github.propheticeclipse.tensurastarlight.config.skills.arsnouveauSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightIntrinsicSkills;
import com.hollingsworth.arsnouveau.api.perk.PerkAttributes;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.ability.skill.Skill;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;

public class plasmaticSourceSkill extends Skill {

    private static final arsnouveauSeriesSkillConfig.plasmaticSource CONFIG;
    public static final ResourceLocation PLASMATIC_SOURCE;

    public plasmaticSourceSkill() {
        super(SkillType.EXTRA);
    }

    public double getAcquiringMagiculeCost(ManasSkillInstance instance) {
        return CONFIG.acquirementCost;
    }

    public int getAcquirementMastery(LivingEntity entity) {
        return CONFIG.acquirementMastery;
    }

    public boolean canBeToggled(ManasSkillInstance instance, LivingEntity entity) {
        return true;
    }

    public boolean checkAcquiringRequirement(Player entity, double newEP) {
        boolean skill1 = SkillUtils.isSkillMastered(entity, StarlightIntrinsicSkills.FLARECANNON_GENETICS.get());
        boolean skill2 = SkillUtils.isSkillMastered(entity, StarlightIntrinsicSkills.FLASHJACK_GENETICS.get());
        boolean skill3 = SkillUtils.isSkillMastered(entity, StarlightIntrinsicSkills.SIREN_GENETICS.get());
        return skill1 && skill2 && skill3;
    }

    public void onToggleOn(ManasSkillInstance instance, LivingEntity entity) {
        double manaRegenBonus = instance.isMastered(entity) ? CONFIG.manaRegenBonusMastered : CONFIG.manaRegenBonusUnmastered;
        double manaMaxBonus = instance.isMastered(entity) ? CONFIG.manaMaxBonusMastered : CONFIG.manaMaxBonusUnmastered;

        AttributeInstance manaRegen = entity.getAttribute(PerkAttributes.MANA_REGEN_BONUS);
        AttributeInstance manaMax = entity.getAttribute(PerkAttributes.MAX_MANA);

        if (manaRegen != null) {
            if (!manaRegen.hasModifier(PLASMATIC_SOURCE)) {
                manaRegen.addOrReplacePermanentModifier(new AttributeModifier(PLASMATIC_SOURCE, manaRegenBonus, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
            }
        }

        if (manaMax != null) {
            if (!manaMax.hasModifier(PLASMATIC_SOURCE)) {
                manaMax.addOrReplacePermanentModifier(new AttributeModifier(PLASMATIC_SOURCE, manaMaxBonus, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
            }
        }
    }

    public void onToggleOff(ManasSkillInstance instance, LivingEntity entity) {
        AttributeInstance manaRegen = entity.getAttribute(PerkAttributes.MANA_REGEN_BONUS);
        AttributeInstance manaMax = entity.getAttribute(PerkAttributes.MAX_MANA);
        if (manaRegen != null) {
            manaRegen.removeModifier(PLASMATIC_SOURCE);
        }

        if (manaMax != null) {
            manaMax.removeModifier(PLASMATIC_SOURCE);
        }
    }

    public void onRespawn(ManasSkillInstance instance, ServerPlayer entity, boolean conqueredEnd) {
        if (instance.isToggled()) {
            double manaRegenBonus = instance.isMastered(entity) ? CONFIG.manaRegenBonusMastered : CONFIG.manaRegenBonusUnmastered;
            double manaMaxBonus = instance.isMastered(entity) ? CONFIG.manaMaxBonusMastered : CONFIG.manaMaxBonusUnmastered;

            AttributeInstance manaRegen = entity.getAttribute(PerkAttributes.MANA_REGEN_BONUS);
            AttributeInstance manaMax = entity.getAttribute(PerkAttributes.MAX_MANA);

            if (manaRegen != null) {
                if (!manaRegen.hasModifier(PLASMATIC_SOURCE)) {
                    manaRegen.addOrReplacePermanentModifier(new AttributeModifier(PLASMATIC_SOURCE, manaRegenBonus, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                }
            }

            if (manaMax != null) {
                if (!manaMax.hasModifier(PLASMATIC_SOURCE)) {
                    manaMax.addOrReplacePermanentModifier(new AttributeModifier(PLASMATIC_SOURCE, manaMaxBonus, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
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
        PLASMATIC_SOURCE = ResourceLocation.fromNamespaceAndPath("trstarlight", "plasmatic_source");
        CONFIG = ConfigRegistry.getConfig(arsnouveauSeriesSkillConfig.class).plasmaticSource;
    }
}