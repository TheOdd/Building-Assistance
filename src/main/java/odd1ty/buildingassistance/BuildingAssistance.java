package odd1ty.buildingassistance;

import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import odd1ty.buildingassistance.common.block.BlockGuide;
import odd1ty.buildingassistance.common.block.BlockStructureProjector;
import odd1ty.buildingassistance.common.gui.GuiProxy;
import odd1ty.buildingassistance.common.tileentity.TileEntityStructureProjector;

@Mod(modid = BuildingAssistance.MODID, name = BuildingAssistance.NAME, version = BuildingAssistance.VERSION)
@Mod.EventBusSubscriber
public class BuildingAssistance {
    public static final String MODID = "buildingassistance";
    public static final String NAME = "Building Assistance";
    public static final String VERSION = "1.12.2-0.0.4.1"; // MCVERSION-MAJORMOD.MAJORAPI.MINOR.PATCH
    
    @Mod.Instance
    public static BuildingAssistance instance;

    private static Logger logger;
    
    private static Block withName(Block block, String name) {
    	return block
    			.setRegistryName(MODID, name)
    			.setUnlocalizedName(MODID + "." + name);
    }
    
    @ObjectHolder(MODID)
    public static class Blocks {
    	public static final Block structure_projector = null;
    	public static final Block guide = null;
    }
    
    @ObjectHolder(MODID)
    public static class Items {
    	public static final Item structure_projector = null;
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    	NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiProxy());
        logger.info("Building Assistance Loaded.");
    }
    
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
    	event.getRegistry().registerAll(
    		withName(new BlockStructureProjector(), "structure_projector"),
    		withName(new BlockGuide(), "guide")
    	);
    	
    	GameRegistry.registerTileEntity(TileEntityStructureProjector.class, new ResourceLocation(MODID, "structure_projector"));
    }
    
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
    	Block[] blocks = {
    		Blocks.structure_projector
    	};
    	
    	for (Block block : blocks)
    		event.getRegistry().register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }
}
