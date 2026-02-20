# Project Directory Structure

```text
MC/
    .github/
        workflows/
            build.yml
    src/
        client/
            java/
                com/
                    hyper/
                        WordsClient.java
                        mixin/
                            client/
                                ExampleClientMixin.java
            resources/
        main/
            java/
                com/
                    hyper/
                        Words.java
                        mixin/
                            ExampleMixin.java
            resources/
                assets/
                    words/
```

---

## File: .github\workflows\build.yml

```yml
# Automatically build the project and run any configured tests for every push
# and submitted pull request. This can help catch issues that only occur on
# certain platforms or Java versions, and provides a first line of defence
# against bad commits.

name: build
on: [pull_request, push]

jobs:
  build:
    runs-on: ubuntu-24.04
    steps:
      - name: checkout repository
        uses: actions/checkout@v4
      - name: validate gradle wrapper
        uses: gradle/actions/wrapper-validation@v4
      - name: setup jdk
        uses: actions/setup-java@v4
        with:
          java-version: '25'
          distribution: 'microsoft'
      - name: make gradle wrapper executable
        run: chmod +x ./gradlew
      - name: build
        run: ./gradlew build
      - name: capture build artifacts
        uses: actions/upload-artifact@v4
        with:
          name: Artifacts
          path: build/libs/

```

---

## File: src\client\java\com\hyper\WordsClient.java

```java
package com.hyper;

import net.fabricmc.api.ClientModInitializer;

public class WordsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
	}
}
```

---

## File: src\client\java\com\hyper\mixin\client\ExampleClientMixin.java

```java
package com.hyper.mixin.client;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class ExampleClientMixin {
	@Inject(at = @At("HEAD"), method = "run")
	private void init(CallbackInfo info) {
		// This code is injected into the start of Minecraft.run()V
	}
}
```

---

## File: src\main\java\com\hyper\Words.java

```java
package com.hyper;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Words implements ModInitializer {
	public static final String MOD_ID = "words";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}
}
```

---

## File: src\main\java\com\hyper\mixin\ExampleMixin.java

```java
package com.hyper.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "loadLevel")
	private void init(CallbackInfo info) {
		// This code is injected into the start of MinecraftServer.loadLevel()V
	}
}
```

---

