package fluxed314.FluXedMod.init.blocks.machines;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CustomMachine extends Block
{
	public CustomMachine(String name, Material iron, float hardness, float resistance)
	{
		super(iron);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
	}

	//public CustomMachine(String name, Material iron) {
		// TODO Auto-generated constructor stub
	//}

	
}
