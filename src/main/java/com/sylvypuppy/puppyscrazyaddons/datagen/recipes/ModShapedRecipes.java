package com.sylvypuppy.puppyscrazyaddons.datagen.recipes;

import com.sylvypuppy.puppyscrazyaddons.block.ModBlocks;
import com.sylvypuppy.puppyscrazyaddons.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;


public class ModShapedRecipes extends RecipeProvider implements IConditionBuilder {
    public ModShapedRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    public static void shapedRecipes(RecipeOutput recipeOutput){

        /*

            BLOCKS

         */

        // Puppore Block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Puppore_Block.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.Puppore.get())
                .unlockedBy("has_puppore", has(ModItems.Puppore))
                .save(recipeOutput, "puppyscrazyaddons:puppore_block_from_puppore");



        /*

            EDIBLES

         */

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.Puppore_Apple.get())
                .pattern("BBB")
                .pattern("BCB")
                .pattern("BBB")
                .define('B', ModItems.Raw_Puppore)
                .define('C', Items.APPLE)
                .unlockedBy("has_raw_puppore", has(ModItems.Raw_Puppore))
                .save(recipeOutput, "puppyscrazyaddons:puppore_apple_from_raw_puppore");



        /*

            SMELTABLES

         */

        // Puppore Coal pt 1
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Puppore_Coal.get())
                .pattern("BBB")
                .pattern("BCB")
                .pattern("BBB")
                .define('B', ModItems.Puppore.get())
                .define('C', Items.COAL)
                .unlockedBy("has_puppore", has(ModItems.Puppore))
                .save(recipeOutput, "puppyscrazyaddons:puppore_coal_from_coal");

        // Puppore Coal pt 2
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Puppore_Coal.get())
                .pattern("BBB")
                .pattern("BCB")
                .pattern("BBB")
                .define('B', ModItems.Puppore.get())
                .define('C', Items.CHARCOAL)
                .unlockedBy("has_puppore", has(ModItems.Puppore))
                .save(recipeOutput, "puppyscrazyaddons:puppore_coal_from_charcoal");


        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.Unrefined_Chisel.get())
                .pattern(" BB")
                .pattern(" C ")
                .pattern("C  ")
                .define('B', ModItems.Puppore.get())
                .define('C', Items.STICK)
                .unlockedBy("has_puppore", has(ModItems.Puppore))
                .save(recipeOutput, "puppyscrazyaddons:unrefined_chisel_from_crafting");
    }
}
