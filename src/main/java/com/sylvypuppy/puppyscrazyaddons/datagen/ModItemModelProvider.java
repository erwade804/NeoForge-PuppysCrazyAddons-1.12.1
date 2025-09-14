package com.sylvypuppy.puppyscrazyaddons.datagen;

import com.sylvypuppy.puppyscrazyaddons.PuppysCrazyAddOns;
import com.sylvypuppy.puppyscrazyaddons.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PuppysCrazyAddOns.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        handheldItems(ModItems.Puppore_Axe);
        handheldItems(ModItems.Puppore_Pickaxe);
        handheldItems(ModItems.Puppore_Hoe);
        handheldItems(ModItems.Puppore_Shovel);
        handheldItems(ModItems.Puppore_Sword);
        handheldItems(ModItems.Puppore_Hammer);

        basicItem(ModItems.Puppore_Plate.get());
        basicItem(ModItems.Raw_Puppore.get());
        basicItem(ModItems.Chisel.get());
        basicItem(ModItems.Puppore.get());
        basicItem(ModItems.Puppore_Apple.get());
        basicItem(ModItems.Puppore_Coal.get());
        basicItem(ModItems.Unrefined_Chisel.get());
    }

    private ItemModelBuilder handheldItems(DeferredItem<?> item){
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(PuppysCrazyAddOns.MODID, "item/" + item.getId().getPath()));
    }

}
