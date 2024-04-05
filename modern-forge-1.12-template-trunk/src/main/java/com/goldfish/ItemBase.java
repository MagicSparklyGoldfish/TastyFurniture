package com.goldfish;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.FurnaceRecipes;
import com.goldfish.TastyFurniture;

public class ItemBase extends Item {

       protected String name;

       public ItemBase(String name) {
              this.name = name;
              // setUnlocalizedName(name);
              setRegistryName(name);
       //name
        //setRegistryName("Apple Ingot"); 
        //setUnlocalizedName(TastyFurniture.MODID + ".Apple Ingot"); 
        //FruitIngots appleIngot = new FruitIngots();
        //Item Apple_Ingot = new Item(FruitIngots.Item.appleIngot); 
       } 

       public void registerItemModel() {
              TastyFurniture.proxy.registerItemRenderer(this, 0, name);
       }

       @Override
       public ItemBase setCreativeTab(CreativeTabs tab) {
              super.setCreativeTab(tab);
              return this;
       }
    
}
