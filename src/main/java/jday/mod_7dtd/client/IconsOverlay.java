package jday.mod_7dtd.client;

import jday.mod_7dtd.Mod_7dtd;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class IconsOverlay implements HudRenderCallback {
    private String icons = "";
    private static final Identifier ICON_RAIN = new Identifier(Mod_7dtd.MOD_ID, "textures/ui/icons/icon_rain.png");
    private static final Identifier ICON_THUNDER = new Identifier(Mod_7dtd.MOD_ID, "textures/ui/icons/icon_thunder.png");
    private static final Identifier ICON_HANG1 = new Identifier(Mod_7dtd.MOD_ID, "textures/ui/icons/icon_hang1.png");
    private static final Identifier ICON_HANG2 = new Identifier(Mod_7dtd.MOD_ID, "textures/ui/icons/icon_hang2.png");


    @Override
    public void onHudRender(DrawContext drawContext, float tickDelta) {
        int y = 0;
        int i = 0;
        int iconSize = 16;
        int stepSize = iconSize + 5;
        this.icons = "";
        MinecraftClient client = MinecraftClient.getInstance();

        if (client != null) {
            PlayerEntity p = client.player;
            World world = client.world;
            int width = client.getWindow().getScaledWidth();
            int height = client.getWindow().getScaledHeight();
            y = height;

            int fl = Integer.parseInt(String.valueOf(p.getHungerManager().getFoodLevel()));
            String is_rain = world.isRaining() ? " r" : "";
            String is_thunder = world.isThundering() ? " t" : "";
            this.icons = is_rain + is_thunder + (fl < 10 ? " f" : "");

            if (this.icons.length() > 0) {
                //drawContext.drawText(client.textRenderer, String.valueOf(p.getHungerManager().getFoodLevel()), 11, 11, (255 << 16) + (255 << 8) + 100, false);

                // 🍽
                // 🍺
                // 🌨
                // ☕
                // ❄
                if (this.icons.indexOf("r") > 0) {
                    i++;
                    drawContext.drawTexture(ICON_RAIN, 10,y - (45 + (i * stepSize)),0,0,iconSize, iconSize, iconSize, iconSize);
                    //drawContext.drawText(client.textRenderer, "☂", 10, y - (45 + (i * 16)), (255 << 16) + (255 << 8) + 255, false);
                }
                if (this.icons.indexOf("t") > 0) {
                    i++;
                    drawContext.drawTexture(ICON_THUNDER, 10,y - (45 + (i * stepSize)),0,0,iconSize, iconSize, iconSize, iconSize);
                    //drawContext.drawText(client.textRenderer, "⚡", 10, y - (45 + (i * 16)), (255 << 16) + (255 << 8) + 255, false);
                }

                if (this.icons.indexOf("f") > 0) {
                    i++;

                    if (fl < 5) {
                        drawContext.drawTexture(ICON_HANG2, 10,y - (45 + (i * stepSize)),0,0,iconSize, iconSize, iconSize, iconSize);
                    } else {
                        drawContext.drawTexture(ICON_HANG1, 10,y - (45 + (i * stepSize)),0,0,iconSize, iconSize, iconSize, iconSize);
                    }

                }
            }
        }
    }
}
