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
        @Comment("Minimal aura.")
        public double minAura = (double)1500.0F;
        @Comment("Maximum aura.")
        public double maxAura = (double)2500.0F;
        @Comment("Minimal magicule.")
        public double minMagicule = (double)300.0F;
        @Comment("Maximum magicule.")
        public double maxMagicule = (double)600.0F;
        @Comment("Bonus Size.")
        public double size = (double)0.0F;
        @Comment("Bonus Max Health.")
        public double maxHealth = (double)2.0F;
        @Comment("Bonus Max Spiritual Health.")
        public double maxSpiritualHealth = (double)10.0F;
        @Comment("Bonus Attack Damage.")
        public double attack = (double)0.0F;
        @Comment("Bonus Attack Speed.")
        public double attackSpeed = 0.1;
        @Comment("Bonus Knockback Resistance.")
        public double knockbackResistance = (double)0.0F;
        @Comment("Bonus Movement Speed.")
        public double movementSpeed = 0.05;
        @Comment("Bonus Swimming Speed Multiplier.")
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

    public static class aspectBorn extends RaceConfig.Default {
        @Comment("Minimal aura.")
        public double minAura = (double)1500.0F;
        @Comment("Maximum aura.")
        public double maxAura = (double)2500.0F;
        @Comment("Minimal magicule.")
        public double minMagicule = (double)300.0F;
        @Comment("Maximum magicule.")
        public double maxMagicule = (double)600.0F;
        @Comment("Bonus Size.")
        public double size = (double)0.0F;
        @Comment("Bonus Max Health.")
        public double maxHealth = (double)2.0F;
        @Comment("Bonus Max Spiritual Health.")
        public double maxSpiritualHealth = (double)10.0F;
        @Comment("Bonus Attack Damage.")
        public double attack = (double)0.0F;
        @Comment("Bonus Attack Speed.")
        public double attackSpeed = 0.1;
        @Comment("Bonus Knockback Resistance.")
        public double knockbackResistance = (double)0.0F;
        @Comment("Bonus Movement Speed.")
        public double movementSpeed = 0.05;
        @Comment("Bonus Swimming Speed Multiplier.")
        public double swimSpeed = (double)0.5F;
        public List<String> aspectBornIntrinsics = List.of();

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

    public static class greaterAspectBorn extends RaceConfig.Default {
        @Comment("Minimal aura.")
        public double minAura = (double)1500.0F;
        @Comment("Maximum aura.")
        public double maxAura = (double)2500.0F;
        @Comment("Minimal magicule.")
        public double minMagicule = (double)300.0F;
        @Comment("Maximum magicule.")
        public double maxMagicule = (double)600.0F;
        @Comment("Bonus Size.")
        public double size = (double)0.0F;
        @Comment("Bonus Max Health.")
        public double maxHealth = (double)2.0F;
        @Comment("Bonus Max Spiritual Health.")
        public double maxSpiritualHealth = (double)10.0F;
        @Comment("Bonus Attack Damage.")
        public double attack = (double)0.0F;
        @Comment("Bonus Attack Speed.")
        public double attackSpeed = 0.1;
        @Comment("Bonus Knockback Resistance.")
        public double knockbackResistance = (double)0.0F;
        @Comment("Bonus Movement Speed.")
        public double movementSpeed = 0.05;
        @Comment("Bonus Swimming Speed Multiplier.")
        public double swimSpeed = (double)0.5F;
        @Comment("What intrinsics should this race have?")
        public List<String> greaterAspectBornIntrinsics = List.of();

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

    public static class lesserConvergenceBorn extends RaceConfig.Default {
        @Comment("Minimal aura.")
        public double minAura = (double)1500.0F;
        @Comment("Maximum aura.")
        public double maxAura = (double)2500.0F;
        @Comment("Minimal magicule.")
        public double minMagicule = (double)300.0F;
        @Comment("Maximum magicule.")
        public double maxMagicule = (double)600.0F;
        @Comment("Bonus Size.")
        public double size = (double)0.0F;
        @Comment("Bonus Max Health.")
        public double maxHealth = (double)2.0F;
        @Comment("Bonus Max Spiritual Health.")
        public double maxSpiritualHealth = (double)10.0F;
        @Comment("Bonus Attack Damage.")
        public double attack = (double)0.0F;
        @Comment("Bonus Attack Speed.")
        public double attackSpeed = 0.1;
        @Comment("Bonus Knockback Resistance.")
        public double knockbackResistance = (double)0.0F;
        @Comment("Bonus Movement Speed.")
        public double movementSpeed = 0.05;
        @Comment("Bonus Swimming Speed Multiplier.")
        public double swimSpeed = (double)0.5F;
        @Comment("What intrinsics should this race have?")
        public List<String> lesserConvergenceBornIntrinsics = List.of();

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

    public static class convergenceBorn extends RaceConfig.Default {
        @Comment("Minimal aura.")
        public double minAura = (double)1500.0F;
        @Comment("Maximum aura.")
        public double maxAura = (double)2500.0F;
        @Comment("Minimal magicule.")
        public double minMagicule = (double)300.0F;
        @Comment("Maximum magicule.")
        public double maxMagicule = (double)600.0F;
        @Comment("Bonus Size.")
        public double size = (double)0.0F;
        @Comment("Bonus Max Health.")
        public double maxHealth = (double)2.0F;
        @Comment("Bonus Max Spiritual Health.")
        public double maxSpiritualHealth = (double)10.0F;
        @Comment("Bonus Attack Damage.")
        public double attack = (double)0.0F;
        @Comment("Bonus Attack Speed.")
        public double attackSpeed = 0.1;
        @Comment("Bonus Knockback Resistance.")
        public double knockbackResistance = (double)0.0F;
        @Comment("Bonus Movement Speed.")
        public double movementSpeed = 0.05;
        @Comment("Bonus Swimming Speed Multiplier.")
        public double swimSpeed = (double)0.5F;
        @Comment("What intrinsics should this race have?")
        public List<String> convergenceBornIntrinsics = List.of();

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

    public static class greaterConvergenceBorn extends RaceConfig.Default {
        @Comment("Minimal aura.")
        public double minAura = (double)1500.0F;
        @Comment("Maximum aura.")
        public double maxAura = (double)2500.0F;
        @Comment("Minimal magicule.")
        public double minMagicule = (double)300.0F;
        @Comment("Maximum magicule.")
        public double maxMagicule = (double)600.0F;
        @Comment("Bonus Size.")
        public double size = (double)0.0F;
        @Comment("Bonus Max Health.")
        public double maxHealth = (double)2.0F;
        @Comment("Bonus Max Spiritual Health.")
        public double maxSpiritualHealth = (double)10.0F;
        @Comment("Bonus Attack Damage.")
        public double attack = (double)0.0F;
        @Comment("Bonus Attack Speed.")
        public double attackSpeed = 0.1;
        @Comment("Bonus Knockback Resistance.")
        public double knockbackResistance = (double)0.0F;
        @Comment("Bonus Movement Speed.")
        public double movementSpeed = 0.05;
        @Comment("Bonus Swimming Speed Multiplier.")
        public double swimSpeed = (double)0.5F;
        @Comment("What intrinsics should this race have?")
        public List<String> greaterConvergenceBornIntrinsics = List.of();

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

    public static class elderConvergenceBorn extends RaceConfig.Default {
        @Comment("Minimal aura.")
        public double minAura = (double)1500.0F;
        @Comment("Maximum aura.")
        public double maxAura = (double)2500.0F;
        @Comment("Minimal magicule.")
        public double minMagicule = (double)300.0F;
        @Comment("Maximum magicule.")
        public double maxMagicule = (double)600.0F;
        @Comment("Bonus Size.")
        public double size = (double)0.0F;
        @Comment("Bonus Max Health.")
        public double maxHealth = (double)2.0F;
        @Comment("Bonus Max Spiritual Health.")
        public double maxSpiritualHealth = (double)10.0F;
        @Comment("Bonus Attack Damage.")
        public double attack = (double)0.0F;
        @Comment("Bonus Attack Speed.")
        public double attackSpeed = 0.1;
        @Comment("Bonus Knockback Resistance.")
        public double knockbackResistance = (double)0.0F;
        @Comment("Bonus Movement Speed.")
        public double movementSpeed = 0.05;
        @Comment("Bonus Swimming Speed Multiplier.")
        public double swimSpeed = (double)0.5F;
        @Comment("What intrinsics should this race have?")
        public List<String> elderConvergenceBornIntrinsics = List.of();

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

    public static class lesserMemoryBorn extends RaceConfig.Default {
        @Comment("Minimal aura.")
        public double minAura = (double)1500.0F;
        @Comment("Maximum aura.")
        public double maxAura = (double)2500.0F;
        @Comment("Minimal magicule.")
        public double minMagicule = (double)300.0F;
        @Comment("Maximum magicule.")
        public double maxMagicule = (double)600.0F;
        @Comment("Bonus Size.")
        public double size = (double)0.0F;
        @Comment("Bonus Max Health.")
        public double maxHealth = (double)2.0F;
        @Comment("Bonus Max Spiritual Health.")
        public double maxSpiritualHealth = (double)10.0F;
        @Comment("Bonus Attack Damage.")
        public double attack = (double)0.0F;
        @Comment("Bonus Attack Speed.")
        public double attackSpeed = 0.1;
        @Comment("Bonus Knockback Resistance.")
        public double knockbackResistance = (double)0.0F;
        @Comment("Bonus Movement Speed.")
        public double movementSpeed = 0.05;
        @Comment("Bonus Swimming Speed Multiplier.")
        public double swimSpeed = (double)0.5F;
        @Comment("What intrinsics should this race have?")
        public List<String> lesserMemoryBornIntrinsics = List.of();

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

    public static class memoryBorn extends RaceConfig.Default {
        @Comment("Minimal aura.")
        public double minAura = (double)1500.0F;
        @Comment("Maximum aura.")
        public double maxAura = (double)2500.0F;
        @Comment("Minimal magicule.")
        public double minMagicule = (double)300.0F;
        @Comment("Maximum magicule.")
        public double maxMagicule = (double)600.0F;
        @Comment("Bonus Size.")
        public double size = (double)0.0F;
        @Comment("Bonus Max Health.")
        public double maxHealth = (double)2.0F;
        @Comment("Bonus Max Spiritual Health.")
        public double maxSpiritualHealth = (double)10.0F;
        @Comment("Bonus Attack Damage.")
        public double attack = (double)0.0F;
        @Comment("Bonus Attack Speed.")
        public double attackSpeed = 0.1;
        @Comment("Bonus Knockback Resistance.")
        public double knockbackResistance = (double)0.0F;
        @Comment("Bonus Movement Speed.")
        public double movementSpeed = 0.05;
        @Comment("Bonus Swimming Speed Multiplier.")
        public double swimSpeed = (double)0.5F;
        @Comment("What intrinsics should this race have?")
        public List<String> memoryBornIntrinsics = List.of();

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

    public static class greaterMemoryBorn extends RaceConfig.Default {
        @Comment("Minimal aura.")
        public double minAura = (double)1500.0F;
        @Comment("Maximum aura.")
        public double maxAura = (double)2500.0F;
        @Comment("Minimal magicule.")
        public double minMagicule = (double)300.0F;
        @Comment("Maximum magicule.")
        public double maxMagicule = (double)600.0F;
        @Comment("Bonus Size.")
        public double size = (double)0.0F;
        @Comment("Bonus Max Health.")
        public double maxHealth = (double)2.0F;
        @Comment("Bonus Max Spiritual Health.")
        public double maxSpiritualHealth = (double)10.0F;
        @Comment("Bonus Attack Damage.")
        public double attack = (double)0.0F;
        @Comment("Bonus Attack Speed.")
        public double attackSpeed = 0.1;
        @Comment("Bonus Knockback Resistance.")
        public double knockbackResistance = (double)0.0F;
        @Comment("Bonus Movement Speed.")
        public double movementSpeed = 0.05;
        @Comment("Bonus Swimming Speed Multiplier.")
        public double swimSpeed = (double)0.5F;
        @Comment("What intrinsics should this race have?")
        public List<String> greaterMemoryBornIntrinsics = List.of();

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

    public static class grandMemoryBorn extends RaceConfig.Default {
        @Comment("Minimal aura.")
        public double minAura = (double)1500.0F;
        @Comment("Maximum aura.")
        public double maxAura = (double)2500.0F;
        @Comment("Minimal magicule.")
        public double minMagicule = (double)300.0F;
        @Comment("Maximum magicule.")
        public double maxMagicule = (double)600.0F;
        @Comment("Bonus Size.")
        public double size = (double)0.0F;
        @Comment("Bonus Max Health.")
        public double maxHealth = (double)2.0F;
        @Comment("Bonus Max Spiritual Health.")
        public double maxSpiritualHealth = (double)10.0F;
        @Comment("Bonus Attack Damage.")
        public double attack = (double)0.0F;
        @Comment("Bonus Attack Speed.")
        public double attackSpeed = 0.1;
        @Comment("Bonus Knockback Resistance.")
        public double knockbackResistance = (double)0.0F;
        @Comment("Bonus Movement Speed.")
        public double movementSpeed = 0.05;
        @Comment("Bonus Swimming Speed Multiplier.")
        public double swimSpeed = (double)0.5F;
        @Comment("What intrinsics should this race have?")
        public List<String> grandMemoryBornIntrinsics = List.of();

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
