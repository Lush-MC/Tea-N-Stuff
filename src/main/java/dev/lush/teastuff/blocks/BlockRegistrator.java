package dev.lush.teastuff.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistrator {
    public static final Block PICKLING_JAR = new Block(FabricBlockSettings.of(Material.GLASS).strength(1.0f).sounds(BlockSoundGroup.GLASS));

    public static void createBlocks() {
        Registry.register(Registry.BLOCK, new Identifier("teastuff", "pickling_jar"), PICKLING_JAR);
    }
}
