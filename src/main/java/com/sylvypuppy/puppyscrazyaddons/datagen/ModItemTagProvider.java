package com.sylvypuppy.puppyscrazyaddons.datagen;

import com.sylvypuppy.puppyscrazyaddons.PuppysCrazyAddOns;
import com.sylvypuppy.puppyscrazyaddons.item.ModItems;
import com.sylvypuppy.puppyscrazyaddons.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, PuppysCrazyAddOns.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.Puppore.get());
        tag(ItemTags.SWORDS)
                .add(ModItems.Puppore_Sword.get());
        tag(ItemTags.AXES)
                .add(ModItems.Puppore_Axe.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.Puppore_Pickaxe.get());
        tag(ItemTags.HOES)
                .add(ModItems.Puppore_Hoe.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.Puppore_Shovel.get());
    }
}
