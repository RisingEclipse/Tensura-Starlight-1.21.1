package com.github.propheticeclipse.tensurastarlight.utils;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;

public class ConeProjection {

    public static boolean isInFrontCone(LivingEntity source, LivingEntity target, double coneAngle, double range) {
        // Source eye position
        Vec3 sourcePos = source.getEyePosition(1.0F);

        // Target eye position
        Vec3 targetPos = target.getEyePosition(1.0F);

        // Calculate vector from source to target
        Vec3 toTarget = targetPos.subtract(sourcePos);

        // Distance check first (early out)
        if (toTarget.length() > range) {
            return false;
        }

        // Direction the source is looking
        Vec3 forward = source.getLookAngle();

        // Normalize vectors
        Vec3 toTargetNorm = toTarget.normalize();
        Vec3 forwardNorm = forward.normalize();

        // Compute the dot product (cosine of the angle between forward and toTarget)
        double dot = forwardNorm.dot(toTargetNorm);

        // Convert coneAngle from degrees to radians for Math.cos
        double halfAngleRad = Math.toRadians(coneAngle / 2);

        // Check if the angle is within the cone
        // dot >= cos(theta) means inside the cone
        return dot >= Math.cos(halfAngleRad);

        // This function was coded purely by AI, and as of writing works enough for me. If someone is willing to double check the above function for potential errors
        // Then feel free to submit a issue with new code or similar.
    }

}
