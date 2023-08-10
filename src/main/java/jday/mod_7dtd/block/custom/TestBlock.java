package jday.mod_7dtd.block.custom;

import jday.mod_7dtd.block.ModBlocks;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class TestBlock extends HorizontalFacingBlock {

    private static final VoxelShape SHAPE = Block.createCuboidShape(0, 0, 0, 32, 32, 16);
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public TestBlock(Settings settings) {
        super(settings);
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return (BlockState)state.with(FACING, mirror.apply((Direction)state.get(FACING)));
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
    /*
    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isClient) {
            if (state.getBlock() == ModBlocks.TEST7DTD && !entity.isFireImmune()) {
                if (!(entity instanceof PlayerEntity && ((PlayerEntity) entity).isCreative())) {
                    Direction dir = state.get(FACING);
                    if (dir == Direction.DOWN && Math.abs(Math.abs(entity.getBoundingBox().maxY) - Math.abs(pos.getY())) <= 1 / 16.0) {
                        entity.setOnFireFor(5);
                    }
                    if (dir == Direction.UP && Math.abs(Math.abs(entity.getBoundingBox().minY) - Math.abs(pos.getY())) >= 15 / 16.0) {
                        entity.setOnFireFor(5);
                    }
                    if (dir == Direction.WEST && Math.abs(Math.abs(entity.getBoundingBox().maxX) - Math.abs(pos.getX())) <= 1 / 16.0) {
                        entity.setOnFireFor(5);
                    }
                    if (dir == Direction.EAST && Math.abs(Math.abs(entity.getBoundingBox().minX) - Math.abs(pos.getX())) >= 15 / 16.0) {
                        entity.setOnFireFor(5);
                    }
                    if (dir == Direction.NORTH && Math.abs(Math.abs(entity.getBoundingBox().maxZ) - Math.abs(pos.getZ())) <= 1 / 16.0) {
                        entity.setOnFireFor(5);
                    }
                    if (dir == Direction.SOUTH && Math.abs(Math.abs(entity.getBoundingBox().minZ) - Math.abs(pos.getZ())) >= 15.0 / 16) {
                        entity.setOnFireFor(5);
                    }
                }
            }
        }
        super.onEntityCollision(state, world, pos, entity);
    }*/
}
