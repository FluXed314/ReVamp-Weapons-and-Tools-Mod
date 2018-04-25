package fluxed314.FluXedMod.tabs;

import fluxed314.FluXedMod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FluXTab2 extends CreativeTabs
{
	public FluXTab2(String label) { super("fluxtab2"); 
	this.setBackgroundImageName("flux.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(ItemInit.obsidian_ingot);}
}
