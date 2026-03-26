package com.github.propheticeclipse.tensurastarlight.config.races;

import io.github.manasmods.manascore.config.api.Comment;
import io.github.manasmods.manascore.config.api.ManasConfig;
import io.github.manasmods.tensura.config.race.RaceConfig;

import java.util.List;

public class aspectBornRaceConfig extends ManasConfig {
    public lesserAspectBorn lesserAspectBorn = new lesserAspectBorn();
    public aspectBorn aspectBorn = new aspectBorn();
    public greaterAspectBorn greaterAspectBorn = new greaterAspectBorn();

    public lesserConvergenceBorn lesserConvergenceBorn = new lesserConvergenceBorn();
    public convergenceBorn convergenceBorn = new convergenceBorn();
    public greaterConvergenceBorn greaterConvergenceBorn = new greaterConvergenceBorn();
    public elderConvergenceBorn elderConvergenceBorn = new elderConvergenceBorn();

    public lesserMemoryBorn lesserMemoryBorn = new lesserMemoryBorn();
    public memoryBorn memoryBorn = new memoryBorn();
    public greaterMemoryBorn greaterMemoryBorn = new greaterMemoryBorn();
    public grandMemoryBorn grandMemoryBorn = new grandMemoryBorn();

    public String getFileName() {
        return "tensura/tensura-starlight/races/aspectborn";
    }

    public static class lesserAspectBorn extends RaceConfig.Default {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = (double)1500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = (double)2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = (double)300.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = (double)600.0F;


        @Comment("What should the additonal size modifier of this race be?")
        public double size = (double)0.0F;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = (double)2.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = (double)10.0F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = (double)0.0F;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.1;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = (double)0.0F;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.05;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = (double)0.5F;



        @Comment("What intrinsics should this race have?")
        public List<String> lesserAspectBornIntrinsics = List.of();

        public double getMinAura() {
            return this.minAura;
        }

        public double getMaxAura() {
            return this.maxAura;
        }

        public double getMinMagicule() {
            return this.minMagicule;
        }

        public double getMaxMagicule() {
            return this.maxMagicule;
        }

        public double getSize() {
            return this.size;
        }

        public double getMaxHealth() {
            return this.maxHealth;
        }

        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }

        public double getAttack() {
            return this.attack;
        }

        public double getAttackSpeed() {
            return this.attackSpeed;
        }

        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }

        public double getMovementSpeed() {
            return this.movementSpeed;
        }

        public double getSwimSpeed() {
            return this.swimSpeed;
        }
    }

}
