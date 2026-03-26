package com.github.propheticeclipse.tensurastarlight.race;

import dev.shadowsoffire.apothic_attributes.ApothicAttributes;
import dev.shadowsoffire.apothic_attributes.api.ALObjects;
import io.github.manasmods.manascore.race.api.ManasRace;
import io.github.manasmods.tensura.config.race.RaceConfig;
import io.github.manasmods.tensura.race.template.DefaultRace;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;

public abstract class StarlightRace extends DefaultRace {
    public StarlightRace(ManasRace.Difficulty difficulty) {
        super(difficulty);
    }

    public void applyDefaultAttributeModifiers() {
        //this.addAttributeModifier(Attributes.SCALE, DEFAULT_RACE_ID, this.getDefaultConfig().getSize(), AttributeModifier.Operation.ADD_VALUE);
        // Apotheosis Attributes
        this.addAttributeModifier(ALObjects.Attributes.ARMOR_PIERCE, DEFAULT_RACE_ID, this.getDefaultConfig().getSize(), AttributeModifier.Operation.ADD_VALUE);
        this.addAttributeModifier(ALObjects.Attributes.ARMOR_SHRED, DEFAULT_RACE_ID, this.getDefaultConfig().getSize(), AttributeModifier.Operation.ADD_VALUE);
        this.addAttributeModifier(ALObjects.Attributes.ARROW_DAMAGE, DEFAULT_RACE_ID, this.getDefaultConfig().getSize(), AttributeModifier.Operation.ADD_VALUE);
        this.addAttributeModifier(ALObjects.Attributes.ARROW_VELOCITY, DEFAULT_RACE_ID, this.getDefaultConfig().getSize(), AttributeModifier.Operation.ADD_VALUE);
        this.addAttributeModifier(ALObjects.Attributes.CRIT_CHANCE, DEFAULT_RACE_ID, this.getDefaultConfig().getSize(), AttributeModifier.Operation.ADD_VALUE);
        this.addAttributeModifier(ALObjects.Attributes.CRIT_DAMAGE, DEFAULT_RACE_ID, this.getDefaultConfig().getSize(), AttributeModifier.Operation.ADD_VALUE);
        this.addAttributeModifier(ALObjects.Attributes.HEALING_RECEIVED, DEFAULT_RACE_ID, this.getDefaultConfig().getSize(), AttributeModifier.Operation.ADD_VALUE);
        this.addAttributeModifier(ALObjects.Attributes.OVERHEAL, DEFAULT_RACE_ID, this.getDefaultConfig().getSize(), AttributeModifier.Operation.ADD_VALUE);
        this.addAttributeModifier(ALObjects.Attributes.LIFE_STEAL, DEFAULT_RACE_ID, this.getDefaultConfig().getSize(), AttributeModifier.Operation.ADD_VALUE);
        this.addAttributeModifier(ALObjects.Attributes.CURRENT_HP_DAMAGE, DEFAULT_RACE_ID, this.getDefaultConfig().getSize(), AttributeModifier.Operation.ADD_VALUE);
        this.addAttributeModifier(ALObjects.Attributes.DODGE_CHANCE, DEFAULT_RACE_ID, this.getDefaultConfig().getSize(), AttributeModifier.Operation.ADD_VALUE);
        this.addAttributeModifier(ALObjects.Attributes.DRAW_SPEED, DEFAULT_RACE_ID, this.getDefaultConfig().getSize(), AttributeModifier.Operation.ADD_VALUE);
        this.addAttributeModifier(ALObjects.Attributes.EXPERIENCE_GAINED, DEFAULT_RACE_ID, this.getDefaultConfig().getSize(), AttributeModifier.Operation.ADD_VALUE);
        this.addAttributeModifier(ALObjects.Attributes.PROJECTILE_DAMAGE, DEFAULT_RACE_ID, this.getDefaultConfig().getSize(), AttributeModifier.Operation.ADD_VALUE);
        this.addAttributeModifier(ALObjects.Attributes.PROT_PIERCE, DEFAULT_RACE_ID, this.getDefaultConfig().getSize(), AttributeModifier.Operation.ADD_VALUE);
        this.addAttributeModifier(ALObjects.Attributes.PROT_SHRED, DEFAULT_RACE_ID, this.getDefaultConfig().getSize(), AttributeModifier.Operation.ADD_VALUE);

    }
}
