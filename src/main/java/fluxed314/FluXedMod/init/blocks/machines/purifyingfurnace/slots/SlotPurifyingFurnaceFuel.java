package fluxed314.FluXedMod.init.blocks.machines.purifyingfurnace.slots;

import fluxed314.FluXedMod.init.blocks.machines.purifyingfurnace.TileEntityPurifyingFurnace;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotPurifyingFurnaceFuel extends Slot
{
	public SlotPurifyingFurnaceFuel(IInventory inventory, int index, int x, int y) 
	{
		super(inventory, index, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack)
	{
		return TileEntityPurifyingFurnace.isItemFuel(stack);
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack) 
	{
		return super.getItemStackLimit(stack);
	}
}