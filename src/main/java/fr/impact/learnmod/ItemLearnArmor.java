package fr.impact.learnmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemLearnArmor extends ItemArmor{

	public ItemLearnArmor(ArmorMaterial armorMaterial, int slot) {
		super(armorMaterial, 0, slot);
		this.setCreativeTab(CreativeTabs.tabCombat);
	
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) 
	{
		if(slot == 2) 
		{
			return ModLearn.MODID + ":textures/models/armor/learn_layer_2.png";
		}
		
		return ModLearn.MODID + ":textures/models/armor/learn_layer_1.png"; 
		
	}
	
	@Override
	public boolean getIsRepairable(ItemStack input, ItemStack repair) {
		if(repair.getItem() == ModLearn.itemLearn) 
		{
			return true;
		}
		
		return false;
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) 
	{
		if(this.armorType == 0 ) {
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 20, 1));
		}
	

	}

}
