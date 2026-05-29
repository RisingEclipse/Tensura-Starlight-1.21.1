package com.github.propheticeclipse.tensurastarlight.registry.attachments;

import com.github.propheticeclipse.tensurastarlight.TensuraStarlight;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class StarlightAttachments {
    public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES =
            DeferredRegister.create(NeoForgeRegistries.ATTACHMENT_TYPES, TensuraStarlight.MODID);

    public static final Supplier<AttachmentType<StarlightPlayerAttachments>> STARLIGHT_PLAYER_ATTACHMENT =
            ATTACHMENT_TYPES.register("starlight_player_attachment", () -> AttachmentType.builder(StarlightPlayerAttachments::new)
                    .serialize(StarlightPlayerAttachments.CODEC)
                    .copyOnDeath()
                    .build());
}
