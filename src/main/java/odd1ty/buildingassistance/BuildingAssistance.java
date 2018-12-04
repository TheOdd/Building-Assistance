package odd1ty.buildingassistance;

import org.apache.logging.log4j.Logger;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import odd1ty.buildingassistance.common.item.ItemTest;

@Mod(modid = BuildingAssistance.MODID, name = BuildingAssistance.NAME, version = BuildingAssistance.VERSION)
@Mod.EventBusSubscriber
public class BuildingAssistance {
    public static final String MODID = "buildingassistance";
    public static final String NAME = "Building Assistance";
    public static final String VERSION = "1.12.2-0.0.1.0"; // MCVERSION-MAJORMOD.MAJORAPI.MINOR.PATCH

    private static Logger logger;
    
    @ObjectHolder(MODID)
    public static class Items {
    	public static final Item test = null;
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("Building Assistance Loaded.");
    }
    
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
    	event.getRegistry().registerAll(
    		new ItemTest().setRegistryName(MODID, "test")
    	);
    }
}
