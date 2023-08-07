package jday.mod_7dtd.block;

import jday.mod_7dtd.Mod_7dtd;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block bridgeWoodBlock = registerBlock("bridgewoodblock",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block baseWoodBlock = registerBlock("basewoodblock",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).hardness(0.1f)));
    public static final Block controlPanelBase08 = registerBlock("controlpanelbase08",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).hardness(5f)));
    public static final Block controlPanelTop07 = registerBlock("controlpaneltop07",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).hardness(2.5f)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Mod_7dtd.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Mod_7dtd.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        Mod_7dtd.LOGGER.info("Registering ModBlocks for " + Mod_7dtd.MOD_ID);
    }
}
