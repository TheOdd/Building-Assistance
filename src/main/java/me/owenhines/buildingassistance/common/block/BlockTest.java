package me.owenhines.buildingassistance.common.block;

import me.owenhines.buildingassistance.BuildingAssistance;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTest extends Block {
	public BlockTest() {
		super(Material.ROCK);
		this.setUnlocalizedName(BuildingAssistance.MODID + "." + "test");
		this.setHardness(0.5f); // Same hardness as dirt
		this.setLightLevel(8 / 16f); // 8 Light levels
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS); // Found in Building Blocks tab in the creative menu
	}
}
