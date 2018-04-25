package fluxed314.FluXedMod.tabs;

import fluxed314.FluXedMod.init.ToolInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FluXTab3 extends CreativeTabs
{
	public FluXTab3(String label) { super("fluxtab3"); 
	this.setBackgroundImageName("flux.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(ToolInit.ruby_pickaxe);}
}
