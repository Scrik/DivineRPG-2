package net.rpg.handler;

import ibxm.Player;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

import net.rpg.Util;

public class PacketHandler implements IPacketHandler {
	@Override
	public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player) {
		if(packet.channel == "RPG") {
			Util.fine("Received packet");
			handlePacket(packet);
		}
	}

	public void handlePacket(Packet250CustomPayload packet) {
		DataInputStream input = new DataInputStream(new ByteArrayInputStream(packet.data));
		int number;
		try {
			number = input.readInt();
			if(number == 1) {
				Util.finest("Race: Nord");
			}
		} catch(Exception e) {
			Util.severe("Couldn't read the packet!");
			return;
		}
	}
}