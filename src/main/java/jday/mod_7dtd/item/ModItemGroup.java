package jday.mod_7dtd.item;

import jday.mod_7dtd.Mod_7dtd;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class m7dtdItemGroup {
    public static ItemGroup M7DTD;

    public static void registerItemGroups() {
        M7DTD = FabricItemGroup.builder()
                .displayName(Text.translatable("itemgroup.m7dtd"))
                .icon(() -> new ItemStack(m7dtdItems.M7DTD)).build();
    }
}
