package com.github.propheticeclipse.tensurastarlight.registry.attachments;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.neoforged.neoforge.attachment.IAttachmentHolder;

public class StarlightPlayerAttachments {
    private boolean isUnderFalseReset;
    private boolean isUnderSmallMoonReset;
    private boolean isUnderLargePlanetReset;
    private long falseResetCount;

    // Codec uses this constructor to reconstruct the data from saving
    public static final Codec<StarlightPlayerAttachments> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    Codec.BOOL.fieldOf("AspectbornFalseReset").forGetter(StarlightPlayerAttachments::isAspectbornFalseReset),
                    Codec.BOOL.fieldOf("SmallMoonFalseReset").forGetter(StarlightPlayerAttachments::isSmallMoonFalseReset),
                    Codec.BOOL.fieldOf("LargePlanetFalseReset").forGetter(StarlightPlayerAttachments::isLargePlanetFalseReset),
                    Codec.LONG.fieldOf("FalseResetCounter").forGetter(StarlightPlayerAttachments::falseResetCounter)
            ).apply(instance, StarlightPlayerAttachments::new));

    // Constructor for the Codec
    public StarlightPlayerAttachments(boolean isUnderFalseReset, boolean isUnderSmallMoonFalseReset, boolean isUnderLargePlanetFalseReset, long falseResetCount) {
        this.isUnderFalseReset = isUnderFalseReset;
        this.isUnderSmallMoonReset = isUnderSmallMoonFalseReset;
        this.isUnderLargePlanetReset = isUnderLargePlanetFalseReset;
        this.falseResetCount = falseResetCount;
    }

    public StarlightPlayerAttachments(IAttachmentHolder holder) {
        this(false, false, false, 0); // Default value when a player initializes
        // For some reason when reading these (after being set) within the getNextEvo function of races it defaults to the.. default values shown here.
        // I dunno wtf the issue could be icl. Maybe its purely client side? No clue.
    }

    public void setAspectbornFalseReset(boolean underFalseReset) {
        this.isUnderFalseReset = underFalseReset;
    }
    public void setSmallMoonReset(boolean underFalseReset) {
        this.isUnderSmallMoonReset = underFalseReset;
    }
    public void setLargePlanetReset(boolean underFalseReset) {
        this.isUnderLargePlanetReset = underFalseReset;
    }
    public void setFalseResetCount(long falseResetCount) {
        this.falseResetCount = falseResetCount;
    }

    public boolean isAspectbornFalseReset() {
        return this.isUnderFalseReset;
    }
    public boolean isSmallMoonFalseReset() {
        return this.isUnderSmallMoonReset;
    }
    public boolean isLargePlanetFalseReset() {
        return this.isUnderLargePlanetReset;
    }
    public long falseResetCounter() {
        return this.falseResetCount;
    }
}
