package net.preea.apericraft.LoadHandler;

import net.preea.apericraft.Apericraft;
import net.preea.apericraft.items.AluminiumAxe;
import net.preea.apericraft.items.AluminiumHoe;
import net.preea.apericraft.items.AluminiumIngot;
import net.preea.apericraft.items.AluminiumPickaxe;
import net.preea.apericraft.items.AluminiumShovel;
import net.preea.apericraft.items.AluminiumSword;
import net.preea.apericraft.items.BerylliumIngot;
import net.preea.apericraft.items.CeriumIngot;
import net.preea.apericraft.items.CobaltIngot;
import net.preea.apericraft.items.CopperIngot;
import net.preea.apericraft.items.LeadIngot;
import net.preea.apericraft.items.NickleIngot;
import net.preea.apericraft.items.PlatinumIngot;
import net.preea.apericraft.items.SeleniumIngot;
import net.preea.apericraft.items.SilverIngot;
import net.preea.apericraft.items.TelluriumIngot;
import net.preea.apericraft.items.TinIngot;
import net.preea.apericraft.items.TitaniumIngot;
import net.preea.apericraft.items.TungstenIngot;
import net.preea.apericraft.items.ZirconiumIngot;

public class Items {
	public static void LoadIngots(){
	Apericraft.AluminiumIngot = new AluminiumIngot	(5000)	
	.setUnlocalizedName("AluminiumIngot");
	Apericraft.CopperIngot = new CopperIngot		(5001)	
	.setUnlocalizedName("CopperIngot");
	Apericraft.LeadIngot = new LeadIngot			(5002)	
	.setUnlocalizedName("LeadIngot"); 
	Apericraft.NickleIngot = new NickleIngot		(5003)	
	.setUnlocalizedName("NickleIngot"); 
	Apericraft.TinIngot = new TinIngot				(5004)	
	.setUnlocalizedName("TinIngot"); 
	Apericraft.TitaniumIngot = new TitaniumIngot	(5005)	
	.setUnlocalizedName("TitaniumIngot"); 
	Apericraft.SilverIngot = new SilverIngot		(5006)	
	.setUnlocalizedName("SilverIngot"); 
	Apericraft.PlatinumIngot = new PlatinumIngot	(5007)	
	.setUnlocalizedName("PlatinumIngot"); 		
	Apericraft.CobaltIngot = new CobaltIngot		(5008)	
	.setUnlocalizedName("CobaltIngot"); 
	Apericraft.TungstenIngot = new TungstenIngot	(5009)	
	.setUnlocalizedName("TungstenIngot"); 
	Apericraft.BerylliumIngot = new BerylliumIngot	(5010)	
	.setUnlocalizedName("BerylliumIngot"); 
	Apericraft.CeriumIngot = new CeriumIngot		(5011)	
	.setUnlocalizedName("CeriumIngot"); 		
	Apericraft.SeleniumIngot = new SeleniumIngot	(5012)	
	.setUnlocalizedName("SeleniumIngot"); 
	Apericraft.TelluriumIngot = new TelluriumIngot	(5013)	
	.setUnlocalizedName("TelluriumIngot"); 
	Apericraft.ZirconiumIngot = new ZirconiumIngot	(5014)	
	.setUnlocalizedName("ZirconiumIngot"); 
	
	}
	public static void LoadSwords(){
		Apericraft.AluminiumSword = new AluminiumSword	(5015, Apericraft.toolAluminium).setUnlocalizedName("AluminiumSword");

	}
	public static void LoadPickaxes(){
		Apericraft.AluminiumPickaxe = new AluminiumPickaxe	(5016, Apericraft.toolAluminium).setUnlocalizedName("AluminiumPickaxe");

	}
	public static void LoadAxes(){
		Apericraft.AluminiumAxe = new AluminiumAxe	(5017, Apericraft.toolAluminium).setUnlocalizedName("AluminiumAxe");
	
	}
	public static void LoadShovels(){
		Apericraft.AluminiumShovel = new AluminiumShovel(5018, Apericraft.toolAluminium).setUnlocalizedName("AluminiumShovel");

	}
	public static void LoadHoes(){
		Apericraft.AluminiumHoe = new AluminiumHoe	(5019, Apericraft.toolAluminium).setUnlocalizedName("AluminiumHoe");

	}
	public static void LoadBuckets(){
		
	}

}
