package jday.mod_7dtd.block.custom;

import jday.mod_7dtd.Mod_7dtd;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.enums.JigsawOrientation;
import net.minecraft.block.enums.WallMountLocation;
import net.minecraft.datafixer.fix.ChunkPalettedStorageFix;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import static net.minecraft.block.WallMountedBlock.FACE;

public class BlockX1H3 extends Block {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
    public BlockX1H3(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState()
                .with(FACING, Direction.NORTH)
                //.with(FACE, WallMountLocation.WALL)
        );

    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.HORIZONTAL_FACING);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
        Direction dir = state.get(FACING);
        //return VoxelShapes.cuboid(0f, 0f, 0.8f, 1f, 1.0f, 1.0f);
        //Mod_7dtd.LOGGER.info("dir " + FACING);
        switch(dir) {
            case NORTH:
                return VoxelShapes.cuboid(0f, 0f, 0.8f, 1f, 1.0f, 1.0f);
            case SOUTH:
                return VoxelShapes.cuboid(0.0f, 0.0f, 0f, 1.0f, 1.0f, 0.2f);
            case EAST:
                return VoxelShapes.cuboid(0f, 0.0f, 0.0f, 0.2f, 1.0f, 1.0f);
            case WEST:
                return VoxelShapes.cuboid(0.8f, 0.0f, 0.0f, 1f, 1.0f, 1.0f);
            default:
                return VoxelShapes.fullCube();
        }
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx)
                .with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite())
                /*.with(Properties.ORIENTATION, ctx.getPlayerLookDirection().getOpposite())*/;
    }

}
