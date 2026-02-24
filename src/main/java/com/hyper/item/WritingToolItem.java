package com.hyper.item;

import com.hyper.Words;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
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
        
        // 检查点击的墙面是否是实心方块
        if (world.getBlockState(pos).isSolid()) {
            if (world.isClient) {
                // 调用客户端代理类
                WritingToolClientProxy.openScreen(pos, side);
            }
            return ActionResult.SUCCESS;
        }
        
        return ActionResult.PASS;
    }
}