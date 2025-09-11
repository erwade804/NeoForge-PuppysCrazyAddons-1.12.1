package com.sylvypuppy.puppyscrazyaddons.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;

public class ModFoodProperties {
    public static final FoodProperties PUPPORE_APPLE =
            new FoodProperties.Builder()
                    .nutrition(6)
                    .saturationModifier(4f)
                    .effect(()-> new MobEffectInstance(MobEffects.REGENERATION, 600, 2), 0.67f)
                    .build();
}
