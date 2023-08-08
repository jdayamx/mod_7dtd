package jday.mod_7dtd.block.custom;

import jday.mod_7dtd.block.ModBlocks;
import jday.mod_7dtd.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class UpdateOnUse extends Block {

    public UpdateOnUse(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
                              PlayerEntity player, Hand hand, BlockHitResult hit) {
        PlayerInventory inv = player.getInventory();
        if (inv.getMainHandStack().isOf(Items.STONE_AXE)) {
            // check if stone axe in hand
            //world.playSound(player, pos, SoundEvents.ENTITY_PIG_HURT, SoundCategory.BLOCKS, 1f, 1f);

            if (state.isOf(ModBlocks.baseWoodBlock)) {
                //world.playSound(player, pos, SoundEvents.ITEM_SPYGLASS_USE, SoundCategory.BLOCKS, 1f, 1f);
                int sl = inv.indexOf(ModItems.resourceWood.getDefaultStack());
                if (sl > 0) {
                    int st = inv.getStack(sl).getCount();

                    if (st >= 8) {
                        ItemStack sss = new ItemStack(ModItems.resourceWood, st -8);
                        world.playSound(player, pos, SoundEvents.BLOCK_WOOD_STEP, SoundCategory.BLOCKS, 2f, 2f);
                        inv.setStack(sl, sss);
                        player.sendMessage(Text.of("Block is updated"), true);
                        world.setBlockState(pos, ModBlocks.bridgeWoodBlock.getDefaultState());
                    } else {
                        player.sendMessage(Text.of("&4Not found resources"), true);
                    }
                }
            }  else if (state.isOf(ModBlocks.bridgeWoodBlock)) {
                int sl = inv.indexOf(ModItems.resourceCobblestones.getDefaultStack());
                if (sl > 0) {
                    int st = inv.getStack(sl).getCount();

                    if (st >= 8) {
                        ItemStack sss = new ItemStack(ModItems.resourceCobblestones, st -8);
                        world.playSound(player, pos, SoundEvents.BLOCK_DRIPSTONE_BLOCK_FALL, SoundCategory.BLOCKS, 1f, 1f);
                        inv.setStack(sl, sss);
                        player.sendMessage(Text.of("§2Block is updated"), true);
                        world.setBlockState(pos, ModBlocks.cobblestoneMaster.getDefaultState());
                    } else {
                        player.sendMessage(Text.of("§eNot found resources"), true);
                    }
                }
            } else {
                world.playSound(player, pos, SoundEvents.BLOCK_NOTE_BLOCK_XYLOPHONE.value(), SoundCategory.BLOCKS, 1f, 1f);
            }

        } else {
            return ActionResult.FAIL;
            //world.playSound(player, pos, SoundEvents.BLOCK_NOTE_BLOCK_XYLOPHONE.value(), SoundCategory.BLOCKS, 1f, 1f);
        }

        //if (inv.indexOf(ModItems.resourceWood))



        return ActionResult.SUCCESS;
    }
}
