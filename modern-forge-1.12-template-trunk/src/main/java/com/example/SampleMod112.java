package com.example;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
	modid = SampleMod112.MODID,
	name = SampleMod112.NAME,
	version = SampleMod112.VERSION
)
public class SampleMod112 {
	public static final String MODID = "samplemod112";
	public static final String NAME = "Tasty Furniture";
	public static final String VERSION = "0.1";
	
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent preinit) {
		LOGGER.info("Hello, world!");
	}
}

//changing the MODID causes minecraft to not recognize this as a mod
//changing the name is fine
//changing the version is also fine