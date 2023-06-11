package com.allkillernofiller.moglowstoneplus.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;

public class GSSlabBlock extends SlabBlock {
    public GSSlabBlock() {
        super(Block.Properties.of()
                .sound(SoundType.GLASS)
                .strength(0.3f)
                .lightLevel((p_50755_) -> {
				      return 15;
				   })
        );
    }
}
