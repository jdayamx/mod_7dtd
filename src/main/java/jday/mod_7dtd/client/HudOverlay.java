package jday.mod_7dtd.client;

import jday.mod_7dtd.Mod_7dtd;
import jday.mod_7dtd.item.ModItems;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.font.FontStorage;
import net.minecraft.client.font.TextRenderer;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.server.MinecraftServer;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import java.util.Arrays;
import java.util.List;

import static net.minecraft.util.math.MathHelper.wrapDegrees;

public class HudOverlay implements HudRenderCallback {
    private String icons = "";
    private float max_strong = 20;
    private float strong = 20;
    private int x_day = 7;

    //private static final List<String> direction = Arrays.asList("s", "sw", "w", "nw", "n", "ne", "e", "se", "s");
    private static final Identifier BLUE_UI = new Identifier(Mod_7dtd.MOD_ID,
            "textures/ui/blue_hud.png");
    private static final Identifier RED_UI = new Identifier(Mod_7dtd.MOD_ID,
            "textures/ui/red_hud.png");
    private static final Identifier EMPTY_UI = new Identifier(Mod_7dtd.MOD_ID,
            "textures/ui/empty_hud.png");
    // needs texture 360px x 7px
    private static final Identifier LINE_COMPASS = new Identifier(Mod_7dtd.MOD_ID,
            "textures/ui/line_compass.png");

    private static final Identifier ICON_TEXTURE = new Identifier(Mod_7dtd.MOD_ID, "textures/ui/test.png");

    @Override
    public void onHudRender(DrawContext drawContext, float tickDelta) {
        int x = 0;
        int y = 0;
        this.icons = "";
        int i = 0;

        MinecraftClient client = MinecraftClient.getInstance();
        if (client != null) {
            int width = client.getWindow().getScaledWidth();
            int height = client.getWindow().getScaledHeight();

            x = width / 2;
            y = height;
        }
        PlayerEntity p = client.player;
        World world = client.world;

        float degrees = wrapDegrees(p.getRotationClient().y);

        if (degrees < 0) {
            degrees += 360;
        }

        //int facing = Math.round(degrees/45);

        int hp = (80 * (int) p.getHealth()) / (int) p.getMaxHealth();
        int fl = Integer.parseInt(String.valueOf(p.getHungerManager().getFoodLevel()));
        String is_rain = world.isRaining() ? " r" : "";
        String is_thunder = world.isThundering() ? " t" : "";
        this.icons = is_rain + is_thunder + (fl < 10 ? " f" : "");

        long ticks = world.getTimeOfDay();
        int worldDays = (int) (ticks / 24000);

        String hours = String.format("%02d", (ticks / 1000 + 6) % 24); // Adding 6 to shift the starting point to sunrise
        String minutes = String.format("%02d",((ticks % 1000) * 60) / 1000);

        Boolean is_7day = worldDays % x_day == 0;

        String displayDays = String.valueOf(worldDays);

        if (is_7day) {
            displayDays = "§4" + String.valueOf(worldDays);
        }

        String day = "DAY: " + displayDays + " TIME: " + hours + ":" + minutes;
        //String toShow = direction.get(facing);

        //drawContext.drawText(client.textRenderer, toShow, x - client.textRenderer.getWidth(toShow) / 2, 10, (255 << 16) + (255 << 8) + 255, false);

        drawContext.drawText(client.textRenderer, day, x - client.textRenderer.getWidth(day) / 2, 20, (255 << 16) + (255 << 8) + 255, false);

        // -------- debug slot ---------
        drawContext.drawTexture(LINE_COMPASS, x - 50,5,degrees - 50,0,100, 7, 360, 7);
        // -----------------------------

        //int iconSize = 16;
        //client.getTextureManager().bindTexture(ICON_TEXTURE);
        //drawContext.drawItem(ModItems.chimneyBlackPOI.getDefaultStack(), 10, 60);
        //drawContext.drawTexture(ICON_TEXTURE, 10,10,0,0,iconSize, iconSize, iconSize, iconSize);
        //drawContext.drawTexture(EMPTY_UI, 10,30,0,0,80, 20, 80, 20);


        if (this.icons.length() > 0) {
            //drawContext.drawText(client.textRenderer, String.valueOf(p.getHungerManager().getFoodLevel()), 11, 11, (255 << 16) + (255 << 8) + 100, false);

            // 🍽
            // 🍺
            // 🌨
            // ☕
            // ❄
            if (this.icons.indexOf("r") > 0) {
                i++;
                drawContext.drawText(client.textRenderer, "☂", 10, y - (45 + (i * 16)), (255 << 16) + (255 << 8) + 255, false);
            }
            if (this.icons.indexOf("t") > 0) {
                i++;
                drawContext.drawText(client.textRenderer, "⚡", 10, y - (45 + (i * 16)), (255 << 16) + (255 << 8) + 255, false);
            }

            if (this.icons.indexOf("f") > 0) {
                i++;
                int fc = (255 << 16) + (255 << 8) + 100;
                if (fl < 5) {
                    fc = (255 << 16) + (100 << 8) + 100;
                }
                drawContext.drawText(client.textRenderer, "\uD83C\uDF7D", 10, y - (45 + (i * 16)), fc, false);
            }
        }

        if (p.isSwimming() || p.isSprinting()) {
            strong -= 0.01;
        } else {
            strong += 0.001;
        }
        if (strong <= 0) {
            strong = 0;
        }

        if (strong >= max_strong) {
            strong = max_strong;
        }
        int sp = (80 * (int) strong) / (int) max_strong;


        //if (p.isUsingRiptide())

        if (strong < 5) {
         //   p.setSprinting(false);
         //   p.setMovementSpeed(1f);
            //p.
            p.speed = 0.001f;
        }

        //RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        //RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
       // RenderSystem.setShaderTexture(0, HP_ICON);
        //drawTexture(matrices, x, y, 0, 0, backgroundWidth, backgroundHeight);
        //for(int i = 0; i < 10; i++)

        String spt = (int) strong + "/" + (int) max_strong;
        int sspt = client.textRenderer.getWidth(spt);

        drawContext.drawTexture(EMPTY_UI, 5,y - 40 ,100,100,80,16);
        drawContext.drawTexture(BLUE_UI, 5,y - 40 ,100,100,sp,16);
        drawContext.drawText(client.textRenderer, "\uD83D\uDC63", 10, y - 36, (255 << 16) + (255 << 8) + 255, false);
        drawContext.drawText(client.textRenderer, spt, 45 - sspt / 2, y - 36, (255 << 16) + (255 << 8) + 255, false);


        drawContext.drawTexture(EMPTY_UI, 5,y - 21,100,100,80,16);
        drawContext.drawTexture(RED_UI, 5,y - 21,100,100, hp,16);
        //drawContext.drawTexture(HP_ICON, 5,y - 21,16,16, 20,16);
        String hpt = (int) p.getHealth() + "/" + (int) p.getMaxHealth();
        int shpt = client.textRenderer.getWidth(hpt);
        drawContext.drawText(client.textRenderer, "✚", 10, y - 17, (255 << 16) + (255 << 8) + 255, false);
        drawContext.drawText(client.textRenderer, hpt, 45 - shpt / 2, y - 17, (255 << 16) + (255 << 8) + 255, false);

        //DrawContext.drawTexture(EMPTY_UI, 1,1,100,100,100,32);
            /*Drawable.drawTexture(matrixStack,x - 94 + (i * 9),y - 54,0,0,12,12,
                    12,12);*/
        //}

    }
}
