package com.goldfish;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.goldfish.TastyFurniture;

public class ItemBase extends Item {

       protected String name;

       public ItemBase(String name) {
              this.name = name;
              setUnlocalizedName(TastyFurniture.MODID + name);
              setRegistryName(name);
              
       //name
        //setRegistryName("Apple Ingot"); 
        //setUnlocalizedName(TastyFurniture.MODID + ".Apple Ingot"); 
        //FruitIngots appleIngot = new FruitIngots();
        //Item Apple_Ingot = new Item(FruitIngots.Item.appleIngot); 
       } 

       public ItemBase setUnlocalizedName(String name) {
              this.name = TastyFurniture.MODID + name;
              return this;
       }

       public void registerItemModel() {
            //  TastyFurniture.proxy.registerItemRenderer(this, 0, name);
       }

       @Override
       public ItemBase setCreativeTab(CreativeTabs tab) {
              super.setCreativeTab(tab);
              return this;
       }

    
}
