package com.allkillernofiller.moglowstoneplus.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class GSBrick extends Block {
    public GSBrick() {
        super(Block.Properties.of()
                .sound(SoundType.GLASS)
                .strength(0.3F)
                .lightLevel((p_50755_) -> {
				      return 15;
				   })
        );
    }
}
