package com.sylvypuppy.puppyscrazyaddons.item;

import com.sylvypuppy.puppyscrazyaddons.PuppysCrazyAddOns;
import com.sylvypuppy.puppyscrazyaddons.item.custom.ChiselItem;
import com.sylvypuppy.puppyscrazyaddons.item.custom.FuelItem;
import com.sylvypuppy.puppyscrazyaddons.item.custom.HammerItem;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PuppysCrazyAddOns.MODID);


    /*
        Puppore Tools
    */
    public static final DeferredItem<SwordItem> Puppore_Sword = ITEMS.register("puppore_sword",
            () -> new SwordItem(ModToolTiers.PUPPORE,
                    new Item.Properties()
                            .attributes(
                                    SwordItem.createAttributes(
                                        ModToolTiers.PUPPORE, 5, -2.4f))));
    public static final DeferredItem<PickaxeItem> Puppore_Pickaxe = ITEMS.register("puppore_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PUPPORE,
                    new Item.Properties()
                            .attributes(
                                    PickaxeItem.createAttributes(
                                            ModToolTiers.PUPPORE, 2, -2.4f))));
    public static final DeferredItem<HoeItem> Puppore_Hoe = ITEMS.register("puppore_hoe",
            () -> new HoeItem(ModToolTiers.PUPPORE,
                    new Item.Properties()
                            .attributes(
                                    HoeItem.createAttributes(
                                            ModToolTiers.PUPPORE, 1, -2.4f))));
    public static final DeferredItem<AxeItem> Puppore_Axe = ITEMS.register("puppore_axe",
            () -> new AxeItem(ModToolTiers.PUPPORE,
                    new Item.Properties()
                            .attributes(
                                    AxeItem.createAttributes(
                                            ModToolTiers.PUPPORE, 7, -2.4f))));
    public static final DeferredItem<ShovelItem> Puppore_Shovel = ITEMS.register("puppore_shovel",
            () -> new ShovelItem(ModToolTiers.PUPPORE,
                    new Item.Properties()
                            .attributes(
                                    ShovelItem.createAttributes(
                                            ModToolTiers.PUPPORE, 2, -2.4f))));
    public static final DeferredItem<HammerItem> Puppore_Hammer = ITEMS.register("puppore_hammer",
            () -> new HammerItem(ModToolTiers.PUPPORE,
                    new Item.Properties()
                            .attributes(
                                    PickaxeItem.createAttributes(
                                            ModToolTiers.PUPPORE, 7f, -3.2f))));

    /*
        All other items
     */

    public static final DeferredItem<Item> Puppore = ITEMS.register("puppore",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Puppore_Plate = ITEMS.register("puppore_plate",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Raw_Puppore = ITEMS.register("raw_puppore",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Puppore_Apple = ITEMS.register("puppore_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PUPPORE_APPLE)));
    public static final DeferredItem<Item> Chisel = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().durability(64)));
    public static final DeferredItem<Item> Unrefined_Chisel = ITEMS.register("unrefined_chisel",
            () -> new ChiselItem(new Item.Properties().durability(16)));

    public static final DeferredItem<Item> Puppore_Coal = ITEMS.register("puppore_coal",
            () -> new FuelItem(new Item.Properties(), 17));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
