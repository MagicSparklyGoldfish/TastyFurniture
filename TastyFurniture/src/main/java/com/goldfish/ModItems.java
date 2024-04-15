package com.goldfish;

import net.minecraftforge.registries.IForgeRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
 public static final CreativeTabs tabTastyFurniture = new CreativeTabs("tabTastyFurniture") {
 	//@Override
 	public ItemStack getTabIconItem() {
 		return new ItemStack(ingotApple); 
 	}

 	@Override
 	public ItemStack createIcon() {
		return getTabIconItem(); 
 	}
 };

// Ingots
   public static ItemBase ingotApple = new ItemBase("Apple Ingot").setCreativeTab(tabTastyFurniture);

   public static void register(IForgeRegistry<Item> registry) {
	registry.registerAll(
			ingotApple
	);
}

    public static void registerModels() {
	 ingotApple.registerItemModel();
}
    
}
