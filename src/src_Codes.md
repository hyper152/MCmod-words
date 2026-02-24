# Project Directory Structure

```text
src/
    client/
        java/
            com/
                hyper/
        resources/
    main/
        java/
            com/
                hyper/
                    ModBlockEntities.java
                    ModBlocks.java
                    ModItems.java
                    Words.java
                    WordsClient.java
                    block/
                        BlockClientProxy.java
                        WritingBlock.java
                        WritingBlockEntity.java
                    client/
                        WritingBlockEntityRenderer.java
                        WritingScreen.java
                    item/
                        WritingToolClientProxy.java
                        WritingToolItem.java
                    mixin/
                    network/
                        WritingPacket.java
        resources/
            fabric.mod.json
            words.mixins.json
            assets/
                words/
                    icon.png
                    zh_cn.json
                    models/
                        block/
                            writing_block.json
                        item/
                            writing_tool.json
                    textures/
                        block/
                            writing_block.png
                        item/
                            writing_tool.png
    test/
        java/
```

---

## File: main\java\com\hyper\ModBlockEntities.java

```java
package com.hyper;

import com.hyper.block.WritingBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static BlockEntityType<WritingBlockEntity> WRITING_BLOCK_ENTITY;

    public static void registerBlockEntities() {
        WRITING_BLOCK_ENTITY = Registry.register(
            Registries.BLOCK_ENTITY_TYPE,
            Identifier.of(Words.MOD_ID, "writing_block_entity"),
            BlockEntityType.Builder.create(WritingBlockEntity::new, ModBlocks.WRITING_BLOCK).build()
        );
        
        Words.LOGGER.info("Registered block entity: " + WRITING_BLOCK_ENTITY);
    }
}
```

---

## File: main\java\com\hyper\ModBlocks.java

```java
package com.hyper;

import com.hyper.block.WritingBlock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block WRITING_BLOCK = registerBlock("writing_block",
        new WritingBlock(AbstractBlock.Settings.create()
            .nonOpaque()
            .noCollision()
            .air() // 设置为空气属性
            .strength(-1.0f, 3600000.0f)
            .dropsNothing()
            .pistonBehavior(PistonBehavior.IGNORE)
        ));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Words.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Words.MOD_ID, name),
            new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Words.LOGGER.info("Registering mod blocks for " + Words.MOD_ID);
        // 不需要添加到物品栏，因为我们会用物品
    }
}
```

---

## File: main\java\com\hyper\ModItems.java

```java
package com.hyper;

import com.hyper.item.WritingToolItem;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // 改为使用 Supplier 模式，延迟初始化
    private static Item WRITING_TOOL;
    
    public static Item getWritingTool() {
        if (WRITING_TOOL == null) {
            WRITING_TOOL = new WritingToolItem(new Item.Settings().maxCount(1));
        }
        return WRITING_TOOL;
    }

    public static void registerModItems() {
        Words.LOGGER.info("Registering mod items for " + Words.MOD_ID);
        
        // 在注册时才创建实例
        WRITING_TOOL = Registry.register(
            Registries.ITEM, 
            Identifier.of(Words.MOD_ID, "writing_tool"),
            new WritingToolItem(new Item.Settings().maxCount(1))
        );
    }
}
```

---

## File: main\java\com\hyper\Words.java

```java
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
```

---

## File: main\java\com\hyper\WordsClient.java

```java
package com.hyper;

import com.hyper.client.WritingBlockEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;

public class WordsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // 设置方块渲染为透明
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WRITING_BLOCK, RenderLayer.getTranslucent());
        
        // 注册方块实体渲染器
        BlockEntityRendererRegistry.register(ModBlockEntities.WRITING_BLOCK_ENTITY,
                WritingBlockEntityRenderer::new);
        
        Words.LOGGER.info("Words Client initialized");
    }
}
```

---

## File: main\java\com\hyper\block\BlockClientProxy.java

```java
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
```

---

## File: main\java\com\hyper\block\WritingBlock.java

```java
package com.hyper.block;

import org.jetbrains.annotations.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

// 删除内部的 BlockClientProxy 类，使用外部类
// import com.hyper.block.BlockClientProxy; // 如果放在不同包需要导入

public class WritingBlock extends Block implements BlockEntityProvider {
    
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
    
    private static final VoxelShape EMPTY_SHAPE = VoxelShapes.empty();

    public WritingBlock(Settings settings) {
        super(settings);
        setDefaultState(getStateManager().getDefaultState().with(FACING, Direction.NORTH));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        Direction wallDirection = ctx.getHorizontalPlayerFacing();
        BlockPos pos = ctx.getBlockPos();
        BlockPos wallPos = pos.offset(wallDirection);
        
        if (ctx.getWorld().getBlockState(wallPos).isSolid()) {
            return getDefaultState().with(FACING, wallDirection);
        }
        return null;
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        if (!world.isClient) {
            Direction facing = state.get(FACING);
            BlockPos wallPos = pos.offset(facing);
            
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof WritingBlockEntity writingBlock) {
                writingBlock.updateWallProperties(world, wallPos);
            }
        }
        super.onPlaced(world, pos, state, placer, itemStack);
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        if (!canPlaceAt(state, world, pos)) {
            world.breakBlock(pos, true);
        } else if (!world.isClient) {
            Direction facing = state.get(FACING);
            BlockPos wallPos = pos.offset(facing);
            if (sourcePos.equals(wallPos)) {
                BlockEntity blockEntity = world.getBlockEntity(pos);
                if (blockEntity instanceof WritingBlockEntity writingBlock) {
                    writingBlock.updateWallProperties(world, wallPos);
                }
            }
        }
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return EMPTY_SHAPE;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return EMPTY_SHAPE;
    }

    @Override
    public boolean isTransparent(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }

    @Override
    public float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
        return 1.0f;
    }

    @Override
    public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        return true;
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        Direction facing = state.get(FACING);
        BlockPos wallPos = pos.offset(facing);
        return world.getBlockState(wallPos).isSolid();
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        if (!canPlaceAt(state, world, pos)) {
            world.breakBlock(pos, true);
        }
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new WritingBlockEntity(pos, state);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (world.isClient) {
            // 使用外部代理类
            BlockClientProxy.openScreen(pos, state.get(FACING));
        }
        return ActionResult.SUCCESS;
    }
}
```

---

## File: main\java\com\hyper\block\WritingBlockEntity.java

```java
// main/java/com/hyper/block/WritingBlockEntity.java
package com.hyper.block;

import com.hyper.ModBlockEntities;
import com.hyper.Words;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WritingBlockEntity extends BlockEntity {
    private String text = "";
    private int color = 0xFFFFFF;
    private float textSize = 0.025f; // 添加这个字段

    public WritingBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.WRITING_BLOCK_ENTITY, pos, state);
    }

    public void setText(String text) {
        this.text = text;
        markDirty();
        sync();
    }

    public String getText() {
        return text;
    }

    public void setColor(int color) {
        this.color = color;
        markDirty();
        sync();
    }

    public int getColor() {
        return color;
    }

    // 添加这两个方法
    public void setTextSize(float size) {
        this.textSize = size;
        markDirty();
        sync();
    }

    public float getTextSize() {
        return textSize;
    }

    public void updateWallProperties(World world, BlockPos wallPos) {
        // 这里可以获取墙面颜色
    }

    private void sync() {
        if (world != null && !world.isClient) {
            world.updateListeners(pos, getCachedState(), getCachedState(), 3);
        }
    }

    @Override
    protected void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        super.writeNbt(nbt, registryLookup);
        nbt.putString("Text", text);
        nbt.putInt("Color", color);
        nbt.putFloat("TextSize", textSize); // 添加这行
    }

    @Override
    protected void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        super.readNbt(nbt, registryLookup);
        text = nbt.getString("Text");
        color = nbt.getInt("Color");
        textSize = nbt.contains("TextSize") ? nbt.getFloat("TextSize") : 0.025f; // 添加这行
    }

    @Override
    public NbtCompound toInitialChunkDataNbt(RegistryWrapper.WrapperLookup registryLookup) {
        return createNbt(registryLookup);
    }

    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }
}
```

---

## File: main\java\com\hyper\client\WritingBlockEntityRenderer.java

```java
package com.hyper.client;

import com.hyper.Words;
import com.hyper.block.WritingBlock;
import com.hyper.block.WritingBlockEntity;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.util.math.RotationAxis;

public class WritingBlockEntityRenderer implements BlockEntityRenderer<WritingBlockEntity> {
    private final TextRenderer textRenderer;

    public WritingBlockEntityRenderer(BlockEntityRendererFactory.Context ctx) {
        this.textRenderer = ctx.getTextRenderer();
        Words.LOGGER.info("WritingBlockEntityRenderer created");
    }

    @Override
    public void render(WritingBlockEntity entity, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light, int overlay) {
        
        String text = entity.getText();
        
        if (text == null || text.isEmpty()) {
            return;
        }

        matrices.push();
        
        // 移动到方块中心
        matrices.translate(0.5, 0.5, 0.5);
        
        // 根据朝向旋转
        switch (entity.getCachedState().get(WritingBlock.FACING)) {
            case NORTH:
                matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180));
                matrices.translate(0, 0, -0.45);
                break;
            case SOUTH:
                matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(0));
                matrices.translate(0, 0, 0.45);
                break;
            case WEST:
                matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(90));
                matrices.translate(0, 0, -0.45);
                break;
            case EAST:
                matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(270));
                matrices.translate(0, 0, -0.45);
                break;
        }
        
        // 使用可调的字体大小
        float scale = entity.getTextSize();
        matrices.scale(scale, -scale, scale);
        
        // 渲染文字 - 只渲染彩色文字，去掉黑色阴影
        Text renderText = Text.literal(text);
        int color = entity.getColor();
        
        float textWidth = textRenderer.getWidth(renderText);
        float xOffset = -textWidth / 2;
        float yOffset = -4;
        
        // 只渲染彩色文字，不渲染阴影
        textRenderer.draw(renderText, xOffset, yOffset, color, false,
                matrices.peek().getPositionMatrix(), vertexConsumers,
                TextRenderer.TextLayerType.NORMAL, 0, light);
        
        matrices.pop();
    }
}
```

---

## File: main\java\com\hyper\client\WritingScreen.java

```java
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
```

---

## File: main\java\com\hyper\item\WritingToolClientProxy.java

```java
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
```

---

## File: main\java\com\hyper\item\WritingToolItem.java

```java
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
```

---

## File: main\java\com\hyper\network\WritingPacket.java

```java
package com.hyper.network;

import com.hyper.ModBlocks;
import com.hyper.Words;
import com.hyper.block.WritingBlock;
import com.hyper.block.WritingBlockEntity;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Vec3d;
import net.minecraft.text.Text;
import org.joml.Vector3f;

public class WritingPacket {
    public static final Identifier WRITE_TEXT_PACKET_ID = Identifier.of(Words.MOD_ID, "write_text");
    
    public record WriteTextPayload(BlockPos pos, Direction side, String text, int color, float textSize) implements CustomPayload {
        public static final Id<WriteTextPayload> ID = new Id<>(WRITE_TEXT_PACKET_ID);
        
        public static final PacketCodec<RegistryByteBuf, WriteTextPayload> CODEC = new PacketCodec<>() {
            @Override
            public WriteTextPayload decode(RegistryByteBuf buf) {
                BlockPos pos = buf.readBlockPos();
                Direction side = buf.readEnumConstant(Direction.class);
                String text = buf.readString(32767);
                int color = buf.readInt();
                float textSize = buf.readFloat();
                return new WriteTextPayload(pos, side, text, color, textSize);
            }

            @Override
            public void encode(RegistryByteBuf buf, WriteTextPayload value) {
                buf.writeBlockPos(value.pos);
                buf.writeEnumConstant(value.side);
                buf.writeString(value.text);
                buf.writeInt(value.color);
                buf.writeFloat(value.textSize);
            }
        };

        @Override
        public Id<? extends CustomPayload> getId() {
            return ID;
        }
    }

    public static void sendText(BlockPos pos, Direction side, String text, int color, float textSize) {
        ClientPlayNetworking.send(new WriteTextPayload(pos, side, text, color, textSize));
    }

    public static void register() {
        PayloadTypeRegistry.playC2S().register(WriteTextPayload.ID, WriteTextPayload.CODEC);

        ServerPlayNetworking.registerGlobalReceiver(WriteTextPayload.ID, (payload, context) -> {
            context.server().execute(() -> {
                var player = context.player();
                var world = player.getServerWorld();
                var clickedPos = payload.pos();
                var side = payload.side();
                var text = payload.text();
                var color = payload.color();
                var textSize = payload.textSize();
                
                if (!clickedPos.isWithinDistance(player.getBlockPos(), 10)) {
                    Words.LOGGER.warn("玩家距离太远，无法写字");
                    return;
                }

                BlockPos writingBlockPos = clickedPos.offset(side);
                
                if (world.getBlockState(writingBlockPos).isAir()) {
                    world.setBlockState(writingBlockPos, 
                        ModBlocks.WRITING_BLOCK.getDefaultState()
                            .with(WritingBlock.FACING, side.getOpposite()));
                    
                    Words.LOGGER.info("在位置 {} 放置写字方块", writingBlockPos);
                }
                
                if (world.getBlockEntity(writingBlockPos) instanceof WritingBlockEntity writingBlock) {
                    writingBlock.setText(text);
                    writingBlock.setColor(color);
                    writingBlock.setTextSize(textSize);
                    
                    spawnWritingParticles(world, clickedPos, side, color);
                    
                    world.getPlayers().stream()
                        .filter(p -> p.getBlockPos().isWithinDistance(clickedPos, 20))
                        .forEach(p -> p.sendMessage(
                            Text.literal("§7[墙上的字] §f" + text + " §7- " + player.getName().getString())
                        ));
                    
                    Words.LOGGER.info("玩家 {} 在墙面 {} 写下: {}", player.getName().getString(), clickedPos, text);
                } else {
                    Words.LOGGER.error("无法获取写字方块实体 at {}", writingBlockPos);
                }
            });
        });
    }
    
    private static void spawnWritingParticles(ServerWorld world, BlockPos pos, Direction side, int color) {
        float r = ((color >> 16) & 0xFF) / 255.0f;
        float g = ((color >> 8) & 0xFF) / 255.0f;
        float b = (color & 0xFF) / 255.0f;
        
        Vec3d center = Vec3d.ofCenter(pos).add(
            side.getOffsetX() * 0.2,
            side.getOffsetY() * 0.2,
            side.getOffsetZ() * 0.2
        );
        
        world.spawnParticles(
            new DustParticleEffect(new Vector3f(r, g, b), 1.0f),
            center.x, center.y, center.z,
            15, 0.3, 0.3, 0.3, 0.1
        );
    }
}
```

---

## File: main\resources\assets\words\models\block\writing_block.json

```json
{
  "parent": "block/block",
  "textures": {
    "particle": "minecraft:block/barrier"
  },
  "elements": []
}
```

---

## File: main\resources\assets\words\models\item\writing_tool.json

```json
{
  "parent": "item/handheld",
  "textures": {
    "layer0": "words:item/writing_tool"
  }
}
```

---

## File: main\resources\assets\words\zh_cn.json

```json
{
    "item.words.writing_tool": "写字笔"
}
```

---

## File: main\resources\fabric.mod.json

```json
{
  "schemaVersion": 1,
  "id": "words",
  "version": "1.0.1",
  "name": "Words Mod",
  "description": "A transparent writing block mod for Minecraft 1.21.1",
  "authors": ["hyper"],
  "license": "MIT",
  "environment": "*",
  "entrypoints": {
    "main": ["com.hyper.Words"],
    "client": ["com.hyper.WordsClient"]
  },
  "depends": {
    "fabricloader": ">=0.16.0",
    "minecraft": "~1.21.1",
    "java": ">=21",
    "fabric-api": ">=0.102.1+1.21.1"
  }
}
```

---

## File: main\resources\words.mixins.json

```json
{
  "required": true,
  "minVersion": "0.8",
  "package": "com.hyper.mixin",
  "compatibilityLevel": "JAVA_17",
  "mixins": [
    "ExampleMixin"
  ],
  "client": [
    "client.ExampleClientMixin"
  ],
  "injectors": {
    "defaultRequire": 1
  }
}
```

---

