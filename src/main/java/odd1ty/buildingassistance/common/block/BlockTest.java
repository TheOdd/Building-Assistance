package odd1ty.buildingassistance.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import odd1ty.buildingassistance.BuildingAssistance;
import odd1ty.buildingassistance.common.tile.TileTest;

public class BlockTest extends Block implements ITileEntityProvider {
	public BlockTest() {
		super(Material.ROCK);
		this.setUnlocalizedName(BuildingAssistance.MODID + "." + "test");
		this.setHardness(0.5f);
		this.setLightLevel(8 / 16f);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
	@Override
	public boolean hasTileEntity(IBlockState state) {
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return new TileTest();
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileTest();
	}
	
	private TileTest getTE(World world, BlockPos pos) {
		return (TileTest) world.getTileEntity(pos);
	}
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, 
			EnumFacing side, float hitX, float hitY, float hitZ) {
		if (!world.isRemote) {
			int counter = getTE(world, pos).increment();
			TextComponentTranslation component = new TextComponentTranslation("message.buildingassistance.counter", counter);
			component.getStyle().setColor(TextFormatting.GREEN);
			player.sendStatusMessage(component, false);
		}
		
		return true;
	}
}
