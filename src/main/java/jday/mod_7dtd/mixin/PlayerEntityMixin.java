package jday.mod_7dtd.mixin;


import jday.mod_7dtd.block.custom.MyLadderBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntityMixin {

    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    protected Vec3d getMotionOnLadder(Vec3d playerMotion, double ladderSpeed) {
        Vec3d motion;
        double x = MathHelper.clamp(playerMotion.x, -0.15000000596046448D, 0.15000000596046448D);
        double z = MathHelper.clamp(playerMotion.z, -0.15000000596046448D, 0.15000000596046448D);
        double y = Math.max(playerMotion.y, -0.15000000596046448D);
        if (this.isHoldingOntoLadder()) {
            motion = new Vec3d(x, y, z);
        } else if (horizontalCollision || jumping) {
            motion = new Vec3d(x, ladderSpeed, z);
        } else {
            motion = new Vec3d(x, -ladderSpeed, z);
        }
        return motion;
    }

    @Override
    protected void applyClimbingSpeed(Vec3d motion, CallbackInfoReturnable<Vec3d> cir) {
        BlockPos blockPos = getBlockPos();
        Block block = getEntityWorld().getBlockState(blockPos).getBlock();
        if (isClimbing()) {
            this.fallDistance = 0.0F;
            if (block.getDefaultState().getBlock() == Blocks.LADDER) {
                motion = getMotionOnLadder(motion, 0.12D);
            } else if (block instanceof MyLadderBlock) {
                motion = getMotionOnLadder(motion, ((MyLadderBlock) block).ladderSpeed);
            }
        }
        cir.setReturnValue(motion);
    }
}