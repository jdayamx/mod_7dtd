package jday.mod_7dtd;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import jday.mod_7dtd.block.ModBlocks;
import jday.mod_7dtd.item.ModItemGroup;
import jday.mod_7dtd.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.registry.RegistryKey;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mod_7dtd implements ModInitializer {
    public static final String MOD_ID = "mod_7dtd";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        ModItemGroup.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        FuelRegistry.INSTANCE.add(ModItems.resourceWood, 200);
        FuelRegistry.INSTANCE.add(ModItems.resourcePaper, 50);
        FuelRegistry.INSTANCE.add(ModItems.resourceYuccaFibers, 10);
        FuelRegistry.INSTANCE.add(ModBlocks.baseWoodBlock, 400);
        FuelRegistry.INSTANCE.add(ModBlocks.bridgeWoodBlock, 2900);

        Mod_7dtd.LOGGER.info("Loading mod");
    }
}
