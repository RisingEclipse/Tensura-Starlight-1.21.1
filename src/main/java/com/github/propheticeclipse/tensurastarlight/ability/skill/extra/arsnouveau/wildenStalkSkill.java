package com.github.propheticeclipse.tensurastarlight.ability.skill.extra.arsnouveau;

import com.github.propheticeclipse.tensurastarlight.config.skills.arsnouveauSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightIntrinsicSkills;
import dev.shadowsoffire.apothic_attributes.api.ALObjects;
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

public class wildenStalkSkill extends Skill {

    private static final arsnouveauSeriesSkillConfig.wildenStalk CONFIG;
    public static final ResourceLocation WILDEN_STALK;

    public wildenStalkSkill() {
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
        boolean skill1 = SkillUtils.isSkillMastered(entity, StarlightIntrinsicSkills.WILDEN_GUARDIAN_GENETICS.get());
        boolean skill2 = SkillUtils.isSkillMastered(entity, StarlightIntrinsicSkills.WILDEN_HUNTER_GENETICS.get());
        boolean skill3 = SkillUtils.isSkillMastered(entity, StarlightIntrinsicSkills.WILDEN_STALKER_GENETICS.get());
        return skill1 && skill2 && skill3;
    }
    // Wilden Hunter, Guardian, Stalker === Wilden Stalk
    //- Increases arrow damage by 25/50% base,
    public void onToggleOn(ManasSkillInstance instance, LivingEntity entity) {
        double arrowDamageBonus = instance.isMastered(entity) ? CONFIG.arrowDamageBonusMastered : CONFIG.arrowDamageBonusUnmastered;

        AttributeInstance arrowDamage = entity.getAttribute(ALObjects.Attributes.ARROW_DAMAGE);

        if (arrowDamage != null) {
            if (!arrowDamage.hasModifier(WILDEN_STALK)) {
                arrowDamage.addOrReplacePermanentModifier(new AttributeModifier(WILDEN_STALK, arrowDamageBonus, AttributeModifier.Operation.ADD_MULTIPLIED_BASE));
            }
        }
    }

    public void onToggleOff(ManasSkillInstance instance, LivingEntity entity) {
        AttributeInstance arrowDamage = entity.getAttribute(ALObjects.Attributes.ARROW_DAMAGE);
        if (arrowDamage != null) {
            arrowDamage.removeModifier(WILDEN_STALK);
        }
    }

    public void onRespawn(ManasSkillInstance instance, ServerPlayer entity, boolean conqueredEnd) {
        if (instance.isToggled()) {
            double arrowDamageBonus = instance.isMastered(entity) ? CONFIG.arrowDamageBonusMastered : CONFIG.arrowDamageBonusUnmastered;

            AttributeInstance arrowDamage = entity.getAttribute(ALObjects.Attributes.ARROW_DAMAGE);

            if (arrowDamage != null) {
                if (!arrowDamage.hasModifier(WILDEN_STALK)) {
                    arrowDamage.addOrReplacePermanentModifier(new AttributeModifier(WILDEN_STALK, arrowDamageBonus, AttributeModifier.Operation.ADD_MULTIPLIED_BASE));
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
        WILDEN_STALK = ResourceLocation.fromNamespaceAndPath("trstarlight", "wilden_stalk");
        CONFIG = ConfigRegistry.getConfig(arsnouveauSeriesSkillConfig.class).wildenStalk;
    }
}