package jday.mod_7dtd.datagen;

import jday.mod_7dtd.block.ModBlocks;
import jday.mod_7dtd.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;

public class ModLootTableProvider  extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.bridgeWoodBlock, ModItems.resourceWood);
        addDrop(ModBlocks.baseWoodBlock, ModItems.resourceWood);
        addDrop(ModBlocks.controlPanelBase08, ModItems.resourceScrapIron);

        addDrop(Blocks.SAND, ModItems.resourceCrushedSand);
        addDrop(Blocks.GRASS_BLOCK, ModItems.resourceClayLump);
        addDrop(Blocks.DIRT, ModItems.resourceClayLump);
        addDrop(Blocks.STONE, ModItems.resourceRockSmall);
    }
}
