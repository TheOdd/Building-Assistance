package odd1ty.buildingassistance.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import odd1ty.buildingassistance.BuildingAssistance;

public class ItemTest extends Item {
	public ItemTest() {
		this.setCreativeTab(CreativeTabs.TOOLS);
		this.setUnlocalizedName(BuildingAssistance.MODID + "." + "test");
		this.setMaxStackSize(16);
	}
}
