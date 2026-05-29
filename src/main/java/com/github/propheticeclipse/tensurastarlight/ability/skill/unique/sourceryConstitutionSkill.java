package com.github.propheticeclipse.tensurastarlight.ability.skill.unique;

import com.alexthw.sauce.registry.ModRegistry;
import com.github.propheticeclipse.tensurastarlight.config.skills.arsnouveauSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.utils.ConeProjection;
import com.github.propheticeclipse.tensurastarlight.utils.StarlightUtils;
import com.hollingsworth.arsnouveau.api.spell.SpellContext;
import com.hollingsworth.arsnouveau.api.util.DamageUtil;
import com.hollingsworth.arsnouveau.api.util.ManaUtil;
import com.hollingsworth.arsnouveau.common.capability.ManaCap;
import com.hollingsworth.arsnouveau.setup.registry.*;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.network.api.util.Changeable;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.skill.Skill;
import io.github.manasmods.tensura.damage.TensuraDamageHelper;
import io.github.manasmods.tensura.damage.TensuraDamageTypes;
import io.github.manasmods.tensura.effect.template.TensuraMobEffect;
import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

import java.util.List;
import java.util.Objects;

public class sourceryConstitutionSkill extends Skill {

    private static final arsnouveauSeriesSkillConfig.sourceryConstitution CONFIG = ConfigRegistry.getConfig(arsnouveauSeriesSkillConfig.class).sourceryConstitution;
    public static final ResourceLocation SOURCERY_CONSTITUTION = ResourceLocation.fromNamespaceAndPath("trstarlight", "sourcery_constitution");

    public sourceryConstitutionSkill() {
        super(SkillType.UNIQUE);
    }

    public double getAcquiringMagiculeCost(ManasSkillInstance instance) {
        return CONFIG.acquirementCost;
    }

    public int getAcquirementMastery(LivingEntity entity) {
        return CONFIG.acquirementMastery;
    }

    public boolean checkAcquiringRequirement(Player entity, double newEP) {
        return true;
    }

    public int getModes(ManasSkillInstance instance) {
        return 3;
    }

    public String getModeId(ManasSkillInstance instance, int mode) {
        String var10000;
        switch (mode) {
            case 0 -> var10000 = "sourcery_constitution.elemental_blast";
            case 1 -> var10000 = "sourcery_constitution.source_concentration";
            case 2 -> var10000 = "sourcery_constitution.elemental_school";
            default -> var10000 = super.getModeId(instance, mode);
        }

        return var10000;
    }

    public double getMagiculeCost(LivingEntity entity, ManasSkillInstance instance, int mode) {
        double cost;
        switch (mode) {
            case 0 -> cost = CONFIG.elementalBlastManaCost;
            case 1 -> cost = CONFIG.sourceConcentrationManaCost;
            case 2 -> cost = 0.0F;
            default -> cost = 0.0;
        }

        return cost;
    }

    public int nextMode(LivingEntity entity, ManasSkillInstance instance, int mode, boolean reverse) {
        if (reverse) {
            return mode == 0 ? 2 : mode - 1;
        } else {
            return mode == 2 ? 0 : mode + 1; // (0 - 1) total is 2
        }
    }

    /*
    I would like to apply some glyphs.
    Permanent Accelerate/Amplify glyphs? (Probably attached to a mode toggle or something?)
    Mana discounts? Probably?
    Random glyph acquirements?
    Dealing bonus damage based on the target's source reserves vs yours?
    Maybe a mode swapper to change a focused school of elements? and another for Elemental vs Non-Elemental?
    Change all physical damage to magic?
     */

    /*
    Unique Skill - Sourcery Constitution

    Passives:

    True Passive - Multiply all outgoing Ars Nouveau Spell Damage by 1.01x for every 100 Mana you have over the opponent
    Passive Toggle - While a elemental school is selected, gain additional benefits to that school's spells and resistance to that school.


     */

    public boolean canBeToggled(ManasSkillInstance instance, LivingEntity entity) {
        return true;
    }

    public boolean onDamageEntity(ManasSkillInstance instance, LivingEntity owner, LivingEntity target, DamageSource source, Changeable<Float> amount) {
        // I handle the damage modifier to ars in the StarlightEvents class.
        if ((TensuraDamageHelper.isPhysicalAttack(source) || TensuraDamageHelper.isPierce(source)) && !(TensuraDamageHelper.isTensuraMagic(source) || source instanceof DamageUtil.SpellDamageSource)) {
            CompoundTag tag = instance.getOrCreateTag();
            String elementalSchool = tag.getString("ElementalSchools");
            double elementalConversionModifier = instance.isMastered(owner) ? CONFIG.elementConversionModMastered : CONFIG.elementConversionModUnmastered;
            Float initdamage = amount.get();
            double resultedDamage = (initdamage * (elementalConversionModifier));

            int amplifier = CONFIG.elementalAttackAmplifier;
            int duration = CONFIG.elementalAttackDuration;

            if (elementalSchool.equals("Fire")) {
                target.invulnerableTime = 0;
                TensuraDamageHelper.hurtSplit(target, this.createSource(instance, owner, TensuraDamageTypes.FIRE_ELEMENTAL, 2),
                        0.5F, this.createSource(instance, owner, DamageTypesRegistry.FLARE, 2), (float) resultedDamage);
                StarlightUtils.applyEffect(target, ModPotions.BLAST_EFFECT, duration, amplifier);
            } else if (elementalSchool.equals("Water")) {
                target.invulnerableTime = 0;
                TensuraDamageHelper.hurtSplit(target, this.createSource(instance, owner, TensuraDamageTypes.WATER_ELEMENTAL, 2),
                        0.5F, this.createSource(instance, owner, DamageTypesRegistry.COLD_SNAP, 2), (float) resultedDamage);
                StarlightUtils.applyEffect(target, ModPotions.SOAKED_EFFECT, duration, amplifier);
            } else if (elementalSchool.equals("Earth")) {
                target.invulnerableTime = 0;
                TensuraDamageHelper.hurtSplit(target, this.createSource(instance, owner, TensuraDamageTypes.EARTH_ELEMENTAL, 2),
                        0.5F, this.createSource(instance, owner, DamageTypesRegistry.CRUSH, 2), (float) resultedDamage);
                StarlightUtils.applyEffect(target, ModPotions.GRAVITY_EFFECT, duration, amplifier);
            } else if (elementalSchool.equals("Air")) {
                target.invulnerableTime = 0;
                TensuraDamageHelper.hurtSplit(target, this.createSource(instance, owner, TensuraDamageTypes.WIND_ELEMENTAL, 2),
                        0.5F, this.createSource(instance, owner, TensuraDamageTypes.LIGHTNING_ELEMENTAL, 2), (float) resultedDamage);
                StarlightUtils.applyEffect(target, ModPotions.SHOCKED_EFFECT, duration, amplifier);
            }
            instance.addMasteryPoint(owner);
            amount.set(0.0F);
        }

        return true;
    }

    public boolean canScroll(ManasSkillInstance instance, LivingEntity entity, int mode) {
        return true;
    }

    public void onScroll(ManasSkillInstance instance, LivingEntity living, double delta, int mode) {
        if (mode == 2) {
            elementalSchoolSwap(instance, living);
        }
    }

    public static void elementalSchoolSwap(ManasSkillInstance instance, LivingEntity entity) {
            // Check for state or wtv here then apply respective buffs, then remove relevant ones after, or vice versa.
            CompoundTag tag = instance.getOrCreateTag();
            String elementalSchool = tag.getString("ElementalSchools");
            String newSchool = getNewSchool(elementalSchool);

            if (!elementalSchool.equals(newSchool)) {

                tag.putString("ElementalSchools", newSchool);
                if (instance.isToggled()) {
                    getSchoolElementModifiers(newSchool, entity);
                }
                if (entity instanceof Player player) {

                    player.displayClientMessage(
                            Component.translatable(
                                    "trstarlight.generic.string_display",
                                    newSchool
                            ).withStyle(Style.EMPTY.withColor(ChatFormatting.DARK_AQUA)),
                            true
                    );

                }

            }
    }

    public static String getNewSchool(String elementalSchool) {
        String school;
        if (elementalSchool.equals("Fire")) {
            school = "Water";
        } else if (elementalSchool.equals("Water")) {
            school = "Earth";
        } else if (elementalSchool.equals("Earth")) {
            school = "Air";
        } else if (elementalSchool.equals("Air")) {
            school = "Fire";
        } else {
            school = "Fire";
        }
        return school;
    }

    public static void getSchoolElementModifiers(String school, LivingEntity entity) {
        double elementPowerMod = CONFIG.elementPowerMod;
        double elementDefenseMod = CONFIG.elementDefenseMod;

        if (school.equals("Fire")) {
            // Apply Fire, Remove Air
            /*
            double degradeMod = 1;
            AttributeInstance degrade = entity.getAttribute(TensuraAttributes.RESISTANCE_DEGRADATION);
            if (degrade != null && !degrade.hasModifier(VESTIGES_OF_EIDOLONS)) {
                degrade.addOrReplacePermanentModifier(new AttributeModifier(VESTIGES_OF_EIDOLONS, degradeMod, AttributeModifier.Operation.ADD_VALUE));
            }
             */
            AttributeInstance elementPower = entity.getAttribute(ModRegistry.FIRE_POWER);
            AttributeInstance elementDefense = entity.getAttribute(ModRegistry.FIRE_RESISTANCE);
            AttributeInstance removeElementPower = entity.getAttribute(ModRegistry.AIR_POWER);
            AttributeInstance removeElementDefense = entity.getAttribute(ModRegistry.AIR_RESISTANCE);

            if (elementPower != null && !elementPower.hasModifier(SOURCERY_CONSTITUTION)) {
                elementPower.addOrReplacePermanentModifier(new AttributeModifier(SOURCERY_CONSTITUTION, elementPowerMod, AttributeModifier.Operation.ADD_VALUE));
            }
            if (elementDefense != null && !elementDefense.hasModifier(SOURCERY_CONSTITUTION)) {
                elementDefense.addOrReplacePermanentModifier(new AttributeModifier(SOURCERY_CONSTITUTION, elementDefenseMod, AttributeModifier.Operation.ADD_VALUE));
            }

            if (removeElementPower != null) {
                removeElementPower.removeModifier(SOURCERY_CONSTITUTION);
            }
            if (removeElementDefense != null) {
                removeElementDefense.removeModifier(SOURCERY_CONSTITUTION);
            }
        } else if (school.equals("Water")) {
            // Apply Water, Remove Fire
            AttributeInstance elementPower = entity.getAttribute(ModRegistry.WATER_POWER);
            AttributeInstance elementDefense = entity.getAttribute(ModRegistry.WATER_RESISTANCE);
            AttributeInstance removeElementPower = entity.getAttribute(ModRegistry.FIRE_POWER);
            AttributeInstance removeElementDefense = entity.getAttribute(ModRegistry.FIRE_RESISTANCE);

            if (elementPower != null && !elementPower.hasModifier(SOURCERY_CONSTITUTION)) {
                elementPower.addOrReplacePermanentModifier(new AttributeModifier(SOURCERY_CONSTITUTION, elementPowerMod, AttributeModifier.Operation.ADD_VALUE));
            }
            if (elementDefense != null && !elementDefense.hasModifier(SOURCERY_CONSTITUTION)) {
                elementDefense.addOrReplacePermanentModifier(new AttributeModifier(SOURCERY_CONSTITUTION, elementDefenseMod, AttributeModifier.Operation.ADD_VALUE));
            }

            if (removeElementPower != null) {
                removeElementPower.removeModifier(SOURCERY_CONSTITUTION);
            }
            if (removeElementDefense != null) {
                removeElementDefense.removeModifier(SOURCERY_CONSTITUTION);
            }
        } else if (school.equals("Earth")) {
            // Apply Earth, Remove Water
            AttributeInstance elementPower = entity.getAttribute(ModRegistry.EARTH_POWER);
            AttributeInstance elementDefense = entity.getAttribute(ModRegistry.EARTH_RESISTANCE);
            AttributeInstance removeElementPower = entity.getAttribute(ModRegistry.WATER_POWER);
            AttributeInstance removeElementDefense = entity.getAttribute(ModRegistry.WATER_RESISTANCE);

            if (elementPower != null && !elementPower.hasModifier(SOURCERY_CONSTITUTION)) {
                elementPower.addOrReplacePermanentModifier(new AttributeModifier(SOURCERY_CONSTITUTION, elementPowerMod, AttributeModifier.Operation.ADD_VALUE));
            }
            if (elementDefense != null && !elementDefense.hasModifier(SOURCERY_CONSTITUTION)) {
                elementDefense.addOrReplacePermanentModifier(new AttributeModifier(SOURCERY_CONSTITUTION, elementDefenseMod, AttributeModifier.Operation.ADD_VALUE));
            }

            if (removeElementPower != null) {
                removeElementPower.removeModifier(SOURCERY_CONSTITUTION);
            }
            if (removeElementDefense != null) {
                removeElementDefense.removeModifier(SOURCERY_CONSTITUTION);
            }
        } else if (school.equals("Air")) {
            // Apply Air, Remove Earth
            AttributeInstance elementPower = entity.getAttribute(ModRegistry.AIR_POWER);
            AttributeInstance elementDefense = entity.getAttribute(ModRegistry.AIR_RESISTANCE);
            AttributeInstance removeElementPower = entity.getAttribute(ModRegistry.EARTH_POWER);
            AttributeInstance removeElementDefense = entity.getAttribute(ModRegistry.EARTH_RESISTANCE);

            if (elementPower != null && !elementPower.hasModifier(SOURCERY_CONSTITUTION)) {
                elementPower.addOrReplacePermanentModifier(new AttributeModifier(SOURCERY_CONSTITUTION, elementPowerMod, AttributeModifier.Operation.ADD_VALUE));
            }
            if (elementDefense != null && !elementDefense.hasModifier(SOURCERY_CONSTITUTION)) {
                elementDefense.addOrReplacePermanentModifier(new AttributeModifier(SOURCERY_CONSTITUTION, elementDefenseMod, AttributeModifier.Operation.ADD_VALUE));
            }

            if (removeElementPower != null) {
                removeElementPower.removeModifier(SOURCERY_CONSTITUTION);
            }
            if (removeElementDefense != null) {
                removeElementDefense.removeModifier(SOURCERY_CONSTITUTION);
            }
        }
    }

    public void onToggleOn(ManasSkillInstance instance, LivingEntity entity) {
        /*
            double degradeMod = 1;
            AttributeInstance degrade = entity.getAttribute(TensuraAttributes.RESISTANCE_DEGRADATION);
            if (degrade != null && !degrade.hasModifier(VESTIGES_OF_EIDOLONS)) {
                degrade.addOrReplacePermanentModifier(new AttributeModifier(VESTIGES_OF_EIDOLONS, degradeMod, AttributeModifier.Operation.ADD_VALUE));
            }
             */
        double manaDiscountBonus = instance.isMastered(entity) ? CONFIG.manaDiscountBonusMastered : CONFIG.manaDiscountBonusUnmastered;

        AttributeInstance manaDiscount = entity.getAttribute(ModRegistry.MANA_DISCOUNT);
        if (manaDiscount != null && !manaDiscount.hasModifier(SOURCERY_CONSTITUTION)) {
            manaDiscount.addOrReplacePermanentModifier(new AttributeModifier(SOURCERY_CONSTITUTION, manaDiscountBonus, AttributeModifier.Operation.ADD_VALUE));
        }
    }

    public void onToggleOff(ManasSkillInstance instance, LivingEntity entity) {
        AttributeInstance manaDiscount = entity.getAttribute(ModRegistry.MANA_DISCOUNT);
        if (manaDiscount != null) {
            manaDiscount.removeModifier(SOURCERY_CONSTITUTION);
        }
    }

    public boolean onHeld(ManasSkillInstance instance, LivingEntity entity, int heldTicks, int mode) {
        if (mode == 0) {
            Level level = entity.level();
            CompoundTag tag = instance.getOrCreateTag();
            String elementalSchool = tag.getString("ElementalSchools");
            double coneAngleDeg = CONFIG.elementalBlastConeAngle; // 30 degrees cone
            double range = CONFIG.elementalBlastConeLength; // 13 block cone
            double damage = this.isMastered(instance, entity) ? CONFIG.elementalBlastDamageMastered : CONFIG.elementalBlastDamageUnmastered;
            int amplifier = CONFIG.elementalEffectAmplifier;
            int duration = CONFIG.elementalEffectDuration;
            if (heldTicks % CONFIG.elementalBlastFireRate == 0) {

                List<LivingEntity> targets = level.getEntitiesOfClass(LivingEntity.class,
                        entity.getBoundingBox().inflate(range),
                        e -> e != entity && entity.hasLineOfSight(e) && ConeProjection.isInFrontCone(entity, e, coneAngleDeg, range));

                for (LivingEntity target : targets) {
                    if (target != null) {
                        if (elementalSchool.equals("Fire")) {
                            TensuraDamageHelper.hurtSplit(target, this.createSource(instance, entity, TensuraDamageTypes.FIRE_ELEMENTAL, 2),
                                    0.5F, this.createSource(instance, entity, DamageTypesRegistry.FLARE, 2), (float) damage);
                            StarlightUtils.applyEffect(target, ModPotions.BLAST_EFFECT, duration, amplifier);
                        } else if (elementalSchool.equals("Water")) {
                            TensuraDamageHelper.hurtSplit(target, this.createSource(instance, entity, TensuraDamageTypes.WATER_ELEMENTAL, 2),
                                    0.5F, this.createSource(instance, entity, DamageTypesRegistry.COLD_SNAP, 2), (float) damage);
                            StarlightUtils.applyEffect(target, ModPotions.SOAKED_EFFECT, duration, amplifier);
                        } else if (elementalSchool.equals("Earth")) {
                            TensuraDamageHelper.hurtSplit(target, this.createSource(instance, entity, TensuraDamageTypes.EARTH_ELEMENTAL, 2),
                                    0.5F, this.createSource(instance, entity, DamageTypesRegistry.CRUSH, 2), (float) damage);
                            StarlightUtils.applyEffect(target, ModPotions.GRAVITY_EFFECT, duration, amplifier);
                        } else if (elementalSchool.equals("Air")) {
                            TensuraDamageHelper.hurtSplit(target, this.createSource(instance, entity, TensuraDamageTypes.WIND_ELEMENTAL, 2),
                                    0.5F, this.createSource(instance, entity, TensuraDamageTypes.LIGHTNING_ELEMENTAL, 2), (float) damage);
                            StarlightUtils.applyEffect(target, ModPotions.SHOCKED_EFFECT, duration, amplifier);
                        }
                    }
                }

                if (heldTicks % 80 == 0) {
                    this.addMasteryPoint(instance, entity);
                }
            }
        }

        if (mode == 1) {
            // Transformation of source into source gems just straight up
            if (heldTicks % 10 == 0) {
                ItemStack mainHandItem = entity.getMainHandItem();
                if (mainHandItem.is(Items.LAPIS_BLOCK) || mainHandItem.is(Items.AMETHYST_BLOCK)) {
                    double curMana = ManaUtil.getCurrentMana(entity);
                    if (curMana >= 2000) {
                        mainHandItem.shrink(1);

                        entity.spawnAtLocation(BlockRegistry.SOURCE_GEM_BLOCK);
                        ManaCap mana = CapabilityRegistry.getMana(entity);
                        mana.removeMana(2000.0);

                    } else {return true;}
                    // Implement logic for source decrementing and checking
                } else if (mainHandItem.is(Items.LAPIS_LAZULI) || mainHandItem.is(Items.AMETHYST_SHARD)) {
                    double curMana = ManaUtil.getCurrentMana(entity);
                    if (curMana >= 500) {
                        mainHandItem.shrink(1);

                        entity.spawnAtLocation(ItemsRegistry.SOURCE_GEM);
                        ManaCap mana = CapabilityRegistry.getMana(entity);
                        mana.removeMana(500.0);

                    } else {return true;}
                }
            }
        }
        return true;
    }

    public void onRelease(ManasSkillInstance instance, LivingEntity entity, int heldTicks, int keyNumber, int mode) {
        if (mode == 0) {
            instance.setCoolDown(CONFIG.elementalBlastCooldown, 0);
        } else if (mode == 1) {
            instance.setCoolDown(instance.isMastered(entity) ? CONFIG.sourceConcentrationCDMastered : CONFIG.sourceConcentrationCDUnmastered, 1);
        }
    }
}