package dev.lush.teastuff;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.lush.teastuff.components.FoodComponents;
import dev.lush.teastuff.items.MugItem;

public class ExampleMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("teastuff");

	public static final Item MUG = new MugItem(new Item.Settings().group(ItemGroup.MISC));
	public static final Item TEABAG = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item BROWNSUGAR = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item MOLASSES = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item CUP = new MugItem(new Item.Settings().group(ItemGroup.MISC));
	public static final Item CHOCOLATE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.CHOCOLATE));
	public static final Item CHOCOLATE_POWDER = new MugItem(new Item.Settings().group(ItemGroup.MISC));
	
	
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		createItems();
	}

	public void createItems() {		
		Registry.register(Registry.ITEM, new Identifier("teastuff", "mug"), MUG);
		Registry.register(Registry.ITEM, new Identifier("teastuff","teabag"), TEABAG);
		Registry.register(Registry.ITEM, new Identifier("teastuff","brown_sugar"), BROWNSUGAR);
		Registry.register(Registry.ITEM, new Identifier("teastuff","molasses"), MOLASSES);
		Registry.register(Registry.ITEM, new Identifier("teastuff","cup"), CUP);
		Registry.register(Registry.ITEM, new Identifier("teastuff","chocolate"), CHOCOLATE);
		Registry.register(Registry.ITEM, new Identifier("teastuff","chocolate_powder"), CHOCOLATE_POWDER);
	}
}