package com.sylvypuppy.puppyscrazyaddons.datagen;

import com.sylvypuppy.puppyscrazyaddons.PuppysCrazyAddOns;
import com.sylvypuppy.puppyscrazyaddons.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PuppysCrazyAddOns.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.Raw_Puppore.get());
        basicItem(ModItems.Chisel.get());
        basicItem(ModItems.Puppore.get());
        basicItem(ModItems.Puppore_Apple.get());
        basicItem(ModItems.Puppore_Coal.get());
        basicItem(ModItems.Unrefined_Chisel.get());
    }
}
