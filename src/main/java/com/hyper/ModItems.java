package com.hyper;

import com.hyper.item.WritingToolItem;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // 改为使用 Supplier 模式，延迟初始化
    private static Item WRITING_TOOL;
    
    public static Item getWritingTool() {
        if (WRITING_TOOL == null) {
            WRITING_TOOL = new WritingToolItem(new Item.Settings().maxCount(1));
        }
        return WRITING_TOOL;
    }

    public static void registerModItems() {
        Words.LOGGER.info("Registering mod items for " + Words.MOD_ID);
        
        // 在注册时才创建实例
        WRITING_TOOL = Registry.register(
            Registries.ITEM, 
            Identifier.of(Words.MOD_ID, "writing_tool"),
            new WritingToolItem(new Item.Settings().maxCount(1))
        );
    }
}