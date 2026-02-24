package com.hyper;

import com.hyper.network.WritingPacket;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Words implements ModInitializer {
    public static final String MOD_ID = "words";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Words Mod for 1.21.1!");
        
        // 注册物品
        ModItems.registerModItems();
        
        // 注册方块
        ModBlocks.registerModBlocks();
        
        // 注册方块实体
        ModBlockEntities.registerBlockEntities();
        
        // 注册网络包
        WritingPacket.register();
        
        LOGGER.info("Words Mod initialization complete!");
    }
}