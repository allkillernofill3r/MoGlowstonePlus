package com.allkillernofiller.moglowstoneplus.item;

import com.themastergeneral.moglowstone.MoGlowstone;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class BlockItemCreativeTab extends BlockItem {
    public BlockItemCreativeTab(Block block) {
        super(block, new Item.Properties().tab(MoGlowstone.ITEMGROUP));
    }
}
