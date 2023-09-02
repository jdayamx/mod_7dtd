package jday.mod_7dtd.block;

import jday.mod_7dtd.Mod_7dtd;
import jday.mod_7dtd.block.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.*;
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
    public static final Block brickNoUpgradeMaster = registerBlock("bricknoupgrademaster",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).hardness(64f).strength(20f)));

    public static final Block testStairs = registerBlock("teststairs",
            new StairsBlock(Blocks.STONE_STAIRS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.FLOWER_POT).hardness(64f).strength(20f)));

    public static final Block testWall = registerBlock("testwall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block jailBarsWhite = registerBlock("jailbarswhite",
            new BlockX2H(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).hardness(64f).strength(20f)));

    public static final Block powerSwitch01 = registerBlock("powersswitch01",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.ACACIA_BUTTON)));
    public static final Block powerSwitch02 = registerBlock("powersswitch02",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.ACACIA_BUTTON)));
    public static final Block conduitSingleOffset = registerBlock("conduitsingleoffset",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.ACACIA_BUTTON)));
    public static final Block counterMountedSinkCommercial = registerBlock("countermountedsinkcommercial",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.CAULDRON)));
    public static final Block metalRailingDouble = registerBlock("metalrailingdouble",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.ACACIA_BUTTON)));
    public static final Block metalRailingDiagonal = registerBlock("metalrailingdiagonal",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));

    public static final Block metalRailingCNR = registerBlock("metalrailingcnr",
            new BlockX1H3a(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block metalRivetSheet = registerBlock("metalrivetsheet",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block palletEmpty = registerBlock("palletempty",
            new BlockX1W3(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block palletEmptyStack = registerBlock("palletemptystack",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));

    public static final Block wood3h = registerBlock("wood3h",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block glass1 = registerBlock("glass1",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block table1 = registerBlock("table1",
            new BlockX2W(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));

    public static final Block cntToilet01 = registerBlock("cnttoilet01",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block cntToilet02 = registerBlock("cnttoilet02",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block cntToilet03 = registerBlock("cnttoilet03",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));

    public static final Block showerHead = registerBlock("showerhead",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block showerHead02 = registerBlock("showerhead02",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));

    // light
    public static final Block ceilingLight02 = registerBlock("ceilinglight02",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON).lightLevel(8)));

    public static final Block bunkBedFrame = registerBlock("bunkbedframe",
            new BlockX2W(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block bunkBedMattress = registerBlock("bunkbedmattress",
            new BlockX2W(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block bunkBedMessy = registerBlock("bunkbedmessy",
            new BlockX2W(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));

    public static final Block chairCampingWhite = registerBlock("chaircampingwhite",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block chairFoldingMetalUnfoldedWhite = registerBlock("chairfoldingmetalunfoldedwhite",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block chairWood01 = registerBlock("chairwood01",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block wallMountSinkCommercial = registerBlock("wallmountsinkcommercial",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block urinalCommercialMounted = registerBlock("urinalcommercialmounted",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block cntFileCabinetShortClosed = registerBlock("cntfilecabinetshortclosed",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    //public static final Item cntFileCabinetShortClosed = registerItem("cntfilecabinetshortclosed", new Item(new FabricItemSettings()));
    //public static final Item urinalCommercialMounted = registerItem("urinalcommercialmounted", new Item(new FabricItemSettings()));
    //public static final Item wallMountSinkCommercial = registerItem("wallmountsinkcommercial", new Item(new FabricItemSettings()));
    public static final Block whitePicketFenceSheet = registerBlock("whitepicketfencesheet",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block woodFenceSheet = registerBlock("woodfencesheet",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));

    //public static final Item woodFenceSheet = registerItem("woodfencesheet", new Item(new FabricItemSettings()));
    public static final Block woodLogPillar100 = registerBlock("woodlogpillar100",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block workLightPOI = registerBlock("worklightpoi",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block cntWaterCoolerFull = registerBlock("cntwatercoolerfull",
            new BlockX2H(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));

    public static final Block concreteMaster = registerBlock("concretemaster",
            new UpdateOnUse(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).hardness(128f).strength(30f)));
    public static final Block steelMaster = registerBlock("steelmaster",
            new UpdateOnUse(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).hardness(256f).strength(40f)));

    public static final Block cntShippingCrateBookstore = registerContainerBlock("cntshippingcratebookstore",
            new Container(FabricBlockSettings.copyOf(Blocks.BARREL)), 600);
    public static final Block cntShippingCrateCarParts = registerContainerBlock("cntshippingcratecarparts",
            new Container(FabricBlockSettings.copyOf(Blocks.BARREL)), 600);
    public static final Block cntShippingCrateHero = registerContainerBlock("cntshippingcratehero",
            new Container(FabricBlockSettings.copyOf(Blocks.BARREL)), 600);
    public static final Block cntShippingCrateLabEquipment = registerContainerBlock("cntshippingcratelabequipment",
            new Container(FabricBlockSettings.copyOf(Blocks.BARREL)), 600);
    public static final Block cntShippingCrateMoPowerElectronics = registerContainerBlock("cntshippingcratemopowerelectronics",
            new Container(FabricBlockSettings.copyOf(Blocks.BARREL)), 600);
    public static final Block cntShippingCrateSavageCountry = registerContainerBlock("cntshippingcratesavagecountry",
            new Container(FabricBlockSettings.copyOf(Blocks.BARREL)), 600);
    public static final Block cntShippingCrateShamway = registerContainerBlock("cntshippingcrateshamway",
            new Container(FabricBlockSettings.copyOf(Blocks.BARREL)), 600);
    public static final Block cntShippingCrateShotgunMessiah = registerContainerBlock("cntshippingcrateshotgunmessiah",
            new Container(FabricBlockSettings.copyOf(Blocks.BARREL)), 600);
    public static final Block cntShippingCrateWorkingStiffs = registerContainerBlock("cntshippingcrateworkingstiffs",
            new Container(FabricBlockSettings.copyOf(Blocks.BARREL)), 600);
    public static final Block cntCardboardBox = registerContainerBlock("cntcardboardbox",
            new Container(FabricBlockSettings.copyOf(Blocks.BARREL)), 200);

    public static final Block chainlinkFenceBottomPlainCorner = registerBlock("chainlinkfencebottomplaincorner",
            new BlockX1H3a(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block chainlinkFenceBottomPlain = registerBlock("chainlinkfencebottomplain",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block chainlinkFenceBottomPlainPoleLeft = registerBlock("chainlinkfencebottomplainpoleleft",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block chainlinkFenceBottomPlainPoleRight = registerBlock("chainlinkfencebottomplainpoleright",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block chainlinkFenceBottomRail = registerBlock("chainlinkfencebottomrail",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block chainlinkFenceBottomRailPoleCorner = registerBlock("chainlinkfencebottomrailpolecorner",
            new BlockX1H3a(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block chainlinkFenceBottomRailPoleLeft = registerBlock("chainlinkfencebottomrailpoleleft",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block chainlinkFenceBottomRailPoleRight = registerBlock("chainlinkfencebottomrailpoleright",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block chainlinkFenceDoor = registerBlock("chainlinkfencedoor",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_DOOR).nonOpaque(), BlockSetType.BAMBOO));
    public static final Block chainlinkFencePole02 = registerBlock("chainlinkfencepole02",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block chainlinkFencePole03 = registerBlock("chainlinkfencepole03",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block chainlinkFencePole = registerBlock("chainlinkfencepole",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block chainlinkFenceTopPlainCorner = registerBlock("chainlinkfencetopplaincorner",
            new BlockX1H3a(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block chainlinkFenceTopPlainPoleLeft = registerBlock("chainlinkfencetopplainpoleleft",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block chainlinkFenceTopPlainPoleRight = registerBlock("chainlinkfencetopplainpoleright",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block chainlinkFenceTopPlainRail = registerBlock("chainlinkfencetopplainrail",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block chainlinkFenceTopRailBridge = registerBlock("chainlinkfencetoprailbridge",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));

    // doors
    public static final Block doorWhite = registerBlock("doorwhite",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_DOOR).nonOpaque(), BlockSetType.BAMBOO));

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
