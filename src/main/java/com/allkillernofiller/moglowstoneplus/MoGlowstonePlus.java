package com.allkillernofiller.moglowstoneplus;

import com.allkillernofiller.moglowstoneplus.init.BlockInit;
import com.themastergeneral.moglowstone.TabRegistry;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("moglowstoneplus")
public class MoGlowstonePlus {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "moglowstoneplus";

    public MoGlowstonePlus() {
    	
		IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(this::fillTab);
        BlockInit.registerBlocks();

        MinecraftForge.EVENT_BUS.register(this);
    }
    
    private void fillTab(BuildCreativeModeTabContentsEvent ev)
	{
		if (ev.getTab() == TabRegistry.MOGLOWSTONE_TAB.get())
		{
			ev.accept(BlockInit.BLACK_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.BLACK_GLOWSTONE_SLAB_ITEM);
			ev.accept(BlockInit.BLUE_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.BLUE_GLOWSTONE_SLAB_ITEM);
			ev.accept(BlockInit.BROWN_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.BROWN_GLOWSTONE_SLAB_ITEM);
			ev.accept(BlockInit.CYAN_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.CYAN_GLOWSTONE_SLAB_ITEM);
			ev.accept(BlockInit.GRAY_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.GRAY_GLOWSTONE_SLAB_ITEM);
			ev.accept(BlockInit.GREEN_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.GREEN_GLOWSTONE_SLAB_ITEM);
			ev.accept(BlockInit.LIGHT_BLUE_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.LIGHT_BLUE_GLOWSTONE_SLAB_ITEM);
			ev.accept(BlockInit.LIGHT_GRAY_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.LIGHT_GRAY_GLOWSTONE_SLAB_ITEM);
			ev.accept(BlockInit.LIME_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.LIME_GLOWSTONE_SLAB_ITEM);
			ev.accept(BlockInit.MAGENTA_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.MAGENTA_GLOWSTONE_SLAB_ITEM);
			ev.accept(BlockInit.ORANGE_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.ORANGE_GLOWSTONE_SLAB_ITEM);
			ev.accept(BlockInit.PINK_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.PINK_GLOWSTONE_SLAB_ITEM);
			ev.accept(BlockInit.PURPLE_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.PURPLE_GLOWSTONE_SLAB_ITEM);
			ev.accept(BlockInit.RED_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.RED_GLOWSTONE_SLAB_ITEM);
			ev.accept(BlockInit.WHITE_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.WHITE_GLOWSTONE_SLAB_ITEM);
		}
	}
}
