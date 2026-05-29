package com.github.propheticeclipse.tensurastarlight.registry.attachments;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.neoforged.neoforge.attachment.IAttachmentHolder;

public class StarlightPlayerAttachments {
    private boolean isUnderFalseReset;

    // Codec uses this constructor to reconstruct the data from saving
    public static final Codec<StarlightPlayerAttachments> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    Codec.BOOL.fieldOf("AspectbornFalseReset").forGetter(StarlightPlayerAttachments::isAspectbornFalseReset)
            ).apply(instance, StarlightPlayerAttachments::new));

    // Constructor for the Codec
    public StarlightPlayerAttachments(boolean isUnderFalseReset) {
        this.isUnderFalseReset = isUnderFalseReset;
    }

    public StarlightPlayerAttachments(IAttachmentHolder holder) {
        this(false); // Default value when a player initializes
    }

    public void setAspectbornFalseReset(boolean underFalseReset) {
        this.isUnderFalseReset = underFalseReset;
    }

    public boolean isAspectbornFalseReset() {
        return this.isUnderFalseReset;
    }
}
