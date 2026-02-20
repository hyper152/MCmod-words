package com.hyper;

import com.hyper.block.WritingBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    // 注册写字方块
    public static final Block WRITING_BLOCK = registerBlock("writing_block",
        new WritingBlock(AbstractBlock.Settings.copy(Blocks.STONE)));

    // 注册方块和对应的物品
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Words.MOD_ID, name), block);
    }

    // 注册方块物品（让玩家能拿在手上）
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Words.MOD_ID, name),
            new BlockItem(block, new Item.Settings()));
    }

    // 初始化方法（在 Words.java 中调用）
    public static void registerModBlocks() {
        Words.LOGGER.info("Registering mod blocks for " + Words.MOD_ID);
        
        // 添加到“建筑方块”物品栏
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(WRITING_BLOCK);
        });
    }
}