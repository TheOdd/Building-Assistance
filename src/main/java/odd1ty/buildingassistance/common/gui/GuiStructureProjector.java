package odd1ty.buildingassistance.common.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.ResourceLocation;
import odd1ty.buildingassistance.BuildingAssistance;
import odd1ty.buildingassistance.common.container.ContainerStructureProjector;
import odd1ty.buildingassistance.common.tileentity.TileEntityStructureProjector;

public class GuiStructureProjector extends GuiContainer {
	public static final int WIDTH = 180;
	public static final int HEIGHT = 152;
	
	private static final ResourceLocation background = new ResourceLocation(BuildingAssistance.MODID, "textures/gui/structureprojector.png");
	
	public GuiStructureProjector(TileEntityStructureProjector tileEntity, ContainerStructureProjector container) {
		super(container);
		
		xSize = WIDTH;
		ySize = HEIGHT;
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		mc.getTextureManager().bindTexture(background);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}
}
