package com.sylvypuppy.puppyscrazyaddons.item;

import com.sylvypuppy.puppyscrazyaddons.PuppysCrazyAddOns;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PuppysCrazyAddOns.MODID);

    public static final DeferredItem<Item> Puppore = ITEMS.register("puppore",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Raw_Puppore = ITEMS.register("raw_puppore",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
