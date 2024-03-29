package com.goldfish;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.FurnaceRecipes;
import com.goldfish.TastyFurniture;

public class FruitIngots extends Item {
       protected String name;
       public FruitIngots() {
       //name
        setRegistryName("Apple Ingot"); 
        //setUnlocalizedName(TastyFurniture.MODID + ".Apple Ingot"); 
        FruitIngots appleIngot = new FruitIngots();
        //Item Apple_Ingot = new Item(FruitIngots.Item.appleIngot); 
       } 
    
}
