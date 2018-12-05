package odd1ty.buildingassistance.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import odd1ty.buildingassistance.BuildingAssistance;
import odd1ty.buildingassistance.common.tileentity.TileEntityStructureProjector;

public class BlockStructureProjector extends Block {
	public BlockStructureProjector() {
		super(Material.ROCK);
		this.setUnlocalizedName(BuildingAssistance.MODID + "." + "structure_projector");
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
	@Override
	public boolean hasTileEntity(IBlockState state) {
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return new TileEntityStructureProjector();
	}
	
	private TileEntityStructureProjector getTE(World world, BlockPos pos) {
		return (TileEntityStructureProjector) world.getTileEntity(pos);
	}
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand,
			EnumFacing side, float hitX, float hitY, float hitZ) {
		// Logical server check
		if (!world.isRemote) {
			
		}
		
		return true;
	}
}
