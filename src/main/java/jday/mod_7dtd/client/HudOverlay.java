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
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Arrays;
import java.util.List;

import static net.minecraft.util.math.MathHelper.wrapDegrees;

public class HudOverlay implements HudRenderCallback {
    private float max_strong = 20;
    private float strong = 20;

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

    @Override
    public void onHudRender(DrawContext drawContext, float tickDelta) {
        int x = 0;
        int y = 0;

        MinecraftClient client = MinecraftClient.getInstance();
        if (client != null) {
            int width = client.getWindow().getScaledWidth();
            int height = client.getWindow().getScaledHeight();

            x = width / 2;
            y = height;
        }
        PlayerEntity p = client.player;

        float degrees = wrapDegrees(p.getRotationClient().y);

        if (degrees < 0) {
            degrees += 360;
        }

        int hp = (80 * (int) p.getHealth()) / (int) p.getMaxHealth();
        drawContext.drawTexture(LINE_COMPASS, x - 50,5,degrees - 50,0,100, 7, 360, 7);

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


        if (strong < 5) {
            //p.speed = 0.001f;
            //p.updateVelocity(0.01f, new Vec3d(1, 1, 0));
            p.setMovementSpeed(0.01f);
        }

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
    }
}
