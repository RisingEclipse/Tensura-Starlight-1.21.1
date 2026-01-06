package com.github.propheticeclipse.tensurastarlight.ability.skill.unique;

import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUniqueSkills;
import io.github.manasmods.manascore.network.api.util.Changeable;
import io.github.manasmods.manascore.skill.api.EntityEvents;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.SkillHelper;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.ability.TensuraSkillInstance;
import io.github.manasmods.tensura.ability.magic.Element;
import io.github.manasmods.tensura.ability.skill.Skill;
import io.github.manasmods.tensura.damage.TensuraDamageHelper;
import io.github.manasmods.tensura.registry.skill.ExtraSkills;
import io.github.manasmods.tensura.storage.TensuraStorages;
import io.github.manasmods.tensura.util.EnergyHelper;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;

public class LightRemainsSkill extends Skill {

    public LightRemainsSkill() {
        super(SkillType.UNIQUE);
    }

    public boolean checkAcquiringRequirement(Player entity, double newEP) {

        boolean LightLord = (TensuraStorages.getSpiritFrom(entity).getSpiritLevelId(Element.LIGHT) >= 4);
        boolean DarkLord = (TensuraStorages.getSpiritFrom(entity).getSpiritLevelId(Element.DARKNESS) >= 4);
        return (LightLord || DarkLord);
    }

    @Override
    public double getAcquiringMagiculeCost(ManasSkillInstance instance) {
        return 75000;
    }

    @Override
    public int getAcquirementMastery(LivingEntity entity) {
        return 1;
    }

    @Override
    public void onLearnSkill(ManasSkillInstance instance, LivingEntity entity) {
        CompoundTag tag = new CompoundTag();
        boolean LightLord = (TensuraStorages.getSpiritFrom(entity).getSpiritLevelId(Element.LIGHT) >= 4);
        boolean DarkLord = (TensuraStorages.getSpiritFrom(entity).getSpiritLevelId(Element.DARKNESS) >= 4);
        if (LightLord || DarkLord) {
            double maxMagicule = EnergyHelper.getMaxMagicule(entity);
            double acquireCost = getAcquiringMagiculeCost(instance);
            EnergyHelper.setMaxMagicule(entity, (maxMagicule + acquireCost));
        }

        if (!SkillUtils.hasSkillFully(entity, ExtraSkills.MAGIC_SENSE.get())) {
            tag.putBoolean("NoMagiculeCost", true);
            SkillHelper.learnSkill(entity, ExtraSkills.MAGIC_SENSE.get());
            tag.putBoolean("NoMagiculeCost", false);
        }
    }

    public double getMagiculeCost(LivingEntity entity, ManasSkillInstance instance, int mode) {
        double cost;
        switch (mode) {
            case 0 -> cost = 500.0;
            case 1 -> cost = 1200.0;
            default -> cost = 0.0;
        }

        return cost;
    }

    public int getModes(ManasSkillInstance instance) {
        return 2;
    }

    public String getModeId(ManasSkillInstance instance, int mode) {
        String var10000;
        switch (mode) {
            case 0 -> var10000 = "light_remains.blinding_light";
            case 1 -> var10000 = "light_remains.overbearing_light";
            default -> var10000 = super.getModeId(instance, mode);
        }

        return var10000;
    }

    public int nextMode(LivingEntity entity, ManasSkillInstance instance, int mode, boolean reverse) {
        if (reverse) {
            return mode == 0 ? 1 : mode - 1;
        } else {
            return mode == 1 ? 0 : mode + 1; // (0 - 1) total is 2
        }
    }

    @Override
    public boolean canBeToggled(ManasSkillInstance instance, LivingEntity entity) {
        return instance.isMastered(entity);
    }

    public boolean onDamageEntity(ManasSkillInstance instance, LivingEntity owner, LivingEntity target, DamageSource source, Changeable<Float> amount) {
        // In Slot]: 1.5x (3x Mastered) Light Damage. Unmastered effect is toggleable when mastered.
        CompoundTag tag = instance.getOrCreateTag();
        double damageBonus = isMastered(instance, owner) ? 3.0 : 1.5; // Mastered : Unmastered
        if (this.isInSlot(owner, instance)) {
            if (TensuraDamageHelper.isLightDamage(source)) {
                Float initDamage = amount.get();
                if (initDamage != null) {
                    amount.set( (float) (initDamage * damageBonus));
                }
            }
        } else if ((instance.isToggled()) && instance.isMastered(owner)) {
            if (TensuraDamageHelper.isLightDamage(source)) {
                Float initDamage = amount.get();
                if (initDamage != null) {
                    amount.set((float) (initDamage * 1.5));
                }
            }
        } return true;
    }

    public void onPressed(ManasSkillInstance instance, LivingEntity entity, int keyNumber, int mode) {
        switch (instance.getModes()) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
    }
}
