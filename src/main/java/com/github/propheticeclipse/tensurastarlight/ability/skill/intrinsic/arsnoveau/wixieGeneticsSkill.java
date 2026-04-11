package com.github.propheticeclipse.tensurastarlight.ability.skill.intrinsic.arsnoveau;

import com.github.propheticeclipse.tensurastarlight.config.skills.arsnouveauSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.aspectSeriesSkillConfig;
import com.hollingsworth.arsnouveau.api.perk.PerkAttributes;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.skill.Skill;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;

public class wixieGeneticsSkill extends Skill {

    private static final arsnouveauSeriesSkillConfig.wixieGenetics CONFIG;
    public static final ResourceLocation WIXIE_GENETICS;

    public wixieGeneticsSkill() {
        super(SkillType.INTRINSIC);
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

    public void onToggleOn(ManasSkillInstance instance, LivingEntity entity) {
        double potionDurationBonus = instance.isMastered(entity) ? CONFIG.potionDurationBonusMastered : CONFIG.potionDurationBonusUnmastered;

        AttributeInstance potionDuration = entity.getAttribute(PerkAttributes.WIXIE);

        if (potionDuration != null) {
            if (!potionDuration.hasModifier(WIXIE_GENETICS)) {
                potionDuration.addOrReplacePermanentModifier(new AttributeModifier(WIXIE_GENETICS, potionDurationBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }
    }

    public void onToggleOff(ManasSkillInstance instance, LivingEntity entity) {
        AttributeInstance potionDuration = entity.getAttribute(PerkAttributes.WIXIE);
        if (potionDuration != null) {
            potionDuration.removeModifier(WIXIE_GENETICS);
        }
    }

    public void onRespawn(ManasSkillInstance instance, ServerPlayer entity, boolean conqueredEnd) {
        if (instance.isToggled()) {
            double potionDurationBonus = instance.isMastered(entity) ? CONFIG.potionDurationBonusMastered : CONFIG.potionDurationBonusUnmastered;

            AttributeInstance potionDuration = entity.getAttribute(PerkAttributes.WIXIE);

            if (potionDuration != null) {
                if (!potionDuration.hasModifier(WIXIE_GENETICS)) {
                    potionDuration.addOrReplacePermanentModifier(new AttributeModifier(WIXIE_GENETICS, potionDurationBonus, AttributeModifier.Operation.ADD_VALUE));
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
        WIXIE_GENETICS = ResourceLocation.fromNamespaceAndPath("trstarlight", "wixie_genetics");
        CONFIG = ConfigRegistry.getConfig(arsnouveauSeriesSkillConfig.class).wixieGenetics;
    }
}