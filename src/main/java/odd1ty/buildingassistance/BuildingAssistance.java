package odd1ty.buildingassistance;

import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import odd1ty.buildingassistance.common.block.BlockTest;

@Mod(modid = BuildingAssistance.MODID, name = BuildingAssistance.NAME, version = BuildingAssistance.VERSION)
@Mod.EventBusSubscriber
public class BuildingAssistance {
    public static final String MODID = "buildingassistance";
    public static final String NAME = "Building Assistance";
    public static final String VERSION = "1.12.2-0.0.1.0"; // MCVERSION-MAJORMOD.MAJORAPI.MINOR.PATCH

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("Building Assistance Loaded.");
    }
    
    @ObjectHolder(MODID)
    public static class Blocks {
    	public static final Block test = null;
    }
    
    @ObjectHolder(MODID)
    public static class Items {
    	public static final Item test = null;
    }
    
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
    	event.getRegistry().registerAll(
    		new BlockTest().setRegistryName(MODID, "test")
    	);
    }
    
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
    	Block[] blocks = {
    		Blocks.test
    	};
    	
    	for (Block block : blocks)
    		event.getRegistry().register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }
}
