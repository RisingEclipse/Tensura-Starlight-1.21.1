package com.github.propheticeclipse.tensurastarlight.ability.skill.extra.arsnouveau;

import com.github.jarva.arsadditions.setup.registry.AddonItemRegistry;
import com.github.propheticeclipse.tensurastarlight.config.skills.arsnouveauSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.registry.StarlightEffects;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightExtraSkills;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUniqueSkills;
import com.github.propheticeclipse.tensurastarlight.utils.StarlightUtils;
import com.hollingsworth.arsnouveau.api.perk.PerkAttributes;
import com.hollingsworth.arsnouveau.common.capability.ManaCap;
import com.hollingsworth.arsnouveau.setup.registry.CapabilityRegistry;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.network.api.util.Changeable;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.ability.skill.Skill;
import io.github.manasmods.tensura.damage.TensuraDamageHelper;
import io.github.manasmods.tensura.storage.TensuraStorages;
import io.github.manasmods.tensura.storage.ep.IExistence;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.neoforged.fml.ModList;

public class sourceBloodSkill extends Skill {

    private static final arsnouveauSeriesSkillConfig.sourceBlood CONFIG = ConfigRegistry.getConfig(arsnouveauSeriesSkillConfig.class).sourceBlood;
    public static final ResourceLocation SOURCE_BLOOD = ResourceLocation.fromNamespaceAndPath("trstarlight", "source_blood_rejuvenation");

    public sourceBloodSkill() {
        super(SkillType.EXTRA);
    }

    public double getAcquiringMagiculeCost(ManasSkillInstance instance) {
        return CONFIG.acquirementCost;
    }

    public int getAcquirementMastery(LivingEntity entity) {
        return CONFIG.acquirementMastery;
    }

    public boolean checkAcquiringRequirement(Player entity, double newEP) {
        if (SkillUtils.hasSkillFully(entity, StarlightUniqueSkills.SOURCERY_CONSTITUTION.get())) {
            if (!SkillUtils.hasSkillFully(entity, StarlightExtraSkills.ABNORMALLY_LUCKY.get())) {
                return false;
            }
            if (!SkillUtils.hasSkillFully(entity, StarlightExtraSkills.HYPER_METABOLISTIC.get())) {
                return false;
            }
            if (!SkillUtils.hasSkillFully(entity, StarlightExtraSkills.PLASMATIC_SOURCE.get())) {
                return false;
            }
            if (!SkillUtils.hasSkillFully(entity, StarlightExtraSkills.SOURCE_POWERED.get())) {
                return false;
            }
            if (!SkillUtils.hasSkillFully(entity, StarlightExtraSkills.WILDEN_STALK.get())) {
                return false;
            }

            if (entity.getHealth() <= entity.getMaxHealth() * 0.25 && entity.getAttributeValue(PerkAttributes.MANA_REGEN_BONUS) >= 100.0 && entity.getAttributeValue(PerkAttributes.MAX_MANA) >= 3500.0) {
                return newEP >= CONFIG.acquirementCost && CONFIG.enabled;
            }
        }

        return false;
    }

    public int getModes(ManasSkillInstance instance) {
        return 1;
    }

    public String getModeId(ManasSkillInstance instance, int mode) {
        String var10000;
        switch (mode) {
            case 0 -> var10000 = "memory_recreation.block_memory";
            default -> var10000 = super.getModeId(instance, mode);
        }

        return var10000;
    }

    public double getMagiculeCost(LivingEntity entity, ManasSkillInstance instance, int mode) {
        double cost;
        switch (mode) {
            case 0 -> cost = 0;
            default -> cost = 0.0;
        }

        return cost;
    }

    public int nextMode(LivingEntity entity, ManasSkillInstance instance, int mode, boolean reverse) {
        if (reverse) {
            return mode == 0 ? 1 : mode - 1;
        } else {
            return mode == 1 ? 0 : mode + 1; // (0 - 1) total is 2
        }
    }

    public boolean canBeToggled(ManasSkillInstance instance, LivingEntity entity) {
        return true;
    }

    public boolean canTick(ManasSkillInstance instance, LivingEntity entity) {
        return true;
    }

    /*
    Passive that replaces existing mana regen effect based on current health/shp percentages
    Leech a % of target's source as HP when attacking?

    When learned trigger a bunch of glyph learnings?
    Reduce Elemental Damage taken based on a % of max source (flat reduction)
    Way to modify HP based on how much source you have? Or alternatively health into source?
     */

    public void onLearnSkill(ManasSkillInstance instance, LivingEntity entity) {
        /*
        Learn 5 Tier 1 Glyphs
        Learn 3 Tier 2 Glyphs
        Learn 1 Tier 3 Glyph
         */
        if (ModList.get().isLoaded("ars_additions")) {
            if (entity instanceof Player player) {
                Level level = player.level();
                ItemStack tier1 = AddonItemRegistry.CODEX_ENTRY.get().getDefaultInstance();
                ItemStack tier2 = AddonItemRegistry.CODEX_ENTRY_LOST.get().getDefaultInstance();
                ItemStack tier3 = AddonItemRegistry.CODEX_ENTRY_ANCIENT.get().getDefaultInstance();

                ItemStack copy = player.getItemInHand(player.getUsedItemHand()).copy();

                // Tier 1
                tier1.use(level, player, player.getUsedItemHand());
                tier1.use(level, player, player.getUsedItemHand());
                tier1.use(level, player, player.getUsedItemHand());
                tier1.use(level, player, player.getUsedItemHand());
                tier1.use(level, player, player.getUsedItemHand());
                // Tier 2
                tier2.use(level, player, player.getUsedItemHand());
                tier2.use(level, player, player.getUsedItemHand());
                tier2.use(level, player, player.getUsedItemHand());
                // Tier 3
                tier3.use(level, player, player.getUsedItemHand());

                if (player.getMainHandItem().isEmpty() && !copy.isEmpty()) {
                    entity.spawnAtLocation(copy);
                }
            }
        }
    }

    public void onTick(ManasSkillInstance instance, LivingEntity entity) {
        IExistence existence = TensuraStorages.getExistenceFrom(entity);
        double HP = entity.getHealth();
        double maxHP = entity.getMaxHealth();

        if (HP < maxHP && !entity.hasEffect(StarlightEffects.SOURCE_BLOOD_REJUVENATION) && instance.isToggled()) {
            if (instance.isMastered(entity)) {
                StarlightUtils.applyTensuraEffect(entity, StarlightEffects.SOURCE_BLOOD_REJUVENATION, -1, 2);
            } else {
                StarlightUtils.applyTensuraEffect(entity, StarlightEffects.SOURCE_BLOOD_REJUVENATION, -1, 0);
            }
        }

        CompoundTag tag = instance.getOrCreateTag();
        int time = tag.getInt("activatedTimes");
        if (time % 20 == 0) {
            this.addMasteryPoint(instance, entity);
        }

        tag.putInt("activatedTimes", time + 1);
    }

    public boolean onTakenDamage(ManasSkillInstance instance, LivingEntity owner, DamageSource source, Changeable<Float> amount) {
        /*
        Reducee all elemental damage types by a flat amount based on % of source owned.
         */
        float originalDamageNum = amount.get();
        ManaCap mana = CapabilityRegistry.getMana(owner);
        double mPerc = instance.isMastered(owner) ? CONFIG.manaPercentMastered : CONFIG.manaPercentUnmastered;
        double manaPercent = mPerc / 100;
        if (TensuraDamageHelper.isTensuraMagic(source) || TensuraDamageHelper.isNaturalEffects(source)) {
            if (instance.isToggled()) {
                amount.set((float) Math.clamp((originalDamageNum - (mana.getMaxMana() * manaPercent)), 0.0, CONFIG.maximumReduction));
            }
        }

        return true;
    }
}