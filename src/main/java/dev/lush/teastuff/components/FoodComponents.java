package dev.lush.teastuff.components;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class FoodComponents {
    public static final FoodComponent CHOCOLATE = (new FoodComponent.Builder()).hunger(2).saturationModifier(.3F).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 100, 0), 0.2F).snack().build();
    
}
