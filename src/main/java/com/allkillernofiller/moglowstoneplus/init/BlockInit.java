package com.allkillernofiller.moglowstoneplus.init;

import com.allkillernofiller.moglowstoneplus.MoGlowstonePlus;
import com.allkillernofiller.moglowstoneplus.block.GSBrick;
import com.allkillernofiller.moglowstoneplus.block.GSSlabBlock;
import com.allkillernofiller.moglowstoneplus.item.BlockItemCreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoGlowstonePlus.MOD_ID);
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoGlowstonePlus.MOD_ID);

    public static void registerBlocks() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<SlabBlock> GLOWSTONE_SLAB = BLOCKS.register("glowstone_slab", () -> new SlabBlock(Block.Properties.from(Blocks.GLOWSTONE)));
    public static final RegistryObject<SlabBlock> WHITE_GLOWSTONE_SLAB = BLOCKS.register("white_glowstone_slab", GSSlabBlock::new);
    public static final RegistryObject<SlabBlock> ORANGE_GLOWSTONE_SLAB = BLOCKS.register("orange_glowstone_slab", GSSlabBlock::new);
    public static final RegistryObject<SlabBlock> MAGENTA_GLOWSTONE_SLAB = BLOCKS.register("magenta_glowstone_slab", GSSlabBlock::new);
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_GLOWSTONE_SLAB = BLOCKS.register("light_blue_glowstone_slab", GSSlabBlock::new);
    public static final RegistryObject<SlabBlock> LIME_GLOWSTONE_SLAB = BLOCKS.register("lime_glowstone_slab", GSSlabBlock::new);
    public static final RegistryObject<SlabBlock> PINK_GLOWSTONE_SLAB = BLOCKS.register("pink_glowstone_slab", GSSlabBlock::new);
    public static final RegistryObject<SlabBlock> GRAY_GLOWSTONE_SLAB = BLOCKS.register("gray_glowstone_slab", GSSlabBlock::new);
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_GLOWSTONE_SLAB = BLOCKS.register("light_gray_glowstone_slab", GSSlabBlock::new);
    public static final RegistryObject<SlabBlock> CYAN_GLOWSTONE_SLAB = BLOCKS.register("cyan_glowstone_slab", GSSlabBlock::new);
    public static final RegistryObject<SlabBlock> PURPLE_GLOWSTONE_SLAB = BLOCKS.register("purple_glowstone_slab", GSSlabBlock::new);
    public static final RegistryObject<SlabBlock> BLUE_GLOWSTONE_SLAB = BLOCKS.register("blue_glowstone_slab", GSSlabBlock::new);
    public static final RegistryObject<SlabBlock> BROWN_GLOWSTONE_SLAB = BLOCKS.register("brown_glowstone_slab", GSSlabBlock::new);
    public static final RegistryObject<SlabBlock> GREEN_GLOWSTONE_SLAB = BLOCKS.register("green_glowstone_slab", GSSlabBlock::new);
    public static final RegistryObject<SlabBlock> RED_GLOWSTONE_SLAB = BLOCKS.register("red_glowstone_slab", GSSlabBlock::new);
    public static final RegistryObject<SlabBlock> BLACK_GLOWSTONE_SLAB = BLOCKS.register("black_glowstone_slab", GSSlabBlock::new);
    public static final RegistryObject<Block> WHITE_GLOWSTONE_BRICK = BLOCKS.register("white_glowstone_brick", GSBrick::new);
    public static final RegistryObject<Block> ORANGE_GLOWSTONE_BRICK = BLOCKS.register("orange_glowstone_brick", GSBrick::new);
    public static final RegistryObject<Block> MAGENTA_GLOWSTONE_BRICK = BLOCKS.register("magenta_glowstone_brick", GSBrick::new);
    public static final RegistryObject<Block> LIGHT_BLUE_GLOWSTONE_BRICK = BLOCKS.register("light_blue_glowstone_brick", GSBrick::new);
    public static final RegistryObject<Block> LIME_GLOWSTONE_BRICK = BLOCKS.register("lime_glowstone_brick", GSBrick::new);
    public static final RegistryObject<Block> PINK_GLOWSTONE_BRICK = BLOCKS.register("pink_glowstone_brick", GSBrick::new);
    public static final RegistryObject<Block> GRAY_GLOWSTONE_BRICK = BLOCKS.register("gray_glowstone_brick", GSBrick::new);
    public static final RegistryObject<Block> LIGHT_GRAY_GLOWSTONE_BRICK = BLOCKS.register("light_gray_glowstone_brick", GSBrick::new);
    public static final RegistryObject<Block> CYAN_GLOWSTONE_BRICK = BLOCKS.register("cyan_glowstone_brick", GSBrick::new);
    public static final RegistryObject<Block> PURPLE_GLOWSTONE_BRICK = BLOCKS.register("purple_glowstone_brick", GSBrick::new);
    public static final RegistryObject<Block> BLUE_GLOWSTONE_BRICK = BLOCKS.register("blue_glowstone_brick", GSBrick::new);
    public static final RegistryObject<Block> BROWN_GLOWSTONE_BRICK = BLOCKS.register("brown_glowstone_brick", GSBrick::new);
    public static final RegistryObject<Block> GREEN_GLOWSTONE_BRICK = BLOCKS.register("green_glowstone_brick", GSBrick::new);
    public static final RegistryObject<Block> RED_GLOWSTONE_BRICK = BLOCKS.register("red_glowstone_brick", GSBrick::new);
    public static final RegistryObject<Block> BLACK_GLOWSTONE_BRICK = BLOCKS.register("black_glowstone_brick", GSBrick::new);


    public static final RegistryObject<Item> GLOWSTONE_SLAB_ITEM = ITEMS.register("glowstone_slab", () -> new BlockItemCreativeTab(GLOWSTONE_SLAB.get()));
    public static final RegistryObject<Item> WHITE_GLOWSTONE_SLAB_ITEM = ITEMS.register("white_glowstone_slab", () -> new BlockItemCreativeTab(WHITE_GLOWSTONE_SLAB.get()));
    public static final RegistryObject<Item> ORANGE_GLOWSTONE_SLAB_ITEM = ITEMS.register("orange_glowstone_slab", () -> new BlockItemCreativeTab(ORANGE_GLOWSTONE_SLAB.get()));
    public static final RegistryObject<Item> MAGENTA_GLOWSTONE_SLAB_ITEM = ITEMS.register("magenta_glowstone_slab", () -> new BlockItemCreativeTab(MAGENTA_GLOWSTONE_SLAB.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_GLOWSTONE_SLAB_ITEM = ITEMS.register("light_blue_glowstone_slab", () -> new BlockItemCreativeTab(LIGHT_BLUE_GLOWSTONE_SLAB.get()));
    public static final RegistryObject<Item> LIME_GLOWSTONE_SLAB_ITEM = ITEMS.register("lime_glowstone_slab", () -> new BlockItemCreativeTab(LIME_GLOWSTONE_SLAB.get()));
    public static final RegistryObject<Item> PINK_GLOWSTONE_SLAB_ITEM = ITEMS.register("pink_glowstone_slab", () -> new BlockItemCreativeTab(PINK_GLOWSTONE_SLAB.get()));
    public static final RegistryObject<Item> GRAY_GLOWSTONE_SLAB_ITEM = ITEMS.register("gray_glowstone_slab", () -> new BlockItemCreativeTab(GRAY_GLOWSTONE_SLAB.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_GLOWSTONE_SLAB_ITEM = ITEMS.register("light_gray_glowstone_slab", () -> new BlockItemCreativeTab(LIGHT_GRAY_GLOWSTONE_SLAB.get()));
    public static final RegistryObject<Item> CYAN_GLOWSTONE_SLAB_ITEM = ITEMS.register("cyan_glowstone_slab", () -> new BlockItemCreativeTab(CYAN_GLOWSTONE_SLAB.get()));
    public static final RegistryObject<Item> PURPLE_GLOWSTONE_SLAB_ITEM = ITEMS.register("purple_glowstone_slab", () -> new BlockItemCreativeTab(PURPLE_GLOWSTONE_SLAB.get()));
    public static final RegistryObject<Item> BLUE_GLOWSTONE_SLAB_ITEM = ITEMS.register("blue_glowstone_slab", () -> new BlockItemCreativeTab(BLUE_GLOWSTONE_SLAB.get()));
    public static final RegistryObject<Item> BROWN_GLOWSTONE_SLAB_ITEM = ITEMS.register("brown_glowstone_slab", () -> new BlockItemCreativeTab(BROWN_GLOWSTONE_SLAB.get()));
    public static final RegistryObject<Item> GREEN_GLOWSTONE_SLAB_ITEM = ITEMS.register("green_glowstone_slab", () -> new BlockItemCreativeTab(GREEN_GLOWSTONE_SLAB.get()));
    public static final RegistryObject<Item> RED_GLOWSTONE_SLAB_ITEM = ITEMS.register("red_glowstone_slab", () -> new BlockItemCreativeTab(RED_GLOWSTONE_SLAB.get()));
    public static final RegistryObject<Item> BLACK_GLOWSTONE_SLAB_ITEM = ITEMS.register("black_glowstone_slab", () -> new BlockItemCreativeTab(BLACK_GLOWSTONE_SLAB.get()));
    public static final RegistryObject<Item> WHITE_GLOWSTONE_BRICK_ITEM = ITEMS.register("white_glowstone_brick", () -> new BlockItemCreativeTab(WHITE_GLOWSTONE_BRICK.get()));
    public static final RegistryObject<Item> ORANGE_GLOWSTONE_BRICK_ITEM = ITEMS.register("orange_glowstone_brick", () -> new BlockItemCreativeTab(ORANGE_GLOWSTONE_BRICK.get()));
    public static final RegistryObject<Item> MAGENTA_GLOWSTONE_BRICK_ITEM = ITEMS.register("magenta_glowstone_brick", () -> new BlockItemCreativeTab(MAGENTA_GLOWSTONE_BRICK.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_GLOWSTONE_BRICK_ITEM = ITEMS.register("light_blue_glowstone_brick", () -> new BlockItemCreativeTab(LIGHT_BLUE_GLOWSTONE_BRICK.get()));
    public static final RegistryObject<Item> LIME_GLOWSTONE_BRICK_ITEM = ITEMS.register("lime_glowstone_brick", () -> new BlockItemCreativeTab(LIME_GLOWSTONE_BRICK.get()));
    public static final RegistryObject<Item> PINK_GLOWSTONE_BRICK_ITEM = ITEMS.register("pink_glowstone_brick", () -> new BlockItemCreativeTab(PINK_GLOWSTONE_BRICK.get()));
    public static final RegistryObject<Item> GRAY_GLOWSTONE_BRICK_ITEM = ITEMS.register("gray_glowstone_brick", () -> new BlockItemCreativeTab(GRAY_GLOWSTONE_BRICK.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_GLOWSTONE_BRICK_ITEM = ITEMS.register("light_gray_glowstone_brick", () -> new BlockItemCreativeTab(LIGHT_GRAY_GLOWSTONE_BRICK.get()));
    public static final RegistryObject<Item> CYAN_GLOWSTONE_BRICK_ITEM = ITEMS.register("cyan_glowstone_brick", () -> new BlockItemCreativeTab(CYAN_GLOWSTONE_BRICK.get()));
    public static final RegistryObject<Item> PURPLE_GLOWSTONE_BRICK_ITEM = ITEMS.register("purple_glowstone_brick", () -> new BlockItemCreativeTab(PURPLE_GLOWSTONE_BRICK.get()));
    public static final RegistryObject<Item> BLUE_GLOWSTONE_BRICK_ITEM = ITEMS.register("blue_glowstone_brick", () -> new BlockItemCreativeTab(BLUE_GLOWSTONE_BRICK.get()));
    public static final RegistryObject<Item> GREEN_GLOWSTONE_BRICK_ITEM = ITEMS.register("green_glowstone_brick", () -> new BlockItemCreativeTab(GREEN_GLOWSTONE_BRICK.get()));
    public static final RegistryObject<Item> RED_GLOWSTONE_BRICK_ITEM = ITEMS.register("red_glowstone_brick", () -> new BlockItemCreativeTab(RED_GLOWSTONE_BRICK.get()));
    public static final RegistryObject<Item> BLACK_GLOWSTONE_BRICK_ITEM = ITEMS.register("black_glowstone_brick", () -> new BlockItemCreativeTab(BLACK_GLOWSTONE_BRICK.get()));
}
