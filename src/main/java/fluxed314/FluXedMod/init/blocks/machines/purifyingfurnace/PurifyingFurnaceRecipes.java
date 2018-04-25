package fluxed314.FluXedMod.init.blocks.machines.purifyingfurnace;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;

import fluxed314.FluXedMod.init.BlockInit;
import fluxed314.FluXedMod.init.ItemInit;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class PurifyingFurnaceRecipes 
{	
	private static final PurifyingFurnaceRecipes INSTANCE = new PurifyingFurnaceRecipes();
	private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static PurifyingFurnaceRecipes getInstance()
	{
		return INSTANCE;
	}
	
	private PurifyingFurnaceRecipes() 
	{
		//addPurifyingRecipe(new ItemStack(BlockInit.copper_block), new ItemStack(BlockInit.copper_ore), new ItemStack(Blocks.ACACIA_FENCE), 5.0F);
		addPurifyingRecipe(new ItemStack(Blocks.IRON_ORE), new ItemStack(Blocks.IRON_ORE), new ItemStack(Blocks.IRON_ORE), new ItemStack(ItemInit.iron_ingot_pure), 5.0F);
	}

	
	public void addPurifyingRecipe(ItemStack input1, ItemStack input2, ItemStack input3, ItemStack result, float experience) 
	{
		if(getPurifyingResult(input1, input2, input3) != ItemStack.EMPTY) return;
		this.smeltingList.put(input1, input2, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getPurifyingResult(ItemStack input1, ItemStack input2, ItemStack input3) 
	{
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet()) 
		{
			if(this.compareItemStacks(input1, (ItemStack)entry.getKey())) 
			{
				for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) 
				{
					if(this.compareItemStacks(input2, (ItemStack)ent.getKey())) 
					{
						//for(Entry<ItemStack, ItemStack> ent2 : entry.getValue().entrySet()) 
						//{
							//if(this.compareItemStacks(input3, (ItemStack)ent.getKey())) 
							//{
								return (ItemStack)ent.getValue();
							//}
						//}
					}
				}
			}
		}
		return ItemStack.EMPTY;
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
	{
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList() 
	{
		return this.smeltingList;
	}
	
	public float getPurifyingExperience(ItemStack stack)
	{
		for (Entry<ItemStack, Float> entry : this.experienceList.entrySet()) 
		{
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey())) 
			{
				return ((Float)entry.getValue()).floatValue();
			}
		}
		return 0.0F;
	}
}










/*
import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod.Instance;

public class SmeltingFurnaceRecipes
{
	
	private static final SmeltingFurnaceRecipes INSTANCE = new SmeltingFurnaceRecipes();
	private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static SmeltingFurnaceRecipes getInstance()
	{
		return INSTANCE;
	}
	
	private SmeltingFurnaceRecipes()
	{
		
	}
	
	public void addSmeltingRecipes(ItemStack input1, ItemStack input2, ItemStack input3, ItemStack result, float experience)
	{
		if(getSmeltingResult(input1, input2, input3) != ItemStack.EMPTY)return;
		this.smeltingList.put(input1,  input2,  input3, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getSmeltingResult(ItemStack input1, ItemStack input2, ItemStack input3)
	{
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet())
		{
			if(this.compareItemStacks(input1, (ItemStack)entry.getKey()))
			{
				for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet())
				{
					if(this.compareItemStacks(input2, (ItemStack)ent.getKey()))
					{
						return(ItemStack)ent.getValue();
					}
				}
			}
		}
		return ItemStack.EMPTY;
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2, ItemStack stack3)
	{
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList()
	{
		return this.smeltingList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
*/





























