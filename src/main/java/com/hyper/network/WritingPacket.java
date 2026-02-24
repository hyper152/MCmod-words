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