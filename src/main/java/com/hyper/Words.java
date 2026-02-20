package com.hyper;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Words implements ModInitializer {
    // 模组ID（必须和 fabric.mod.json 中的 id 一致）
    public static final String MOD_ID = "words";
    // 日志对象
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        // 主初始化日志
        LOGGER.info("Initializing Words Mod for 1.21.1!");
        
        // 注册方块/物品等逻辑可后续添加，先保证能启动
        ModBlocks.registerModBlocks();
    }
}