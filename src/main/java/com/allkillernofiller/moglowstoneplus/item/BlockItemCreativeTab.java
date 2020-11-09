package com.allkillernofiller.moglowstoneplus.item;

import com.themastergeneral.moglowstone.MoGlowstone;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemCreativeTab extends BlockItem {
    public BlockItemCreativeTab(Block block) {
        super(block, new Item.Properties().group(MoGlowstone.ITEMGROUP));
    }
}
