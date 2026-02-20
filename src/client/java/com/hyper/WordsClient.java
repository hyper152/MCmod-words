package com.hyper;

import net.fabricmc.api.ClientModInitializer;

public class WordsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Words.LOGGER.info("Initializing Words Mod Client!");
    }
}