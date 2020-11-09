package com.allkillernofiller.moglowstoneplus.block;

import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class GSSlabBlock extends SlabBlock {
    public GSSlabBlock() {
        super(Block.Properties.create(Material.GLASS)
                .sound(SoundType.GLASS)
                .hardnessAndResistance(0.3f)
                .harvestTool(ToolType.PICKAXE)
                .setLightLevel((bstate) -> 15)
        );
    }
}
