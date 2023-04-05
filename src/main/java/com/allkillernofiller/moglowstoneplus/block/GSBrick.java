package com.allkillernofiller.moglowstoneplus.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class GSBrick extends Block {
    public GSBrick() {
        super(Block.Properties.of(Material.GLASS)
                .sound(SoundType.GLASS)
                .strength(0.3F)
                .lightLevel((p_50755_) -> {
				      return 15;
				   })
        );
    }
}
