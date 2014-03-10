package net.preea.apericraft.LoadHandler;

import net.minecraft.network.INetworkManager;
import net.minecraft.network.NetLoginHandler;
import net.minecraft.network.packet.NetHandler;
import net.minecraft.network.packet.Packet1Login;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumChatFormatting;
import cpw.mods.fml.common.network.IConnectionHandler;
import cpw.mods.fml.common.network.Player;

public class ConectionHandler implements IConnectionHandler {

	public void playerLoggedIn(Player player, NetHandler netHandler, INetworkManager manager) {
			
	}

	public String connectionReceived(NetLoginHandler netHandler, INetworkManager manager) {
		
		return null;
	}

	public void connectionOpened(NetHandler netClientHandler, String server, int port, INetworkManager manager) {

	}

	public void connectionOpened(NetHandler netClientHandler, MinecraftServer server, INetworkManager manager) {

	}

	public void connectionClosed(INetworkManager manager) {

	}

	public void clientLoggedIn(NetHandler clientHandler, INetworkManager manager, Packet1Login login) {
		clientHandler.getPlayer().addChatMessage(EnumChatFormatting.AQUA.toString() + EnumChatFormatting.BOLD + 	"Apericraft");
		clientHandler.getPlayer().addChatMessage(EnumChatFormatting.AQUA + 										"-----------------------------------------");
		clientHandler.getPlayer().addChatMessage(EnumChatFormatting.AQUA.toString() + EnumChatFormatting.ITALIC + 	clientHandler.getPlayer().getEntityName() + ", Thanks you for using Apericraft ");
		clientHandler.getPlayer().addChatMessage(EnumChatFormatting.AQUA.toString() + EnumChatFormatting.ITALIC + 	"All code is open source");
		clientHandler.getPlayer().addChatMessage(EnumChatFormatting.AQUA.toString() + EnumChatFormatting.ITALIC + 	"I hope you enjoy playing");
	
	}

}
