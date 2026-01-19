package com.github.propheticeclipse.tensurastarlight.ability.skill.unique;

import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUniqueSkills;
import io.github.manasmods.manascore.network.api.util.Changeable;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.ability.skill.Skill;
import io.github.manasmods.tensura.registry.skill.CommonSkills;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class ShapeForgottenSkill extends Skill {
    public ShapeForgottenSkill() {
        super(SkillType.UNIQUE);
    }

//    # Shape Forgotten
//-# Unique
//-# “Concentrate your body upon fracture, for only broken forms learn to adapt.”
//    Acquisition Conditions:
//    Have Ember Remains or Current Unbroken
//    Self Regeneration
//75k MP, or Reincarnation
//    Actives
//

    @Override
    public boolean checkAcquiringRequirement(Player entity, double newEP) {
        boolean ember = SkillUtils.isSkillMastered(entity, StarlightUniqueSkills.EMBER_REMAINS.get());
        boolean selfRegen = SkillUtils.hasSkillPermanently(entity, CommonSkills.SELF_REGENERATION.get());
        return ember && selfRegen;
    }

    @Override
    public int getAcquirementMastery(LivingEntity entity) {
        return 1;
    }

    @Override
    public double getAcquiringMagiculeCost(ManasSkillInstance instance) {
        return 75000;
    }

    public int getModes(ManasSkillInstance instance) {
        return 1;
    }

    public String getModeId(ManasSkillInstance instance, int mode) {
        String var10000;
        if (mode == 0) {
            var10000 = "shape_forgotten.slippery_form";
        } else {
            var10000 = super.getModeId(instance, mode);
        }

        return var10000;
    }

    @Override
    public boolean onTakenDamage(ManasSkillInstance instance, LivingEntity owner, DamageSource source, Changeable<Float> amount) {
        //[Passive - True] After taking 10+ damage, temporarily increase armour by 10, up to 100 points over time.
        // Effects will fade over time. Consumes 200 MP / Level
        //[Passive - Toggle] For each level of the above effect, reduce all damage taken by a flat 2 (4 mastered) points.
        // If under 40% HP, increase to 3 (5 mastered) damage reduction.
        return true;
    }

    @Override
    public void onPressed(ManasSkillInstance instance, LivingEntity entity, int keyNumber, int mode) {
        //[Active - Press] Slippery Form: Remove all slowing/stunning debuffs such as Slowness, Paralysis, or similar. 5s CD, 750 MP per level removed. Gain 1 mastery per effect removed.
//
//    Temporarily affects all harmful effects
    }
}
