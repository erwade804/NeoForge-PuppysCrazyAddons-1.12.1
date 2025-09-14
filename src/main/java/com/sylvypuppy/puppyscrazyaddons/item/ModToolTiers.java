package com.sylvypuppy.puppyscrazyaddons.item;

import com.sylvypuppy.puppyscrazyaddons.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
public static final Tier PUPPORE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_PUPPORE_TOOL,
        1400, 4f, 3f, 15, () -> Ingredient.of(ModItems.Puppore));
}
