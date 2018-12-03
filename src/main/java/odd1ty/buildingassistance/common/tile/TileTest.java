package odd1ty.buildingassistance.common.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileTest extends TileEntity {
	
	private int counter = 0;
	
	public int increment() {
		counter++;
		markDirty();
		return counter;
	}
	
	public TileTest() {
		
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		nbt.setInteger("counter", counter);
		return nbt;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		counter = nbt.getInteger("counter");
	}
}
