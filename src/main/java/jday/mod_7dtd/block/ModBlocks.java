package jday.mod_7dtd.block;

import jday.mod_7dtd.Mod_7dtd;
import jday.mod_7dtd.block.custom.Container;
import jday.mod_7dtd.block.custom.TestBlock;
import jday.mod_7dtd.block.custom.UpdateOnUse;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block TEST7DTD = registerBlock("test7dtd",
            new TestBlock(FabricBlockSettings.copyOf(Blocks.FLOWER_POT)));
    public static final Block bridgeWoodBlock = registerBlock("bridgewoodblock",
            new UpdateOnUse(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).hardness(32f).strength(3f)));
    public static final Block baseWoodBlock = registerBlock("basewoodblock",
            new UpdateOnUse(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).hardness(0.01f)));

    public static final Block controlPanelBase08 = registerBlock("controlpanelbase08",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).hardness(30f)));
    public static final Block controlPanelTop07 = registerBlock("controlpaneltop07",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).hardness(20f)));
    public static final Block cobblestoneMaster = registerBlock("cobblestonemaster",
            new UpdateOnUse(FabricBlockSettings.copyOf(Blocks.STONE).hardness(64f).strength(20f)));
    public static final Block concreteMaster = registerBlock("concretemaster",
            new UpdateOnUse(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).hardness(128f).strength(30f)));
    public static final Block steelMaster = registerBlock("steelmaster",
            new UpdateOnUse(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).hardness(256f).strength(40f)));

    public static final Block cntShippingCrateBookstore = registerContainerBlock("cntshippingcratebookstore",
            new Container(FabricBlockSettings.copyOf(Blocks.BARREL).hardness(256f).strength(40f)), 600);
    //public static final Item cntShippingCrateBookstore = registerItem("cntshippingcratebookstore", new Item(new FabricItemSettings()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Mod_7dtd.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Mod_7dtd.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    private static Container registerContainerBlock(String name, Container block, int burnTime) {

        registerBlockItem(name, block);
        if (burnTime > 0) FuelRegistry.INSTANCE.add(block, burnTime);
        return Registry.register(Registries.BLOCK, new Identifier(Mod_7dtd.MOD_ID, name), block);
        //Identifier identifier = new Identifier(Mod_7dtd.MOD_ID, Id.toLowerCase());
        //Registry.register(Registry.BLOCK, identifier, block);
        //Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(Initialise.VARIANTBARRELS)));
        //if (canBurn) FuelRegistry.INSTANCE.add(block, 300);
        //MOD_BARRELS.put(identifier, block);
    }

    public static void registerModBlocks() {
        Mod_7dtd.LOGGER.info("Registering ModBlocks for " + Mod_7dtd.MOD_ID);
    }
}
