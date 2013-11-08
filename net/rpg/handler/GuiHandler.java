package net.rpg.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.rpg.Util;
import net.rpg.gui.GuiChooseRace;
import net.rpg.gui.GuiStats;
import net.rpg.helper.GuiHelper;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		
		return null;
		
	}
	
	//TODO Doesn't print? 
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		
		switch(ID)
		{
		
		case(0):
		{
			
			return new GuiStats(player);
			
		}
		
		case(1):
		{
			
			return new GuiChooseRace();
			
		}
		
		}
		
		return null;
		
	}
	
}