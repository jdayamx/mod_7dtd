package jday.mod_7dtd.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class BlockX2W extends Block {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
    public BlockX2W(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.HORIZONTAL_FACING);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
        Direction dir = state.get(FACING);
        //return VoxelShapes.cuboid(0f, 0f, 0f, 2.0f, 1.0f, 1.0f);
        switch(dir) {
            case NORTH:
                return VoxelShapes.cuboid(0f, 0f, -1f, 1f, 1.0f, 1.0f);
            case SOUTH:
                return VoxelShapes.cuboid(0.0f, 0.0f, 0f, 1.0f, 1.0f, 2.0f);
            case EAST:
                return VoxelShapes.cuboid(0f, 0.0f, 0.0f, 2f, 1.0f, 1.0f);
            case WEST:
                return VoxelShapes.cuboid(-1f, 0.0f, 0.0f, 1f, 1.0f, 1.0f);
            default:
                return VoxelShapes.fullCube();
        }
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

}
