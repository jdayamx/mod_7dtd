package jday.mod_7dtd.block.custom;

import jday.mod_7dtd.item.ModItems;
import net.minecraft.block.BarrelBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BarrelBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class ContainerXC extends BarrelBlock {
    public ContainerXC(Settings settings) {
        super(settings.copy(Blocks.BARREL));
        //(BarrelBlockEntity) blockEntity).setStack(1, new ItemStack(ModItems.ammo762mmBulletAP, 5));
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    @Nullable
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        MinecraftClient client = MinecraftClient.getInstance();
        /*if (client != null) {
            PlayerEntity p = client.player;
            p.sendMessage(Text.of("§6Container: " + state.getBlock().getName().getString()), true);
        }*/
        BarrelBlockEntity be = new BarrelBlockEntity(pos, state);
        if (Objects.equals(state.getBlock().getName().getString(), "block.mod_7dtd.cntcoffeemaker")) {
            be.setStack(0, new ItemStack(ModItems.plantedCoffee1, getRandomNumber(1, 4)));
            be.setStack(1, new ItemStack(ModItems.drinkJarRiverWater, getRandomNumber(0, 2)));
        }
        return be;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
        Direction dir = state.get(FACING);
        switch(dir) {
            case NORTH:
                return VoxelShapes.cuboid(0f, 0f, 0.2f, 1f, 0.8f, 0.8f);
            case SOUTH:
                return VoxelShapes.cuboid(0.0f, 0.0f, 0.2f, 1.0f, 0.8f, 0.8f);
            case EAST:
                return VoxelShapes.cuboid(0f, 0.2f, 0.0f, 0.8f, 0.8f, 1.0f);
            case WEST:
                return VoxelShapes.cuboid(0.2f, 0.0f, 0.0f, 0.8f, 0.8f, 1.0f);
            case UP:
                return VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 1f, 0.5f, 1.0f);
            case DOWN:
                return VoxelShapes.cuboid(0.0f, 0.5f, 0.0f, 1f, 1.0f, 1.0f);
            default:
                return VoxelShapes.fullCube();
        }
    }
}
