package com.sylvypuppy.puppyscrazyaddons.datagen;

import com.sylvypuppy.puppyscrazyaddons.block.ModBlocks;
import com.sylvypuppy.puppyscrazyaddons.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static com.sylvypuppy.puppyscrazyaddons.datagen.recipes.ModShapedRecipes.shapedRecipes;
import static com.sylvypuppy.puppyscrazyaddons.datagen.recipes.ModShapelessRecipes.shapelessRecipes;
import static com.sylvypuppy.puppyscrazyaddons.datagen.recipes.ModSmeltingRecipes.smeltItems;

public class ModRecipeProvider extends RecipeProvider  implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        shapedRecipes(recipeOutput);
        shapelessRecipes(recipeOutput);
        smeltItems(recipeOutput);
    }
}
