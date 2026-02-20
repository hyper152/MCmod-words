package com.hyper;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WordsClient implements ClientModInitializer {
    // 日志对象（和主类保持一致）
    public static final Logger LOGGER = LoggerFactory.getLogger(Words.MOD_ID);

    @Override
    public void onInitializeClient() {
        // 客户端初始化日志（验证加载）
        LOGGER.info("Initializing Words Mod Client for 1.21.1!");
        
        // 暂时无其他逻辑，先保证能启动
    }
}