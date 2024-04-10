package com.goldfish;

import net.minecraftforge.registries.IForgeRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModItems {
// Tab
   static final CreativeTabs tabTastyFurniture = (new CreativeTabs("tabTastyFurniture") {
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ingotApple);
	}
   });

// Ingots
   public static ItemBase ingotApple = new ItemBase("ingot_apple").setCreativeTab(CreativeTabs.tabTastyFurniture);

   public static void register(IForgeRegistry<Item> registry) {
	registry.registerAll(
			ingotApple
	);
}

    public static void registerModels() {
	 ingotApple.registerItemModel();
}
    
}
