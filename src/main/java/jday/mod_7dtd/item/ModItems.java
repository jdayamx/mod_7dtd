package jday.mod_7dtd.item;

import jday.mod_7dtd.Mod_7dtd;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class m7dtdItems {
    public static final Item M7DTD = registerItem("m7dtd",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Mod_7dtd.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(m7dtdItemGroup.M7DTD, M7DTD);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerItems() {
        Mod_7dtd.LOGGER.info("Registering Mod Items for " + Mod_7dtd.MOD_ID);

        addItemsToItemGroup();
    }
}
