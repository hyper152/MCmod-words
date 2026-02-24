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