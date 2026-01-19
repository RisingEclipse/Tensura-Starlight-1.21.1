package com.github.propheticeclipse.tensurastarlight.ability.skill.unique.evolvedUnique;

import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.skill.Skill;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class RemnantsOfAscensionSkill extends Skill {
    public static final ResourceLocation REMNANTS_OF_ASCENSION;

    public RemnantsOfAscensionSkill() {
        super(SkillType.UNIQUE);
    }

    /*Remnants of Ascension
Evolved Unique
“Motion is born from pause. Form is sculpted in collapse. What was power is no longer force — but continuity, shaped through pressure and will.”
Acquisition Conditions:
Mastered Ember Remains (Sacrificed)
Mastered Current Unbroken (Sacrificed)
Mastered Shape Forgotten (Sacrificed)
150k MP
Demon Lord Seed or Hero Egg

Passives

[Passive - True] Shifting Form:
After taking damage, temporarily increase armour by 10 and armour toughness by 2, up to 100/20 points respectively with repeated damage.
Effects will fade over time. Additionally, for every 10 points of armour gained by this effect,
negate 5 (10 Mastered) damage from any incoming damage. Consumes 500 MP per level of buff added.
Improve EP regen by 40 (80 Mastered)/s, additionally, Improve magic damage by 1.5x stacking with other bonuses.
Magicule consumption is reduced by 10%
Gain mastery every 5 seconds.


[Passive - True] Eidolon of Infernos:
Bypass Death, set SHP and HP to 10%, gain resistance 3 for 60s. 600s CD, Costless.
When damaging a target, increase your damage by 4, increasing in severity with each strike.
Resist 20% Magic and Elemental damage, up to a limit of 500 (1000 Mastered). Damage resisted by this effect are translated into barrier points

[Passive - Toggle] Fracture the Core:
Cook the target for 10 (20 Mastered) HP every attack. (probably will be removed
Increase base attack damage by 1.25x, Increase Crit Damage by +0.5x, Penetrate 8 levels of protection, and Penetrate 5% of armor.

Actives

[Active - Press] Flaring Form: Increase the duration of beneficial effects by 60s and cure negative status effects. Consume 2500 MP/ Minute and 1000 MP/ Level cured. 30s (15s Mastered) CD.

Temporarily affects all beneficial effects and negative status effects.*/

    @Override
    public boolean checkAcquiringRequirement(Player entity, double newEP) {
        /*Acquisition Conditions:
Mastered Ember Remains (Sacrificed)
Mastered Current Unbroken (Sacrificed)
Mastered Shape Forgotten (Sacrificed)
150k MP
Demon Lord Seed or Hero Egg*/
        return super.checkAcquiringRequirement(entity, newEP);
    }

    @Override
    public double getAcquiringMagiculeCost(ManasSkillInstance instance) {
        return 150000;
    }

    @Override
    public boolean canTick(ManasSkillInstance instance, LivingEntity entity) {
        return true;
    }

    static {
        REMNANTS_OF_ASCENSION = ResourceLocation.fromNamespaceAndPath("trstarlight", "remnants_of_ascension");
    }
}
