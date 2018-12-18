package odd1ty.buildingassistance.common.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import odd1ty.buildingassistance.common.container.ContainerStructureProjector;
import odd1ty.buildingassistance.common.tileentity.TileEntityStructureProjector;

public class GuiProxy implements IGuiHandler {
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		BlockPos pos = new BlockPos(x, y, z);
		TileEntity te = world.getTileEntity(pos);
		if (te instanceof TileEntityStructureProjector)
			return new ContainerStructureProjector(player.inventory, (TileEntityStructureProjector) te);
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		BlockPos pos = new BlockPos(x, y, z);
		TileEntity te = world.getTileEntity(pos);
		if (te instanceof TileEntityStructureProjector) {
			TileEntityStructureProjector containerTileEntity = (TileEntityStructureProjector) te;
			return new GuiStructureProjector(containerTileEntity, new ContainerStructureProjector(player.inventory, containerTileEntity));
		}
		return null;
	}
	
}
