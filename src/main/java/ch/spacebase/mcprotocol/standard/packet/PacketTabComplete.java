package ch.spacebase.mcprotocol.standard.packet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import ch.spacebase.mcprotocol.net.Client;
import ch.spacebase.mcprotocol.net.ServerConnection;
import ch.spacebase.mcprotocol.packet.Packet;
import ch.spacebase.mcprotocol.util.IOUtils;

public class PacketTabComplete extends Packet {

	public String text;

	public PacketTabComplete() {
	}

	public PacketTabComplete(String text) {
		this.text = text;
	}

	@Override
	public void read(DataInputStream in) throws IOException {
		this.text = IOUtils.readString(in);
	}

	@Override
	public void write(DataOutputStream out) throws IOException {
		IOUtils.writeString(out, this.text);
	}

	@Override
	public void handleClient(Client conn) {
	}

	@Override
	public void handleServer(ServerConnection conn) {
	}

	@Override
	public int getId() {
		return 203;
	}

}
