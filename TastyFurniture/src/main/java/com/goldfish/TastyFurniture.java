package com.goldfish;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

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
	
	public void onEnable() {

	}

	public void onDisable() {
		
	}
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent preinit) {
		LOGGER.info("Hello, world!");
	}

	@Mod.EventBusSubscriber
	public static class RegistrationHandler {

    @SubscribeEvent
	 public static void registerItems(RegistryEvent.Register<Item> event) {
     ModItems.register(event.getRegistry());
			
		}

	@SubscribeEvent
	public static void registerItems(ModelRegistryEvent event) {
	ModItems.registerModels();
	}
	
	}

	//@SidedProxy(serverSide = "com.goldfish.TastyFurniture.proxy.CommonProxy", clientSide = "com.goldfish.TastyFurniture.proxy.ClientProxy")
   // public static CommonProxy proxy;

	
}


