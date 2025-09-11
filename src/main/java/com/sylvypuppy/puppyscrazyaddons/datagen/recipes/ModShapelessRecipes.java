package com.sylvypuppy.puppyscrazyaddons.datagen.recipes;

import com.sylvypuppy.puppyscrazyaddons.PuppysCrazyAddOns;
import com.sylvypuppy.puppyscrazyaddons.block.ModBlocks;
import com.sylvypuppy.puppyscrazyaddons.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.concurrent.CompletableFuture;

public class ModShapelessRecipes extends RecipeProvider implements IConditionBuilder {
    public ModShapelessRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    public static void shapelessRecipes(RecipeOutput recipeOutput){
        // craft
        //      output
        //      amount of output
        //      input
        //      recipeOutput

        craft(ModItems.Puppore, 9, ModBlocks.Puppore_Block, recipeOutput);
        craft(ModBlocks.Magic_Block, 1, ModBlocks.Puppore_Brick, recipeOutput);

        // craft
        //      output
        //      amount of output
        //      input
        //      recipeOutput
    }












    public static void craft(DeferredItem<Item> output, int amount, DeferredBlock<Block> input, RecipeOutput recipeOutput){
        String inputName = input.getRegisteredName().substring(PuppysCrazyAddOns.MODID.length()+1);
        String outputName = output.getRegisteredName().substring(PuppysCrazyAddOns.MODID.length()+1);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, output.get(), amount)
                .requires(input)
                .unlockedBy("has_"+input.getRegisteredName(), has(input))
                .save(recipeOutput, PuppysCrazyAddOns.MODID+":"+outputName+"_from_"+inputName);
    }

    public static void craft(DeferredItem<Item> output, int amount, DeferredItem<Item> input, RecipeOutput recipeOutput){
        String inputName = input.getRegisteredName().substring(PuppysCrazyAddOns.MODID.length()+1);
        String outputName = output.getRegisteredName().substring(PuppysCrazyAddOns.MODID.length()+1);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, output.get(), amount)
                .requires(input)
                .unlockedBy("has_"+input.getRegisteredName(), has(input))
                .save(recipeOutput, PuppysCrazyAddOns.MODID+":"+outputName+"_from_"+inputName);
    }

    public static void craft(DeferredBlock<Block> output, int amount, DeferredBlock<Block> input, RecipeOutput recipeOutput){
        String inputName = input.getRegisteredName().substring(PuppysCrazyAddOns.MODID.length()+1);
        String outputName = output.getRegisteredName().substring(PuppysCrazyAddOns.MODID.length()+1);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, output.get(), amount)
                .requires(input)
                .unlockedBy("has_"+input.getRegisteredName(), has(input))
                .save(recipeOutput, PuppysCrazyAddOns.MODID+":"+outputName+"_from_"+inputName);
    }
}
