package com.sylvypuppy.puppyscrazyaddons.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;

public class ModFoodProperties {
    public static final FoodProperties PUPPORE_APPLE =
            new FoodProperties.Builder()
                    .nutrition(8)
                    .saturationModifier(4f)
                    .effect(()-> new MobEffectInstance(MobEffects.GLOWING, 900, 2), 1f)
                    .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 900, 2), 0.67f)
                    .effect(()-> new MobEffectInstance(MobEffects.REGENERATION, 600, 5), 0.67f)
                    .build();

    public static final FoodProperties RAW_PUPPORE =
            new FoodProperties.Builder()
                    .nutrition(1)
                    .saturationModifier(.2f)
                    .effect(()-> new MobEffectInstance(MobEffects.GLOWING, 100, 2), 1f)
                    .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 300, 2), 0.1f)
                    .build();
}
