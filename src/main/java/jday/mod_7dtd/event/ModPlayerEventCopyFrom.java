package jday.mod_7dtd.event;

import jday.mod_7dtd.util.IEntityDataSaver;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.minecraft.server.network.ServerPlayerEntity;
public class ModPlayerEventCopyFrom implements ServerPlayerEvents.CopyFrom {
    @Override
    public void copyFromPlayer(ServerPlayerEntity oldPlayer, ServerPlayerEntity newPlayer, boolean alive) {
        IEntityDataSaver original = ((IEntityDataSaver) oldPlayer);
        IEntityDataSaver player = ((IEntityDataSaver) newPlayer);

        player.getPersistentData().putIntArray("homepos", original.getPersistentData().getIntArray("homepos"));
        // this is for books read
        // 0 - book armored up
        // 1 - book art of mining lucky strike
        // 2 - book auto weapons damage
        // 3 - book barbrawling 1 basic moves
        // 4 - book batter up big hits
        // 5 - book big hitters
        // 6 - book bow hunters
        // 7 - book electrical traps
        // 8 - book enforcer damage
        // 9 - book explosive magazine
        // 10 - book fire man sal mana cheat
        // 11 - book for gea head
        // 12 - book furious fists
        // 13 - book get hammered
        // 14 - book hand gun magazine
        // 15 - book handy land
        // 16 - book home cooking weekly
        // 17 - book hunting journal bears
        // 18 - book knife guy
        // 19 - book lucky looter dukes
        // 20 - book medical journal
        // 21 - book need leandthreadwinterwear
        // 22 - book night stalker stealth damage
        // 23 - book pistol pete take aim
        // 24 - book ranger sar row recovery
        // 25 - book rifle world
        // 26 - book scrapping 4 fun
        // 27 - book sharps ticks
        // 28 - book shotgun messiah damage
        // 29 - book shotgun weekly
        // 30 - book sniper damage
        // 31 - book southern farming
        // 32 - book spear hunter 1 damage
        // 33 - book tactical warfare
        // 34 - book tech junkie 1 damage
        // 35 - book tech planet
        // 36 - book the great heist safes
        // 37 - book tools digest
        // 36 - book urban combat landing
        // 37 - book vehicle adventures
        // 38 - book waste treasures honey
        // 39 - book wiring 101
        player.getPersistentData().putIntArray("books", original.getPersistentData().getIntArray("books"));
        // additional params of player
        // 0 - Perception
        // 1 - Force
        // 2 - Fortitude
        // 3 - Agility
        // 4 - Intelligence
        player.getPersistentData().putIntArray("params", original.getPersistentData().getIntArray("params"));
    }
}
