package com.github.propheticeclipse.tensurastarlight.ability.skill.unique;

import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUniqueSkills;
import com.github.propheticeclipse.tensurastarlight.utils.ConeProjection;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.network.api.util.Changeable;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.SkillHelper;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.ability.magic.Element;
import io.github.manasmods.tensura.ability.skill.Skill;
import io.github.manasmods.tensura.config.ability.skill.UniqueSkillConfig;
import io.github.manasmods.tensura.damage.TensuraDamageHelper;
import io.github.manasmods.tensura.damage.TensuraDamageTypes;
import io.github.manasmods.tensura.effect.template.TensuraMobEffect;
import io.github.manasmods.tensura.particle.TensuraParticleHelper;
import io.github.manasmods.tensura.registry.attribute.TensuraAttributes;
import io.github.manasmods.tensura.registry.effect.TensuraMobEffects;
import io.github.manasmods.tensura.registry.skill.ExtraSkills;
import io.github.manasmods.tensura.registry.sound.TensuraSoundEvents;
import io.github.manasmods.tensura.storage.TensuraStorages;
import io.github.manasmods.tensura.util.EnergyHelper;
import io.github.manasmods.tensura.util.ObjectSelectionHelper;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import java.util.List;

public class LightRemainsSkill extends Skill {

    public static final ResourceLocation LIGHT_REMAINS;

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
    public void onRespawn(ManasSkillInstance instance, ServerPlayer owner, boolean conqueredEnd) {
        double auraPercent = 0.75;
        double manaPercent = 2.25;
        AttributeInstance aura = owner.getAttribute(TensuraAttributes.AURA_GAIN);
        if (aura != null && !aura.hasModifier(LIGHT_REMAINS)) {
            aura.addOrReplacePermanentModifier(new AttributeModifier(LIGHT_REMAINS, auraPercent, AttributeModifier.Operation.ADD_VALUE));
        }

        AttributeInstance magicule = owner.getAttribute(TensuraAttributes.MAGICULE_GAIN);
        if (magicule != null && !magicule.hasModifier(LIGHT_REMAINS)) {
            magicule.addOrReplacePermanentModifier(new AttributeModifier(LIGHT_REMAINS, manaPercent, AttributeModifier.Operation.ADD_VALUE));
        }
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

        double auraPercent = 0.75;
        double manaPercent = 2.25;
        AttributeInstance aura = entity.getAttribute(TensuraAttributes.AURA_GAIN);
        if (aura != null && !aura.hasModifier(LIGHT_REMAINS)) {
            aura.addOrReplacePermanentModifier(new AttributeModifier(LIGHT_REMAINS, auraPercent, AttributeModifier.Operation.ADD_VALUE));
        }

        AttributeInstance magicule = entity.getAttribute(TensuraAttributes.MAGICULE_GAIN);
        if (magicule != null && !magicule.hasModifier(LIGHT_REMAINS)) {
            magicule.addOrReplacePermanentModifier(new AttributeModifier(LIGHT_REMAINS, manaPercent, AttributeModifier.Operation.ADD_VALUE));
        }
    }
    // +3% 2.25% MP, 0.75% AP

    @Override
    public void onForgetSkill(ManasSkillInstance instance, LivingEntity entity) {
        AttributeInstance aura = entity.getAttribute(TensuraAttributes.AURA_GAIN);
        if (aura != null) {
            aura.removeModifier(LIGHT_REMAINS);
        }

        AttributeInstance magicule = entity.getAttribute(TensuraAttributes.MAGICULE_GAIN);
        if (magicule != null) {
            magicule.removeModifier(LIGHT_REMAINS);
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
        if (!SkillUtils.isSkillToggled(owner, StarlightUniqueSkills.VESTIGES_OF_EIDOLONS.get())) {
            if (this.isInSlot(owner, instance)) {
                if (TensuraDamageHelper.isLightDamage(source)) {
                    Float initDamage = amount.get();
                    if (initDamage != null) {
                        amount.set((float) (initDamage * damageBonus));
                    }
                }
            } else if ((instance.isToggled()) && instance.isMastered(owner)) {
                if (TensuraDamageHelper.isLightDamage(source)) {
                    Float initDamage = amount.get();
                    if (initDamage != null) {
                        amount.set((float) (initDamage * 1.5));
                    }
                }
            }
        }
        if (tag.getBoolean("over")) {
            float damageNum = amount.get();
            TensuraDamageHelper.directSpiritualHurt(target, owner, damageNum);
            amount.set((float) 0);
            if (target.isDeadOrDying()) {
                double targetMP = EnergyHelper.getMaxMagicule(target);
                double currentMP = EnergyHelper.getMaxMagicule(owner);
                double gainedMP = targetMP * 0.05;
                EnergyHelper.setMaxMagicule(owner, (currentMP + gainedMP));
                TensuraParticleHelper.addServerParticlesAroundSelf(target, ParticleTypes.SOUL, 0.5, 50);
                TensuraParticleHelper.addServerParticlesAroundSelf(target, ParticleTypes.SOUL_FIRE_FLAME, 0.2, 20);
            }
            tag.putBoolean("over", false);
        }
        return true;
    }

    public void onPressed(ManasSkillInstance instance, LivingEntity entity, int keyNumber, int mode) {
        if (mode == 0) {
            Level level = entity.level();
            double coneAngleDeg = 60; // 60 degrees cone
            double range = 11.0;
            float damage = this.isMastered(instance, entity) ? 20 : 10; // M:UM // 37.5% : 30%

            List<LivingEntity> targets = level.getEntitiesOfClass(LivingEntity.class,
                    entity.getBoundingBox().inflate(range),
                    e -> e != entity && entity.hasLineOfSight(e) && ConeProjection.isInFrontCone(entity, e, coneAngleDeg, range));

            int targetHitCount = 0;

            for (LivingEntity target : targets) {
                if (target != null) {
                    target.hurt(this.createSource(instance, entity, TensuraDamageTypes.LIGHT_ELEMENTAL, mode), damage);

                    level.playSound((Player) null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.CAMPFIRE_CRACKLE, SoundSource.PLAYERS, 1.5F, 1.0F);
                    int amplifier = 0; // 0 = Level 1 Effect
                    int duration = 100; // Mastered : Unmastered Duration is in Ticks (100 = ~5s
                    MobEffectInstance effectInstance = new MobEffectInstance(MobEffects.DARKNESS, duration, amplifier, false, false, false);
                    TensuraMobEffect.addEffect(target, effectInstance, entity, this, mode);
                    targetHitCount++;
                }
            }
            this.addMasteryPoint(instance, entity, targetHitCount);
            this.addMasteryPoint(instance, entity);
            instance.setCoolDown(2, 0);

        }
        if (mode == 1) {
            CompoundTag tag = instance.getOrCreateTag();
            float DamageAmount = instance.isMastered(entity) ? 80 : 40; //M:UM
            //Grab target looking at, X SHP Unmastered : Mastered, Bonus EP on kill
            LivingEntity target = ObjectSelectionHelper.getTargetingEntity(entity, 10, false);
            if (target != null) {
                tag.putBoolean("over", true);
                TensuraParticleHelper.addServerParticlesAroundSelf(target, ParticleTypes.SOUL, 0.5, 10);
                TensuraParticleHelper.addServerParticlesAroundSelf(target, ParticleTypes.SOUL_FIRE_FLAME, 0.2, 2);
                target.hurt(this.createSource(instance, entity, TensuraDamageTypes.LIGHT_ELEMENTAL, mode), DamageAmount);
                this.addMasteryPoint(instance, entity);
                instance.setCoolDown(6, 1); // X Second CD
            }
        }
    }

    static {
        LIGHT_REMAINS = ResourceLocation.fromNamespaceAndPath("trstarlight", "light_remains");
    }
}
