package com.hyper.item;

import com.hyper.Words;
import com.hyper.client.WritingScreen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class WritingToolItem extends Item {
    public WritingToolItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        Direction side = context.getSide();
        PlayerEntity player = context.getPlayer();
        
        // 检查点击的墙面是否是实心方块
        if (world.getBlockState(pos).isSolid()) {
            if (world.isClient) {
                // 在客户端打开输入界面
                net.minecraft.client.MinecraftClient.getInstance().setScreen(
                    new WritingScreen(pos, side)
                );
                Words.LOGGER.info("打开文字输入界面");
            }
            return ActionResult.SUCCESS;
        }
        
        return ActionResult.PASS;
    }
}