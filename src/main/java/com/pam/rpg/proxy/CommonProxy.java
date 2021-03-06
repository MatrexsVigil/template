package com.pam.rpg.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
	BlockRegistry.initBlockRegistry();
        MinecraftForge.EVENT_BUS.register(new BlockRegistry());
        
    }

    public void init(FMLInitializationEvent e) {
		GameRegistry.registerWorldGenerator(new WorldGenPamFossil(), 0);
    }

    public void postInit(FMLPostInitializationEvent e) {
    }

}
