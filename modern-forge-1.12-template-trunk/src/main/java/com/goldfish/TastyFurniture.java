package com.goldfish;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
	modid = TastyFurniture.MODID,
	name = TastyFurniture.NAME,
	version = TastyFurniture.VERSION
)
public class TastyFurniture {
	public static final String MODID = "goldfishfurnituremod01";
	public static final String NAME = "Tasty Furniture";
	public static final String VERSION = "0.1";
	
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent preinit) {
		LOGGER.info("Hello, world!");
	}
}
