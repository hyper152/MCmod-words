package com.hyper.block;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

public class BlockClientProxy {
    @net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
    public static void openScreen(BlockPos pos, Direction facing) {
        net.minecraft.client.MinecraftClient.getInstance().setScreen(
            new com.hyper.client.WritingScreen(pos, facing)
        );
    }
}