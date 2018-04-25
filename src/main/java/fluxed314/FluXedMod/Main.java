package fluxed314.FluXedMod;

import fluxed314.FluXedMod.proxy.CommonProxy;
import fluxed314.FluXedMod.tabs.FluXTab;
import fluxed314.FluXedMod.tabs.FluXTab2;
import fluxed314.FluXedMod.tabs.FluXTab3;
import fluxed314.FluXedMod.tabs.FluXTab4;
import fluxed314.FluXedMod.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{
	@Instance
	public static Main instance;
	
	// Creative Tabs
	public static final CreativeTabs fluxtab = new FluXTab("fluxtab"); // Blocks Tab
	public static final CreativeTabs fluxtab2 = new FluXTab2("fluxtab2"); // Items Tab
	public static final CreativeTabs fluxtab3 = new FluXTab3("fluxtab3"); // Tools Tab
	public static final CreativeTabs fluxtab4 = new FluXTab4("fluxtab4"); // Armor Tab
	
	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit(event);
	}
}
