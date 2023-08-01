package dev.lush.teastuff.components;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class FoodComponents {
    public static final FoodComponent CHOCOLATE = (new FoodComponent.Builder()).hunger(2).saturationModifier(.3F).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 100, 0), 0.2F).snack().build();
    public static final FoodComponent BREAD_SLICE = (new FoodComponent.Builder()).hunger(2).saturationModifier(.1F).snack().build();

    /* Sandwiches */
    
    public static final FoodComponent AIR_SANDWICH = (new FoodComponent.Builder()).hunger(5).saturationModifier(.5F).build();
    public static final FoodComponent BL_SANDWICH = (new FoodComponent.Builder()).hunger(7).saturationModifier(.5F).build();
    public static final FoodComponent BLT_SANDWICH = (new FoodComponent.Builder()).hunger(9).saturationModifier(.7F).build();
    public static final FoodComponent BLTC_SANDWICH = (new FoodComponent.Builder()).hunger(12).saturationModifier(1).build();
    public static final FoodComponent BLTCP_SANDWICH = (new FoodComponent.Builder()).hunger(15).saturationModifier(1).build();
    public static final FoodComponent BLCP_SANDWICH = (new FoodComponent.Builder()).hunger(11).saturationModifier(.8F).build();
    public static final FoodComponent BLP_SANDWICH = (new FoodComponent.Builder()).hunger(8).saturationModifier(.6F).build();
}
