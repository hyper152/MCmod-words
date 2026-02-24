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