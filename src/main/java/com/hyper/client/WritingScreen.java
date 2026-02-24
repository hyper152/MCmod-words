package com.hyper.client;

import com.hyper.Words;
import com.hyper.network.WritingPacket;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.SliderWidget;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

public class WritingScreen extends Screen {
    private TextFieldWidget textField;
    private final BlockPos pos;
    private final Direction side;
    private float textSize = 0.025f; // 默认字体大小 (100%)
    
    // 自定义滑块类
    private class SizeSlider extends SliderWidget {
        public SizeSlider(int x, int y, int width, int height, Text text, double value) {
            super(x, y, width, height, text, value);
        }
        
        @Override
        protected void updateMessage() {
            int percentage = (int)(value * 400); // 0.0-1.0 对应 0-400%
            setMessage(Text.literal("字体大小: " + percentage + "%"));
        }
        
        @Override
        protected void applyValue() {
            // 将滑块值（0.0-1.0）映射到字体大小（0.01-0.10）
            // 0.01 (40% of 0.025) 到 0.10 (400% of 0.025)
            textSize = 0.01f + (float)(value * 0.09f);
        }
    }
    
    private SizeSlider sizeSlider;

    public WritingScreen(BlockPos pos, Direction side) {
        super(Text.literal("在墙上写字"));
        this.pos = pos;
        this.side = side;
    }

    @Override
    protected void init() {
        // 文字输入框
        this.textField = new TextFieldWidget(
            this.textRenderer, 
            this.width / 2 - 100, 
            this.height / 2 - 40, 
            200, 20, 
            Text.literal("请输入文字")
        );
        this.textField.setMaxLength(50);
        this.addDrawableChild(this.textField);

        // 字体大小滑块 - 计算默认值位置 (0.025 对应 0.01 + x*0.09 = 0.025 => x = (0.015)/0.09 ≈ 0.167)
        this.sizeSlider = new SizeSlider(
            this.width / 2 - 100,
            this.height / 2 - 15,
            200, 20,
            Text.literal("字体大小: 100%"),
            0.167f // 默认值对应 100% (0.025)
        );
        this.addDrawableChild(this.sizeSlider);

        // 确定按钮
        this.addDrawableChild(ButtonWidget.builder(
            Text.literal("确定"), 
            button -> {
                String text = textField.getText();
                Words.LOGGER.info("输入文字: " + text + ", 字体大小: " + textSize);
                if (!text.isEmpty()) {
                    WritingPacket.sendText(pos, side, text, 0xFFFFFF, textSize);
                }
                this.close();
            })
            .dimensions(this.width / 2 - 100, this.height / 2 + 15, 200, 20)
            .build());

        // 取消按钮
        this.addDrawableChild(ButtonWidget.builder(
            Text.literal("取消"), 
            button -> this.close())
            .dimensions(this.width / 2 - 100, this.height / 2 + 40, 200, 20)
            .build());
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context, mouseX, mouseY, delta);
        context.drawCenteredTextWithShadow(
            this.textRenderer, 
            this.title, 
            this.width / 2, 
            20, 
            0xFFFFFF
        );
        super.render(context, mouseX, mouseY, delta);
    }

    @Override
    public boolean shouldPause() {
        return false;
    }
}