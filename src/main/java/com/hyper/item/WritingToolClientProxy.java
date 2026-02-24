package com.hyper.item;

import com.hyper.Words;
import com.hyper.client.WritingScreen;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

public class WritingToolClientProxy {
    @net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
    public static void openScreen(BlockPos pos, Direction side) {
        net.minecraft.client.MinecraftClient.getInstance().setScreen(
            new WritingScreen(pos, side)
        );
        Words.LOGGER.info("打开文字输入界面");
    }
}