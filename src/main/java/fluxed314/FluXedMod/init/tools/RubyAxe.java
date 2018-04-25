package fluxed314.FluXedMod.init.tools;

public class RubyAxe extends CustomAxe
{
	
	//public RubyAxe(String name, ToolMaterial material) 
	public RubyAxe(String name, ToolMaterial material, float damage, float speed)
	{
		//super(name, material);
		super(name, material, damage, speed);
		this.attackSpeed = speed;
		this.attackDamage = damage;
		//this.attackSpeed = -3.0F;
		//this.attackDamage = 9.0F;
	}
	
}