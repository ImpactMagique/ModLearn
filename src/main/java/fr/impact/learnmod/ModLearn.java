package fr.impact.learnmod;


import java.awt.Color;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.impact.learnmod.common.CommonProxy;
import fr.impact.learnmod.common.ItemLearn;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = "modlearn", name = "Mod Learn", version = "1.0.0")


public class ModLearn 
{
	public static final String MODID = "modlearn";
	@Instance("modlearn")
	public static ModLearn instance;
	
	@SidedProxy(clientSide = "fr.impact.learnmod.client.ClientProxy", serverSide = "fr.impact.learnmod.common.CommonProxy")
	public static CommonProxy proxy;
	
	// Blocs
		public static Block blockLearn;
		
	//
		
	// Items
		public static Item itemLearn;
		public static Item speedStick;
		public static Item healStick;
		
	//
		
	// Armures
		public static Item learnHelmet, learnChestPlate, learnLeggings, learnBoots;
		public static ArmorMaterial learnArmor = EnumHelper.addArmorMaterial("learnArmor", 45, new int[] {3, 8, 6, 3}, 25);
	
	//	
	
	// Tools
		public static Item learnPickaxe, learnAxe, learnShovel, learnHoe, learnSword;
		public static ToolMaterial learnTool = EnumHelper.addToolMaterial("learnTool", 3, 2000, 8.0f, 8.0f, 32);
	//	

	

@EventHandler
public void preInit(FMLPreInitializationEvent event) 
{
	// Blocks
		blockLearn = new BlockLearn(Material.rock).setBlockName("learnBlock").setBlockTextureName(MODID + ":learn_block");
		GameRegistry.registerBlock(blockLearn, "learn_block");
	//
	
	// Items
		itemLearn = new ItemLearn().setUnlocalizedName("learnItem").setTextureName(MODID + ":learn_item");
		GameRegistry.registerItem(itemLearn, "learn_item");
		speedStick = new SpeedStick().setUnlocalizedName("speedStick").setTextureName(MODID + ":speed_stick");
		GameRegistry.registerItem(speedStick, "speed_stick");
		healStick = new HealStick().setUnlocalizedName("healStick").setTextureName(MODID + ":heal_stick");
		GameRegistry.registerItem(healStick, "heal_stick");
	//
		
	// Armures
		learnHelmet = new ItemLearnArmor(learnArmor, 0).setUnlocalizedName("learnHelmet").setTextureName(MODID + ":learn_helmet");
		learnChestPlate = new ItemLearnArmor(learnArmor, 1).setUnlocalizedName("learnChestPlate").setTextureName(MODID + ":learn_chestPlate");
		learnLeggings = new ItemLearnArmor(learnArmor, 2).setUnlocalizedName("learnLeggings").setTextureName(MODID + ":learn_leggings");
		learnBoots = new ItemLearnArmor(learnArmor, 3).setUnlocalizedName("learnBoots").setTextureName(MODID + ":learn_boots");
		GameRegistry.registerItem(learnHelmet, "learn_helmet");
		GameRegistry.registerItem(learnChestPlate, "learn_chestPlate");
		GameRegistry.registerItem(learnLeggings, "learn_leggings");
		GameRegistry.registerItem(learnBoots, "learn_boots");
	//	
		
	// Tools
		learnPickaxe = new ItemLearnPickaxe(learnTool).setUnlocalizedName("learnPickaxe").setTextureName(MODID + ":learn_pickaxe");
		learnAxe = new ItemLearnAxe(learnTool).setUnlocalizedName("learnAxe").setTextureName(MODID + ":learn_axe");
		learnShovel = new ItemLearnShovel(learnTool).setUnlocalizedName("learnShovel").setTextureName(MODID + ":learn_shovel");
		learnHoe = new ItemLearnHoe(learnTool).setUnlocalizedName("learnHoe").setTextureName(MODID + ":learn_hoe");
		learnSword = new ItemLearnSword(learnTool).setUnlocalizedName("learnSword").setTextureName(MODID + ":learn_sword");

		GameRegistry.registerItem(learnPickaxe, "learn_pickaxe");
		GameRegistry.registerItem(learnAxe, "learn_axe");
		GameRegistry.registerItem(learnShovel, "learn_shovel");
		GameRegistry.registerItem(learnHoe, "learn_hoe");
		GameRegistry.registerItem(learnSword, "learn_sword");
	//	
		
		
}

@EventHandler
public void init(FMLInitializationEvent event) 
{
	 EntityRegistry.registerGlobalEntityID(EntityLearn.class, "mobLearn", EntityRegistry.findGlobalUniqueEntityId(), new Color(0, 255, 0).getRGB(), new Color(255, 0, 0).getRGB());
     EntityRegistry.registerModEntity(EntityLearn.class, "mobLearn", 420, this, 40, 1, true);

}

@EventHandler
public void postInit(FMLPostInitializationEvent event) 
{
	
}


}

