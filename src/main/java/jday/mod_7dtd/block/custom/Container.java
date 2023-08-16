package jday.mod_7dtd.block.custom;

import jday.mod_7dtd.item.ModItems;
import net.minecraft.block.BarrelBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BarrelBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.Random;

public class Container extends BarrelBlock {

    public Container(Settings settings) {
        super(settings.copy(Blocks.BARREL));
        //(BarrelBlockEntity) blockEntity).setStack(1, new ItemStack(ModItems.ammo762mmBulletAP, 5));
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    @Nullable
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client != null) {
            PlayerEntity p = client.player;
            p.sendMessage(Text.of("§6Container: " + state.getBlock().getName().getString()), true);
        }
        BarrelBlockEntity be = new BarrelBlockEntity(pos, state);
        if (Objects.equals(state.getBlock().getName().getString(), "block.mod_7dtd.cntcardboardbox")) {
            be.setStack(0, new ItemStack(ModItems.ammo762mmBulletAP, getRandomNumber(1, 44)));
            be.setStack(1, new ItemStack(ModItems.ammoArrowExploding, getRandomNumber(1, 20)));
        }
        return be;
    }

}
