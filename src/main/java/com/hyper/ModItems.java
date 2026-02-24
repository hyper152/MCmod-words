package com.hyper;

import com.hyper.item.WritingToolItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item WRITING_TOOL = registerItem("writing_tool",
        new WritingToolItem(new Item.Settings().maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Words.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Words.LOGGER.info("Registering mod items for " + Words.MOD_ID);
    }
}