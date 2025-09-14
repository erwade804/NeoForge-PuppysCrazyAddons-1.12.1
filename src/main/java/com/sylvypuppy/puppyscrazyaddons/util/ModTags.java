package com.sylvypuppy.puppyscrazyaddons.util;

import com.sylvypuppy.puppyscrazyaddons.PuppysCrazyAddOns;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static com.sylvypuppy.puppyscrazyaddons.util.ModTags.Blocks.createTag;

public class ModTags {







    public static class Blocks{
        public static final TagKey<Block> NEEDS_PUPPORE_TOOL = createTag("needs_puppore_tool");
        public static final TagKey<Block> INCORRECT_FOR_PUPPORE_TOOL = createTag("incorrect_for_puppore_tool");

        public static TagKey<Block> createTag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(PuppysCrazyAddOns.MODID, name));
        }
    }
    public static class Items{
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");
        private static TagKey<Item> createTag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(PuppysCrazyAddOns.MODID, name));
        }
    }
}
