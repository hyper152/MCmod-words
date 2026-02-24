package com.hyper;

import com.hyper.block.WritingBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static BlockEntityType<WritingBlockEntity> WRITING_BLOCK_ENTITY;

    public static void registerBlockEntities() {
        WRITING_BLOCK_ENTITY = Registry.register(
            Registries.BLOCK_ENTITY_TYPE,
            Identifier.of(Words.MOD_ID, "writing_block_entity"),
            BlockEntityType.Builder.create(WritingBlockEntity::new, ModBlocks.WRITING_BLOCK).build()
        );
        
        Words.LOGGER.info("Registered block entity: " + WRITING_BLOCK_ENTITY);
    }
}