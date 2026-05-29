package com.github.propheticeclipse.tensurastarlight.utils;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

import java.util.List;
import java.util.stream.Collectors;

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

    public static List<LivingEntity> getTargetsInFront(Player player, double length, double up, double down, double left, double right) {
        Vec3 eyePos = player.getEyePosition(1.0F);
        Vec3 lookVec = player.getLookAngle().normalize();

        // Center of the AABB box in front of player
        Vec3 center = eyePos.add(lookVec.scale(length / 2.0));

        // Right vector (perpendicular to look and up)
        Vec3 upVec = new Vec3(0, 1, 0);
        Vec3 rightVec = lookVec.cross(upVec).normalize();

        // Calculate corners of the box based on direction and width/height/length
        Vec3 rightOffset = rightVec.scale(right);
        Vec3 leftOffset = rightVec.scale(-left);

        Vec3 min = center.add(leftOffset).subtract(0, down, 0).subtract(lookVec.scale(length / 2.0));
        Vec3 max = center.add(rightOffset).add(0, up, 0).add(lookVec.scale(length / 2.0));

        AABB box = new AABB(min, max);

        return player.level().getEntities(player, box, e -> e instanceof LivingEntity && e != player)
                .stream()
                .map(e -> (LivingEntity) e)
                .collect(Collectors.toList());
    }
}
