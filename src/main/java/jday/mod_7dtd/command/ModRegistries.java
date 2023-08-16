package jday.mod_7dtd.command;

import jday.mod_7dtd.block.ModBlocks;
import jday.mod_7dtd.event.ModPlayerEventCopyFrom;
import jday.mod_7dtd.item.ModItems;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import jday.mod_7dtd.Mod_7dtd;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
        registerCommands();
        registerEvents();
    }
    private static void registerFuels() {
        Mod_7dtd.LOGGER.info("Registering Fuels for " + Mod_7dtd.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        // add item to be fuel
        registry.add(ModItems.resourceWood, 200);
        registry.add(ModItems.resourcePaper, 50);
        registry.add(ModItems.resourceYuccaFibers, 10);
        registry.add(ModBlocks.baseWoodBlock, 400);
        registry.add(ModBlocks.bridgeWoodBlock, 2900);
        registry.add(ModItems.ammoGasCan, 5000);
    }

    private static void registerCommands() {
        CommandRegistrationCallback.EVENT.register(SetHomeCommand::register);
        CommandRegistrationCallback.EVENT.register(HomeCommand::register);
    }

    private static void registerEvents() {
        ServerPlayerEvents.COPY_FROM.register(new ModPlayerEventCopyFrom());
    }
}
