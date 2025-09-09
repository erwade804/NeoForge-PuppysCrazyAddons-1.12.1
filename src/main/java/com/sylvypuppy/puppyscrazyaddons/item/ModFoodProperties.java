package com.sylvypuppy.puppyscrazyaddons.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties PUPPORE_APPLE =
            new FoodProperties.Builder().nutrition(3).saturationModifier(.25f).effect(()-> new MobEffectInstance(MobEffects.REGENERATION, 600, 2), 0.67f).build();
}
