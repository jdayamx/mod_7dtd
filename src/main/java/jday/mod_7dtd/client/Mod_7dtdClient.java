package jday.mod_7dtd.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
public class Mod_7dtdClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // some code for client
        HudRenderCallback.EVENT.register(new HudOverlay());
    }
}
