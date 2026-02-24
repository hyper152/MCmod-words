package com.hyper.client;

import com.hyper.Words;
import com.hyper.block.WritingBlock;
import com.hyper.block.WritingBlockEntity;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.util.math.RotationAxis;

public class WritingBlockEntityRenderer implements BlockEntityRenderer<WritingBlockEntity> {
    private final TextRenderer textRenderer;

    public WritingBlockEntityRenderer(BlockEntityRendererFactory.Context ctx) {
        this.textRenderer = ctx.getTextRenderer();
        Words.LOGGER.info("WritingBlockEntityRenderer created");
    }

    @Override
    public void render(WritingBlockEntity entity, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light, int overlay) {
        
        String text = entity.getText();
        
        if (text == null || text.isEmpty()) {
            return;
        }

        matrices.push();
        
        // 移动到方块中心
        matrices.translate(0.5, 0.5, 0.5);
        
        // 根据朝向旋转文字，使其面向玩家
        switch (entity.getCachedState().get(WritingBlock.FACING)) {
            case NORTH:
                matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(0));
                matrices.translate(0, 0, -0.45);
                break;
            case SOUTH:
                matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180));
                matrices.translate(0, 0, -0.45);
                break;
            case WEST:
                matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(90));
                matrices.translate(0, 0, -0.45);
                break;
            case EAST:
                matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(270));
                matrices.translate(0, 0, -0.45);
                break;
        }
        
        // 使用可调的字体大小
        float scale = entity.getTextSize();
        matrices.scale(scale, -scale, scale);
        
        // 渲染文字
        Text renderText = Text.literal(text);
        int color = entity.getColor();
        
        float textWidth = textRenderer.getWidth(renderText);
        float xOffset = -textWidth / 2;
        float yOffset = -4;
        
        // 只渲染彩色文字
        textRenderer.draw(renderText, xOffset, yOffset, color, false,
                matrices.peek().getPositionMatrix(), vertexConsumers,
                TextRenderer.TextLayerType.NORMAL, 0, light);
        
        matrices.pop();
    }
}