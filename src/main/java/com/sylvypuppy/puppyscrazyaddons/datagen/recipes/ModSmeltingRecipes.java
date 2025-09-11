package com.sylvypuppy.puppyscrazyaddons.datagen.recipes;

import com.sylvypuppy.puppyscrazyaddons.block.ModBlocks;
import com.sylvypuppy.puppyscrazyaddons.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModSmeltingRecipes extends RecipeProvider implements IConditionBuilder {
    public ModSmeltingRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    public static void smeltItems(RecipeOutput recipeOutput){
        // smelt
        //      input
        //      output
        //      xp
        //      ticks to cook (200 is standard)
        //      group
        //      recipeOutput


        smelt(ModItems.Raw_Puppore, ModItems.Puppore, 0.25f, 200, "puppore", recipeOutput);
        smelt(ModBlocks.Puppore_Stone_Ore, ModItems.Puppore, 0.25f, 200, "puppore", recipeOutput);
        smelt(ModBlocks.Puppore_Brick, ModBlocks.Magic_Block, 0.25f, 200, "puppore", recipeOutput);
        smelt(ModItems.Unrefined_Chisel, ModItems.Chisel, 0.25f, 200, "chisel", recipeOutput);
        smelt(ModBlocks.Puppore_Brick, ModBlocks.Puppore_Block, 0.25f, 200, "chisel", recipeOutput);


        // smelt
        //      input
        //      output
        //      xp
        //      ticks to cook (200 is standard)
        //      group
        //      recipeOutput
    }










    private static void smelt(Item input, DeferredItem<Item> output, float xp, int ticks, String name, RecipeOutput recipeOutput){
        List<ItemLike> SMELTABLES = List.of(input);
        oreSmelting(recipeOutput, SMELTABLES, RecipeCategory.MISC, output.get(), xp, ticks,  name);
    }
    private static void smelt(DeferredItem<Item> input, DeferredItem<Item> output, float xp, int ticks, String name, RecipeOutput recipeOutput) {
        List<ItemLike> SMELTABLES = List.of(input);
        oreSmelting(recipeOutput, SMELTABLES, RecipeCategory.MISC, output.get(), xp, ticks, name);

    }
    private static void smelt(DeferredItem<Item> input, DeferredBlock<Block> output, float xp, int ticks, String name, RecipeOutput recipeOutput) {
        List<ItemLike> SMELTABLES = List.of(input);
        oreSmelting(recipeOutput, SMELTABLES, RecipeCategory.MISC, output.get(), xp, ticks, name);
    }
    private static void smelt(DeferredBlock<Block> input, DeferredBlock<Block> output, float xp, int ticks, String name, RecipeOutput recipeOutput) {
        List<ItemLike> SMELTABLES = List.of(input);
        oreSmelting(recipeOutput, SMELTABLES, RecipeCategory.MISC, output.get(), xp, ticks, name);
    }
    private static void smelt(DeferredBlock<Block> input, DeferredItem<Item> output, float xp, int ticks, String name, RecipeOutput recipeOutput) {
        List<ItemLike> SMELTABLES = List.of(input);
        oreSmelting(recipeOutput, SMELTABLES, RecipeCategory.MISC, output.get(), xp, ticks, name);
    }




}
