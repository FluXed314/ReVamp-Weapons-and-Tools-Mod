package fluxed314.FluXedMod.tabs;

import fluxed314.FluXedMod.init.ArmorInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FluXTab4 extends CreativeTabs
{
	public FluXTab4(String label) { super("fluxtab4"); 
	this.setBackgroundImageName("flux.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(ArmorInit.ruby_chestplate);}
}
