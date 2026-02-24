package com.hyper;

import com.hyper.client.WritingBlockEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;

public class WordsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // 设置方块渲染为透明
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WRITING_BLOCK, RenderLayer.getTranslucent());
        
        // 注册方块实体渲染器
        BlockEntityRendererRegistry.register(ModBlockEntities.WRITING_BLOCK_ENTITY,
                WritingBlockEntityRenderer::new);
        
        Words.LOGGER.info("Words Client initialized");
    }
}