package jday.mod_7dtd.client;

import jday.mod_7dtd.sound.ModSounds;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import java.util.Objects;

public class DaysOverlay implements HudRenderCallback {
    private int x_day = 7;
    @Override
    public void onHudRender(DrawContext drawContext, float tickDelta) {

        MinecraftClient client = MinecraftClient.getInstance();
        if (client != null) {
            int width = client.getWindow().getScaledWidth();
            int x = width / 2;

            World world = client.world;
            PlayerEntity p = client.player;

            long ticks = world.getTimeOfDay();
            int worldDays = (int) (ticks / 24000);

            String hours = String.format("%02d", (ticks / 1000 + 6) % 24); // Adding 6 to shift the starting point to sunrise
            String minutes = String.format("%02d", ((ticks % 1000) * 60) / 1000);

            Boolean is_7day = worldDays % x_day == 0;

            String displayDays = String.valueOf(worldDays);

            if (is_7day && worldDays > 0) {
                displayDays = "§c" + String.valueOf(worldDays) + "§f";

                if (Objects.equals(hours, "01") && Objects.equals(minutes, "50")) {
                    // some event where zombies iz crazy
                    // new SAMObject(EntityType.ZOMBIE, EntityType.ZOMBIE_HORSE, null, ConfigHandler.chanceSurfaceZombieHasHorse, false, true, ConfigHandler.onlySpawnZombieHorsesOnSurface);
                   //world.playSound(p, p.getBlockPos(), ModSounds.RED_MOON_START, SoundCategory.BLOCKS, 1f, 1f);
                    p.sendMessage(Text.of("§4Red moon started"), true);
                }

            }

            String day = "DAY: " + displayDays + " TIME: " + hours + ":" + minutes;


            drawContext.drawText(client.textRenderer, day, x - client.textRenderer.getWidth(day) / 2, 18, (255 << 16) + (255 << 8) + 255, false);
        }
    }
}
