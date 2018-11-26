package me.owenhines.buildingassistance;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = BuildingAssistance.MODID, name = BuildingAssistance.NAME, version = BuildingAssistance.VERSION)
public class BuildingAssistance
{
    public static final String MODID = "buildingassistance";
    public static final String NAME = "Building Assistance";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("Building Assistance Loaded.");
    }
}
