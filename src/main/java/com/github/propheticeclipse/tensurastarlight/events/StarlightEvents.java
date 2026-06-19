package com.github.propheticeclipse.tensurastarlight.events;

import com.github.hvnbael.trnightmare.util.SkillTickHandler;
import com.github.propheticeclipse.tensurastarlight.TensuraStarlight;
import com.github.propheticeclipse.tensurastarlight.config.skills.arsnouveauSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.aspectSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.registry.StarlightRaces;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUltimateSkills;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUniqueSkills;
import com.github.propheticeclipse.tensurastarlight.utils.StarlightUtils;
import com.hollingsworth.arsnouveau.api.util.DamageUtil;
import dev.architectury.event.events.common.TickEvent;
import io.github.hvnbael.legacytensura.capability.race.TensuraPlayerCapability;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.race.api.RaceAPI;
import io.github.manasmods.manascore.skill.api.ManasSkill;
import io.github.manasmods.manascore.skill.api.SkillEvents;
import io.github.manasmods.tensura.ability.SkillHelper;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.ability.TensuraSkillInstance;
import io.github.manasmods.tensura.ability.magic.Element;
import io.github.manasmods.tensura.registry.effect.TensuraMobEffects;
import io.github.manasmods.tensura.registry.skill.CommonSkills;
import io.github.manasmods.tensura.registry.skill.ExtraSkills;
import io.github.manasmods.tensura.storage.TensuraStorages;
import io.github.manasmods.tensura.storage.player.TensuraPlayerStorage;
import io.github.manasmods.tensura.storage.spirit.ISpiritWielder;
import io.github.manasmods.tensura.util.EnergyHelper;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;

import java.io.ObjectInputFilter;

@EventBusSubscriber(modid = TensuraStarlight.MODID)
public class StarlightEvents {
    private static final arsnouveauSeriesSkillConfig.sourceryConstitution SOURCERY_CONSTITUTION_CONFIG = ConfigRegistry.getConfig(arsnouveauSeriesSkillConfig.class).sourceryConstitution;

    @SubscribeEvent
    public static void onLivingDamagePre(LivingDamageEvent.Pre event) {
        DamageSource source = event.getSource();
        double originalDamage = event.getOriginalDamage();
        if (source.getEntity() instanceof LivingEntity sourceOwner) {

            if (source instanceof DamageUtil.SpellDamageSource) {

                if (SkillUtils.hasSkill(sourceOwner, StarlightUniqueSkills.SOURCERY_CONSTITUTION.get())) {
                    double spellDamageMod = SkillUtils.isSkillMastered(sourceOwner, StarlightUniqueSkills.SOURCERY_CONSTITUTION.get()) ? SOURCERY_CONSTITUTION_CONFIG.spellDamageModMastered : SOURCERY_CONSTITUTION_CONFIG.spellDamageModUnmastered;
                            event.setNewDamage((float) (originalDamage * spellDamageMod));
                }

            }

        }
    }
}
