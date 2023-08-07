package jday.mod_7dtd.client;

import jday.mod_7dtd.Mod_7dtd;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.font.FontStorage;
import net.minecraft.client.font.TextRenderer;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class HudOverlay implements HudRenderCallback {
    private String icons = "";
    private float max_strong = 20;
    private float strong = 20;
    private static final Identifier BLUE_UI = new Identifier(Mod_7dtd.MOD_ID,
            "textures/ui/blue_hud.png");
    private static final Identifier RED_UI = new Identifier(Mod_7dtd.MOD_ID,
            "textures/ui/red_hud.png");
    private static final Identifier EMPTY_UI = new Identifier(Mod_7dtd.MOD_ID,
            "textures/ui/empty_hud.png");
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
        int hp = (80 * (int) p.getHealth()) / (int) p.getMaxHealth();
        int fl = Integer.parseInt(String.valueOf(p.getHungerManager().getFoodLevel()));
        String is_rain = client.world.isRaining() ? " r" : "";
        String is_thunder = client.world.isThundering() ? " t" : "";
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
