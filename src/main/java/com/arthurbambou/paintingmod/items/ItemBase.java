package com.arthurbambou.paintingmod.items;

import com.arthurbambou.paintingmod.Main;
import com.arthurbambou.paintingmod.init.ModItems;
import com.arthurbambou.paintingmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
	
	public ItemBase(String name, int damages, int stack)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		setMaxDamage(damages);
		setMaxStackSize(stack);
		setNoRepair();
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
