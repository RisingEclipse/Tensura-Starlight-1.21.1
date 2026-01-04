package com.github.propheticeclipse.tensurastarlight.ability.skill.unique;

import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.magic.Element;
import io.github.manasmods.tensura.ability.skill.Skill;
import io.github.manasmods.tensura.storage.TensuraStorages;
import io.github.manasmods.tensura.util.EnergyHelper;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class LightRemainsSkill extends Skill {

    public LightRemainsSkill() {
        super(SkillType.UNIQUE);
    }

    public boolean checkAcquiringRequirement(Player entity, double newEP) {

        boolean LightLord = (TensuraStorages.getSpiritFrom(entity).getSpiritLevelId(Element.LIGHT) >= 4);
        boolean DarkLord = (TensuraStorages.getSpiritFrom(entity).getSpiritLevelId(Element.DARKNESS) >= 4);
        return LightLord || DarkLord;
    }

    @Override
    public double getAcquiringMagiculeCost(ManasSkillInstance instance) {
        return 75000;
    }

    @Override
    public void onLearnSkill(ManasSkillInstance instance, LivingEntity entity) {
        if (TensuraStorages.getSpiritFrom(entity).getSpiritLevelId(Element.LIGHT) >= 4) {
            double maxMagicule = EnergyHelper.getMaxMagicule(entity);
            double acquireCost = getAcquiringMagiculeCost(instance);
            EnergyHelper.setMaxMagicule(entity, (maxMagicule + acquireCost));
        }
        if (TensuraStorages.getSpiritFrom(entity).getSpiritLevelId(Element.DARKNESS) >= 4) {
            double maxMagicule = EnergyHelper.getMaxMagicule(entity);
            double acquireCost = getAcquiringMagiculeCost(instance);
            EnergyHelper.setMaxMagicule(entity, (maxMagicule + acquireCost));
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

    @Override
    public Component getModeName(ManasSkillInstance instance, int mode) {
        MutableComponent name;
        switch (mode) {
            case 1 -> name = Component.translatable("trstarlight.skill.light_remains.blinding_light");
            case 2 -> name = Component.translatable("trstarlight.skill.light_remains.overbearing_light");
            default -> name = Component.empty();
        }

        return name;
    }

    public int nextMode(LivingEntity entity, ManasSkillInstance instance, int mode, boolean reverse) {
        if (reverse) {
            return mode == 0 ? 1 : mode - 1;
        } else {
            return mode == 1 ? 0 : mode + 1; // (0 - 1) total is 2
        }
    }

    public void onPressed(ManasSkillInstance instance, LivingEntity entity, int keyNumber, int mode) {

    }
}
