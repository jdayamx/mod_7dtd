package jday.mod_7dtd.datagen;

import jday.mod_7dtd.block.ModBlocks;
import jday.mod_7dtd.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.SAND, 1)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModItems.resourceCrushedSand)
                .criterion(hasItem(ModItems.resourceCrushedSand), conditionsFromItem(ModItems.resourceCrushedSand))
                .offerTo(exporter, new Identifier(getRecipeName(Blocks.SAND)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.DIRT, 1)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModItems.resourceClayLump)
                .criterion(hasItem(ModItems.resourceClayLump), conditionsFromItem(ModItems.resourceClayLump))
                .offerTo(exporter, new Identifier(getRecipeName(Blocks.DIRT)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.COBBLESTONE, 1)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModItems.resourceRockSmall)
                .criterion(hasItem(ModItems.resourceRockSmall), conditionsFromItem(ModItems.resourceRockSmall))
                .offerTo(exporter, new Identifier(getRecipeName(Blocks.COBBLESTONE)));

        /*ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.resourceCrushedSand, 4)
                .pattern("S")
                .input('S', Blocks.SAND)
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.resourceCrushedSand)));*/

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.baseWoodBlock, 1)
                .pattern("SS")
                .input('S', ModItems.resourceWood)
                .criterion(hasItem(ModItems.resourceWood), conditionsFromItem(ModItems.resourceWood))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.baseWoodBlock)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.controlPanelBase08, 1)
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .input('S', ModItems.resourceScrapIron)
                .input('W', Items.WHITE_DYE)
                .criterion(hasItem(ModItems.resourceScrapIron), conditionsFromItem(ModItems.resourceScrapIron))
                .criterion(hasItem(Items.WHITE_DYE), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.controlPanelBase08)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.bridgeWoodBlock, 1)
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .input('S', ModItems.resourceWood)
                .input('W', ModBlocks.baseWoodBlock)
                .criterion(hasItem(ModItems.resourceWood), conditionsFromItem(ModItems.resourceWood))
                .criterion(hasItem(ModBlocks.baseWoodBlock), conditionsFromItem(ModBlocks.baseWoodBlock))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.bridgeWoodBlock)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.resourceCobblestones, 1)
                .pattern("SR")
                .input('S', ModItems.resourceClayLump)
                .input('R', ModItems.resourceRockSmall)
                .criterion(hasItem(ModItems.resourceWood), conditionsFromItem(ModItems.resourceWood))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.resourceCobblestones)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.cobblestoneMaster, 1)
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .input('S', ModItems.resourceCobblestones)
                .input('W', ModBlocks.bridgeWoodBlock)
                .criterion(hasItem(ModItems.resourceCobblestones), conditionsFromItem(ModItems.resourceCobblestones))
                .criterion(hasItem(ModBlocks.bridgeWoodBlock), conditionsFromItem(ModBlocks.bridgeWoodBlock))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.cobblestoneMaster)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.concreteMaster, 1)
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .input('S', ModItems.resourceConcreteMix)
                .input('W', ModBlocks.cobblestoneMaster)
                .criterion(hasItem(ModItems.resourceCobblestones), conditionsFromItem(ModItems.resourceCobblestones))
                .criterion(hasItem(ModBlocks.bridgeWoodBlock), conditionsFromItem(ModBlocks.bridgeWoodBlock))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.concreteMaster)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.steelMaster, 1)
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .input('S', ModItems.resourceForgedSteel)
                .input('W', ModBlocks.concreteMaster)
                .criterion(hasItem(ModItems.resourceForgedSteel), conditionsFromItem(ModItems.resourceForgedSteel))
                .criterion(hasItem(ModBlocks.concreteMaster), conditionsFromItem(ModBlocks.concreteMaster))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.steelMaster)));

    }
}
