package jday.mod_7dtd.client;

import jday.mod_7dtd.block.ModBlocks;
import jday.mod_7dtd.event.KeyInputHandler;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.render.RenderLayer;

public class Mod_7dtdClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.controlPanelTop07, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TEST7DTD, RenderLayer.getCutout());

        //BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.testStairs, RenderLayer.getCutout());
        //BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.testStairs, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.testStairs, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.jailBarsWhite, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.glass1, RenderLayer.getTranslucent());


        // some code for client
        HudRenderCallback.EVENT.register(new HudOverlay());
        HudRenderCallback.EVENT.register(new IconsOverlay());
        HudRenderCallback.EVENT.register(new DaysOverlay());
        KeyInputHandler.register();
    }
}
