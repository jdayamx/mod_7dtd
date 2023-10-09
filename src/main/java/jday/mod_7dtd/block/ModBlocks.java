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
import net.minecraft.sound.BlockSoundGroup;
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

    // bricks
    public static final Block Brick1 = registerBlock("brick1",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Brick2 = registerBlock("brick2",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Brick3 = registerBlock("brick3",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Brick4 = registerBlock("brick4",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Brick5 = registerBlock("brick5",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Brick6 = registerBlock("brick6",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Brick7 = registerBlock("brick7",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Brick8 = registerBlock("brick8",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Brick9 = registerBlock("brick9",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Brick10 = registerBlock("brick10",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Brick11 = registerBlock("brick11",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Brick12 = registerBlock("brick12",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Brick13 = registerBlock("brick13",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Brick14 = registerBlock("brick14",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    // floor
    public static final Block Floor1 = registerBlock("floor1",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Floor2 = registerBlock("floor2",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Floor3 = registerBlock("floor3",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Floor4 = registerBlock("floor4",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    // tile
    public static final Block Tile1 = registerBlock("tile1",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Tile2 = registerBlock("tile2",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Tile3 = registerBlock("tile3",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Tile4 = registerBlock("tile4",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Tile5 = registerBlock("tile5",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Tile6 = registerBlock("tile6",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Tile7 = registerBlock("tile7",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Tile8 = registerBlock("tile8",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Tile9 = registerBlock("tile9",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Tile10 = registerBlock("tile10",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Tile11 = registerBlock("tile11",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Tile12 = registerBlock("tile12",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    // walls
    public static final Block Wall1 = registerBlock("wall1",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall2 = registerBlock("wall2",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall3 = registerBlock("wall3",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall4 = registerBlock("wall4",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall5 = registerBlock("wall5",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall6 = registerBlock("wall6",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall7 = registerBlock("wall7",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall8 = registerBlock("wall8",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall9 = registerBlock("wall9",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall10 = registerBlock("wall10",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall11 = registerBlock("wall11",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall12 = registerBlock("wall12",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall13 = registerBlock("wall13",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall14 = registerBlock("wall14",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall15 = registerBlock("wall15",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall16 = registerBlock("wall16",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall17 = registerBlock("wall17",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall18 = registerBlock("wall18",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall19 = registerBlock("wall19",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall20 = registerBlock("wall20",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall21 = registerBlock("wall21",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall22 = registerBlock("wall22",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall23 = registerBlock("wall23",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall24 = registerBlock("wall24",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall25 = registerBlock("wall25",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall26 = registerBlock("wall26",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall27 = registerBlock("wall27",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall28 = registerBlock("wall28",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall29 = registerBlock("wall29",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall30 = registerBlock("wall30",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall31 = registerBlock("wall31",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall32 = registerBlock("wall32",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall33 = registerBlock("wall33",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall34 = registerBlock("wall34",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall35 = registerBlock("wall35",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall36 = registerBlock("wall36",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall37 = registerBlock("wall37",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall38 = registerBlock("wall38",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall39 = registerBlock("wall39",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall40 = registerBlock("wall40",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall41 = registerBlock("wall41",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall42 = registerBlock("wall42",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall43 = registerBlock("wall43",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall44 = registerBlock("wall44",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall45 = registerBlock("wall45",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall46 = registerBlock("wall46",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall47 = registerBlock("wall47",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wall48 = registerBlock("wall48",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    // woods
    public static final Block Wood1 = registerBlock("wood1",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood2 = registerBlock("wood2",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood3 = registerBlock("wood3",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood4 = registerBlock("wood4",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood5 = registerBlock("wood5",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood6 = registerBlock("wood6",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood7 = registerBlock("wood7",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood8 = registerBlock("wood8",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood9 = registerBlock("wood9",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood10 = registerBlock("wood10",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood12 = registerBlock("wood12",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood13 = registerBlock("wood13",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood14 = registerBlock("wood14",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood15 = registerBlock("wood15",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood16 = registerBlock("wood16",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood17 = registerBlock("wood17",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood18 = registerBlock("wood18",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood19 = registerBlock("wood19",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood20 = registerBlock("wood20",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood21 = registerBlock("wood21",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood22 = registerBlock("wood22",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood23 = registerBlock("wood23",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood24 = registerBlock("wood24",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood25 = registerBlock("wood25",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood26 = registerBlock("wood26",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood27 = registerBlock("wood27",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood28 = registerBlock("wood28",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood29 = registerBlock("wood29",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood30 = registerBlock("wood30",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood31 = registerBlock("wood31",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood32 = registerBlock("wood32",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood33 = registerBlock("wood33",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood34 = registerBlock("wood34",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood35 = registerBlock("wood35",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood36 = registerBlock("wood36",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood37 = registerBlock("wood37",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood38 = registerBlock("wood38",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood39 = registerBlock("wood39",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood40 = registerBlock("wood40",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood41 = registerBlock("wood41",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Wood43 = registerBlock("wood43",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    // roofs
    public static final Block Roof1 = registerBlock("roof1",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Roof2 = registerBlock("roof2",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Roof3 = registerBlock("roof3",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Roof4 = registerBlock("roof4",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Roof5 = registerBlock("roof5",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Roof6 = registerBlock("roof6",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Roof7 = registerBlock("roof7",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Roof8 = registerBlock("roof8",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Roof9 = registerBlock("roof9",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block Roof10 = registerBlock("roof10",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));

    public static final Block counterHollowCabinetBroken = registerBlock("counterhollowcabinetbroken",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block counterHollowCabinetOpen = registerBlock("counterhollowcabinetopen",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block cntCupboardCabinetRedTopLootHelper = registerBlock("cntcupboardcabinetredtoploothelper",
            new ContainerX5(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block cntCupboardCornerCNRRed = registerBlock("cntcupboardcornercnrred",
            new Container(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block cntCabinetBottomFiller = registerBlock("cntcabinetbottomfiller",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block cntCabinetBottom = registerBlock("cntcabinetbottom",
            new Container(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block cntCabinetBottomOpen = registerBlock("cntcabinetbottomopen",
            new Container(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block cntCoffeeMaker = registerBlock("cntcoffeemaker",
            new ContainerXC(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));

    //public static final Item cntCoffeeMaker = registerItem("cntcoffeemaker", new Item(new FabricItemSettings()));
    //public static final Item cntCabinetBottomOpen = registerItem("cntcabinetbottomopen", new Item(new FabricItemSettings()));
    //public static final Item cntCabinetBottomFiller = registerItem("cntcabinetbottomfiller", new Item(new FabricItemSettings()));
    //public static final Item cntCupboardCornerCNRRed = registerItem("cntcupboardcornercnrred", new Item(new FabricItemSettings()));
    //public static final Item cntCupboardCabinetRedTopLootHelper = registerItem("cntcupboardcabinetredtoploothelper", new Item(new FabricItemSettings()));
    //public static final Item counterHollowCabinetOpen = registerItem("counterhollowcabinetopen", new Item(new FabricItemSettings()));
    //public static final Item counterHollowCabinetBroken = registerItem("counterhollowcabinetbroken", new Item(new FabricItemSettings()));

    // light
    public static final Block ceilingLight02 = registerBlock("ceilinglight02",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON).lightLevel(8)));
    public static final Block lightIndustrialMountedWall = registerBlock("lightindustrialmountedwall",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.TORCH).lightLevel(15).luminance(15)));
    public static final Block lightIndustrialMountedWallRed = registerBlock("lightindustrialmountedwallred",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.REDSTONE_TORCH).luminance(8)));

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

    public static final LadderBlock ladderMetal = registerLadderBlock("laddermetal",
            new MyLadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER).sounds(BlockSoundGroup.METAL)).setSpeed(0.24D));
    public static final LadderBlock ladderSteel = registerLadderBlock("laddersteel",
            new MyLadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER).sounds(BlockSoundGroup.METAL)).setSpeed(0.36D));
    public static final LadderBlock ladderWood = registerLadderBlock("ladderwood",
            new MyLadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)).setSpeed(0.16D));

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

    public static final Block officeDesk = registerBlock("officedesk",
            new BlockX2W(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));

    // doors
    public static final Block doorWhite = registerBlock("doorwhite",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_DOOR).nonOpaque(), BlockSetType.BAMBOO));
    public static final Block workbench = registerBlock("workbench",
            new BlockX2W(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block plantHydroponicAloe = registerBlock("planthydroponicaloe",
            new BlockX2W(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block airConditioner = registerBlock("airconditioner",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block banditPlatform2x2A = registerBlock("banditplatform2x2a",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    //public static final Item banditPlatform2x2A = registerItem("banditplatform2x2a", new Item(new FabricItemSettings()));

    public static final Block airConditionVentFan = registerBlock("airconditionventfan",
            new BlockX1W3(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));

    // stairs
    public static final Block testStairs = registerBlock("teststairs",
            new StairsBlock(Blocks.STONE_STAIRS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.FLOWER_POT).hardness(64f).strength(20f)));
    public static final Block woodStairs = registerBlock("woodstairs",
            new StairsBlock(Blocks.STONE_STAIRS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.FLOWER_POT).hardness(64f).strength(20f)));
    public static final Block woodStairsLeft = registerBlock("woodstairs_left",
            new StairsBlock(Blocks.STONE_STAIRS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.FLOWER_POT).hardness(64f).strength(20f)));
    public static final Block woodStairsRight = registerBlock("woodstairs_right",
            new StairsBlock(Blocks.STONE_STAIRS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.FLOWER_POT).hardness(64f).strength(20f)));
    public static final Block wood16Stairs = registerBlock("wood16_stairs",
            new StairsBlock(Blocks.OAK_STAIRS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block Roof1Stairs = registerBlock("roof1_stairs",
            new StairsBlock(Blocks.OAK_STAIRS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block Roof3Stairs = registerBlock("roof3_stairs",
            new StairsBlock(Blocks.OAK_STAIRS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    // slabs
    public static final Block wood16Slab = registerBlock("wood16_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block Roof1Slab = registerBlock("roof1_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block Roof3Slab = registerBlock("roof3_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));


    public static final Block signTrafficLight = registerBlock("signtrafficlight",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));

    public static final Block restaurantTableEnd = registerBlock("restauranttableend",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block restaurantTableMiddle = registerBlock("restauranttablemiddle",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));


    public static final Block Window = registerBlock("window",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block woodRailing = registerBlock("woodrailing",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block woodFloor01 = registerBlock("woodfloor01",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block woodFloor02 = registerBlock("woodfloor02",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block woodFloor03 = registerBlock("woodfloor03",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block woodFloor04 = registerBlock("woodfloor04",
            new BlockX1(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
    public static final Block woodFloor05 = registerBlock("woodfloor05",
            new BlockX1H3(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Mod_7dtd.MOD_ID, name), block);
    }

    private static LadderBlock registerLadderBlock(String name, LadderBlock block) {
        //Registry.register(Registry.BLOCK, new Identifier("betlad", "iron_ladder"), IRON_LADDER);
        //Registry.register(Registry.ITEM, new Identifier("betlad", "iron_ladder"), new BlockItem(IRON_LADDER, new FabricItemSettings().group(ItemGroup.MISC)));
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
