package odd1ty.buildingassistance.client;

import java.lang.reflect.Field;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import odd1ty.buildingassistance.BuildingAssistance;
import odd1ty.buildingassistance.BuildingAssistance.Items;

@Mod.EventBusSubscriber(value=Side.CLIENT, modid=BuildingAssistance.MODID)
public class ModelsEventHandler {
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) throws Exception {
		for (Field f : Items.class.getDeclaredFields()) {
			Item item = (Item)f.get(null);
			ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		}
	}
}
