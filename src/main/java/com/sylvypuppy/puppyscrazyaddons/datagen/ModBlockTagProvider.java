package com.sylvypuppy.puppyscrazyaddons.datagen;

import com.sylvypuppy.puppyscrazyaddons.PuppysCrazyAddOns;
import com.sylvypuppy.puppyscrazyaddons.block.ModBlocks;
import com.sylvypuppy.puppyscrazyaddons.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, PuppysCrazyAddOns.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.Magic_Block.get())
                .add(ModBlocks.Puppore_Block.get())
                .add(ModBlocks.Puppore_Brick.get())
                .add(ModBlocks.Puppore_Stone_Ore.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.Puppore_Stone_Ore.get())
                .add(ModBlocks.Magic_Block.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.Puppore_Block.get())
                .add(ModBlocks.Puppore_Brick.get());

        tag(ModTags.Blocks.NEEDS_PUPPORE_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_PUPPORE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.Blocks.NEEDS_PUPPORE_TOOL);
    }
}
