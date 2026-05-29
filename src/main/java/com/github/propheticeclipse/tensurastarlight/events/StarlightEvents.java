package com.github.propheticeclipse.tensurastarlight.events;

import com.github.propheticeclipse.tensurastarlight.TensuraStarlight;
import com.github.propheticeclipse.tensurastarlight.config.skills.arsnouveauSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUniqueSkills;
import com.hollingsworth.arsnouveau.api.util.DamageUtil;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.tensura.ability.SkillUtils;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;

@EventBusSubscriber(modid = TensuraStarlight.MODID)
public class StarlightEvents {
    private static final arsnouveauSeriesSkillConfig.sourceryConstitution CONFIG = ConfigRegistry.getConfig(arsnouveauSeriesSkillConfig.class).sourceryConstitution;

    @SubscribeEvent
    public static void onLivingDamagePre(LivingDamageEvent.Pre event) {
        DamageSource source = event.getSource();
        double originalDamage = event.getOriginalDamage();
        if (source.getEntity() instanceof LivingEntity sourceOwner) {

            if (source instanceof DamageUtil.SpellDamageSource) {

                if (SkillUtils.hasSkill(sourceOwner, StarlightUniqueSkills.SOURCERY_CONSTITUTION.get())) {
                    double spellDamageMod = SkillUtils.isSkillMastered(sourceOwner, StarlightUniqueSkills.SOURCERY_CONSTITUTION.get()) ? CONFIG.spellDamageModMastered : CONFIG.spellDamageModUnmastered;
                            event.setNewDamage((float) (originalDamage * spellDamageMod));
                }

            }

        }
    }
}
