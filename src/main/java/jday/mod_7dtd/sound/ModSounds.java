package jday.mod_7dtd.sound;

import jday.mod_7dtd.Mod_7dtd;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static SoundEvent RED_MOON_START = registerSoundEvent("red_moon_start");
    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Mod_7dtd.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
}
