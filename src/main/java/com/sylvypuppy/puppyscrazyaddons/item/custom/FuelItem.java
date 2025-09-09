package com.sylvypuppy.puppyscrazyaddons.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

import javax.annotation.Nullable;

public class FuelItem extends Item {
    private int burnItems = 0;
    public FuelItem(Properties properties, int burnItems) {
        super(properties);
        this.burnItems = burnItems;
        // 200 burn time = 1 item
    }

    public int getBurnTime(ItemStack itemstack, @Nullable RecipeType<?> recipeType) {
        return this.burnItems * 200;
    }
}
