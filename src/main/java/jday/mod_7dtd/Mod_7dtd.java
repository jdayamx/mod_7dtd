package jday.mod_7dtd;

import jday.mod_7dtd.block.ModBlocks;
import jday.mod_7dtd.item.ModItemGroup;
import jday.mod_7dtd.item.ModItems;
import net.fabricmc.api.ModInitializer;
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
        Mod_7dtd.LOGGER.info("Loading mod");
    }
}
