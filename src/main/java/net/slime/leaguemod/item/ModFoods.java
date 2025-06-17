package net.slime.leaguemod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties CERVEJA = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200, 1), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200),1)
            .effect(() -> new  MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,200),1).build();

    public static final FoodProperties BALDEDIAMANTE = new FoodProperties.Builder().nutrition(8).saturationMod(1.2f).build();

}
