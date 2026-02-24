package com.hyper;

import com.hyper.block.WritingBlock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block WRITING_BLOCK = registerBlock("writing_block",
        new WritingBlock(AbstractBlock.Settings.create()
            .nonOpaque()
            .noCollision()
            .air() // 设置为空气属性
            .strength(-1.0f, 3600000.0f)
            .dropsNothing()
            .pistonBehavior(PistonBehavior.IGNORE)
        ));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Words.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Words.MOD_ID, name),
            new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Words.LOGGER.info("Registering mod blocks for " + Words.MOD_ID);
        // 不需要添加到物品栏，因为我们会用物品
    }
}