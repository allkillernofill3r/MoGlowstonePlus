package com.allkillernofiller.moglowstoneplus;

import com.allkillernofiller.moglowstoneplus.init.BlockInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("moglowstoneplus")
public class MoGlowstonePlus {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "moglowstoneplus";

    public MoGlowstonePlus() {
        // Registers Blocks and Block Items
        BlockInit.registerBlocks();

        MinecraftForge.EVENT_BUS.register(this);
    }
}
