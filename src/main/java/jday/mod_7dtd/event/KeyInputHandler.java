package jday.mod_7dtd.event;

import jday.mod_7dtd.block.ModBlocks;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;

public class KeyInputHandler {
    public static final String KEY_CATEGORY_7DTD = "key.category.mod_7dtd.7dtd";
    public static final String KEY_CHANGE_BLOCK_FORM = "key.mod_7dtd.change_block_form";
    public static final String KEY_MODIFY_ITEM = "key.mod_7dtd.modify_item";
    public static final String KEY_DESTROY_ITEM = "key.mod_7dtd.destroy_item";
    public static final String KEY_EQUIP_ITEM = "key.mod_7dtd.equip_item";

    public static KeyBinding changeBlockForm;
    public static KeyBinding modifyItem;
    public static KeyBinding destroyItem;
    public static KeyBinding equipItem;

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client->{
            if (changeBlockForm.wasPressed()) {
                // press R on specific block in hand
                PlayerInventory inv = client.player.getInventory();
                if (
                        inv.getMainHandStack().isOf(ModBlocks.baseWoodBlock.asItem()) ||
                        inv.getMainHandStack().isOf(ModBlocks.bridgeWoodBlock.asItem()) ||
                        inv.getMainHandStack().isOf(ModBlocks.cobblestoneMaster.asItem()) ||
                        inv.getMainHandStack().isOf(ModBlocks.concreteMaster.asItem()) ||
                        inv.getMainHandStack().isOf(ModBlocks.steelMaster.asItem())
                ) {
                    client.world.playSound(
                            client.player,
                            client.player.getBlockPos(),
                            SoundEvents.ENTITY_PIG_DEATH,
                            SoundCategory.BLOCKS,
                            1f,
                            1f
                    ); // sound to death pig :))))) for test
                }
                client.player.sendMessage(Text.of("§1Pressed changeBlockForm"), true);
            }
            if (modifyItem.wasPressed()) {
                // do some
                client.player.sendMessage(Text.of("§2Pressed modifyItem"), true);
            }
            if (destroyItem.wasPressed()) {
                // do some
                client.player.sendMessage(Text.of("§3Pressed destroyItem"), true);
            }
            if (equipItem.wasPressed()) {
                // do some
                client.player.sendMessage(Text.of("§4Pressed equipItem"), true);
            }
        });
    }

    public static void register() {
        changeBlockForm = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_CHANGE_BLOCK_FORM,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_R,
                KEY_CATEGORY_7DTD
        ));

        modifyItem = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_MODIFY_ITEM,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_Z,
                KEY_CATEGORY_7DTD
        ));

        destroyItem = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_DESTROY_ITEM,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_V,
                KEY_CATEGORY_7DTD
        ));

        equipItem = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_EQUIP_ITEM,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_B,
                KEY_CATEGORY_7DTD
        ));

        registerKeyInputs();
    }
}
