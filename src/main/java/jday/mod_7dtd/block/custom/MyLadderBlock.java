package jday.mod_7dtd.block.custom;

import jday.mod_7dtd.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.LadderBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class MyLadderBlock extends LadderBlock {
    public double ladderSpeed = 0.14D;
    public MyLadderBlock(Settings settings) {
        super(settings);
    }
    public LadderBlock setSpeed(double ladderSpeed) {
        this.ladderSpeed = ladderSpeed;
        return this;
    }
}
