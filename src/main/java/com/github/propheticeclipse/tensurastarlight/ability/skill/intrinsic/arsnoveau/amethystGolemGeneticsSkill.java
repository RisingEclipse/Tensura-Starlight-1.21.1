package com.github.propheticeclipse.tensurastarlight.ability.skill.intrinsic.arsnoveau;

import com.github.propheticeclipse.tensurastarlight.config.skills.arsnouveauSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.aspectSeriesSkillConfig;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.network.api.util.Changeable;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.SkillHelper;
import io.github.manasmods.tensura.ability.skill.Skill;
import io.github.manasmods.tensura.registry.attribute.TensuraAttributes;
import io.github.manasmods.tensura.util.AttributeHelper;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class amethystGolemGeneticsSkill extends Skill {

    private static final arsnouveauSeriesSkillConfig.amethystGolemGenetics CONFIG = ConfigRegistry.getConfig(arsnouveauSeriesSkillConfig.class).amethystGolemGenetics;
    public static final ResourceLocation AMETHYST_GOLEM_GENETICS = ResourceLocation.fromNamespaceAndPath("trstarlight", "amethyst_golem_genetics");

    public amethystGolemGeneticsSkill() {
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
    // Amethyst Golem Genetics (Increases knockback resistance and knocks back attackers)

    public void onToggleOn(ManasSkillInstance instance, LivingEntity entity) {
        double knockBackResist = instance.isMastered(entity) ? CONFIG.kbResistMastered : CONFIG.kbResistUnmastered;
        AttributeInstance kbResist = entity.getAttribute(Attributes.KNOCKBACK_RESISTANCE);
        if (kbResist != null) {
            if (!kbResist.hasModifier(AMETHYST_GOLEM_GENETICS)) {
                kbResist.addOrReplacePermanentModifier(new AttributeModifier(AMETHYST_GOLEM_GENETICS, knockBackResist, AttributeModifier.Operation.ADD_VALUE));
            }
        }
    }

    public void onToggleOff(ManasSkillInstance instance, LivingEntity entity) {
        AttributeInstance kbResist = entity.getAttribute(Attributes.KNOCKBACK_RESISTANCE);
        if (kbResist != null) {
            kbResist.removeModifier(AMETHYST_GOLEM_GENETICS);
        }
    }

    public void onRespawn(ManasSkillInstance instance, ServerPlayer owner, boolean conqueredEnd) {
        if (instance.isToggled()) {
            double knockBackResist = instance.isMastered(owner) ? CONFIG.kbResistMastered : CONFIG.kbResistUnmastered;
            AttributeInstance kbResist = owner.getAttribute(Attributes.KNOCKBACK_RESISTANCE);
            if (kbResist != null && !kbResist.hasModifier(AMETHYST_GOLEM_GENETICS)) {
                kbResist.addOrReplacePermanentModifier(new AttributeModifier(AMETHYST_GOLEM_GENETICS, knockBackResist, AttributeModifier.Operation.ADD_VALUE));
            }
        }
    }

    public boolean onTakenDamage(ManasSkillInstance instance, LivingEntity owner, DamageSource source, Changeable<Float> amount) {
        if (source.getEntity() instanceof LivingEntity target) {
            float knockbackStrength = CONFIG.knockbackStrength;
            SkillHelper.knockBack(owner, target, knockbackStrength);
        }

        return true;
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
}