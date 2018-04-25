package fluxed314.FluXedMod.tabs;

import fluxed314.FluXedMod.init.BlockInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FluXTab extends CreativeTabs
{
	public FluXTab(String label) { super("fluxtab"); 
	this.setBackgroundImageName("flux.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(BlockInit.obsidian_block_ingot);}
}
