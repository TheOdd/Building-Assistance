package odd1ty.buildingassistance.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import odd1ty.buildingassistance.BuildingAssistance;

public class BlockStructureProjector extends Block {
	public BlockStructureProjector() {
		super(Material.ROCK);
		this.setUnlocalizedName(BuildingAssistance.MODID + "." + "structure_projector");
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
}
