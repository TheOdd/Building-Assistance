package me.owenhines.buildingassistance.common.item;

import me.owenhines.buildingassistance.BuildingAssistance;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemTest extends Item {
	public ItemTest() {
		this.setCreativeTab(CreativeTabs.TOOLS);
		this.setUnlocalizedName(BuildingAssistance.MODID + "." + "test");
		this.setMaxStackSize(16);
	}
}
