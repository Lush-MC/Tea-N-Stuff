package dev.lush.teastuff.items;

import dev.lush.teastuff.components.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistrator {
	public static final Item MUG = new MugItem(new Item.Settings().group(ItemGroup.MISC));
	public static final Item TEABAG = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item BROWNSUGAR = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item MOLASSES = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item CUP = new MugItem(new Item.Settings().group(ItemGroup.MISC));
	public static final Item CHOCOLATE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.CHOCOLATE));
	public static final Item CHOCOLATE_POWDER = new MugItem(new Item.Settings().group(ItemGroup.MISC));
    public static final Item BREAD_SLICE = new MugItem(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.BREAD_SLICE));
    public static final Item COCOA_BUTTER = new Item(new Item.Settings().group(ItemGroup.MISC));



    /* Sandwiches */

    public static final Item AIR_SANDWICH = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.AIR_SANDWICH));
    public static final Item BACON_LETTUCE_SANDWICH = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.BL_SANDWICH));
    public static final Item BACON_LETTUCE_TOMATO_SANDWICH = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.BLT_SANDWICH));
    public static final Item BACON_LETTUCE_TOMATO_CHEESE_SANDWICH = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.BLTC_SANDWICH));
    public static final Item BACON_LETTUCE_TOMATO_CHEESE_PICKLE_SANDWICH = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.BLTCP_SANDWICH));
    public static final Item BACON_LETTUCE_CHEESE_PICKLE_SANDWICH = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.BLCP_SANDWICH));
    public static final Item BACON_LETTUCE_PICKLE_SANDWICH = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.BLP_SANDWICH));


    public static void createItems() {
        /* Base Ingredients */

		Registry.register(Registry.ITEM, new Identifier("teastuff", "molasses"), MOLASSES);
		Registry.register(Registry.ITEM, new Identifier("teastuff", "chocolate_powder"), CHOCOLATE_POWDER);
        
        /* Manufactured Ingredients */
        
		Registry.register(Registry.ITEM, new Identifier("teastuff", "brown_sugar"), BROWNSUGAR);
		Registry.register(Registry.ITEM, new Identifier("teastuff", "chocolate"), CHOCOLATE);
        Registry.register(Registry.ITEM, new Identifier("teastuff", "bread_slice"), BREAD_SLICE);


        /* General Items */
        
		Registry.register(Registry.ITEM, new Identifier("teastuff", "cup"), CUP);
		Registry.register(Registry.ITEM, new Identifier("teastuff", "mug"), MUG);
		Registry.register(Registry.ITEM, new Identifier("teastuff", "teabag"), TEABAG);
        Registry.register(Registry.ITEM, new Identifier("teastuff","cocoa_butter"), COCOA_BUTTER);

        /* Sandwiches */

        Registry.register(Registry.ITEM, new Identifier("teastuff", "sandwich_o_air"), AIR_SANDWICH);
        Registry.register(Registry.ITEM, new Identifier("teastuff", "sandwich_o_bl"), BACON_LETTUCE_SANDWICH);
        Registry.register(Registry.ITEM, new Identifier("teastuff", "sandwich_o_blt"), BACON_LETTUCE_TOMATO_SANDWICH);
        Registry.register(Registry.ITEM, new Identifier("teastuff", "sandwich_o_bltc"), BACON_LETTUCE_TOMATO_CHEESE_SANDWICH);
        Registry.register(Registry.ITEM, new Identifier("teastuff", "sandwich_o_bltcp"), BACON_LETTUCE_TOMATO_CHEESE_PICKLE_SANDWICH);
        Registry.register(Registry.ITEM, new Identifier("teastuff", "sandwich_o_blcp"), BACON_LETTUCE_CHEESE_PICKLE_SANDWICH);
        Registry.register(Registry.ITEM, new Identifier("teastuff", "sandwich_o_blp"), BACON_LETTUCE_PICKLE_SANDWICH);

	}
}
