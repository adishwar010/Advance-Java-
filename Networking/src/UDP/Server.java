package UDP;

import java.io.IOException;
import java.net.*;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket ds = new DatagramSocket(37);
		
		byte[] buff= new byte[1000];
		DatagramPacket dp = new DatagramPacket(buff, 1000);
		
		ds.receive(dp);
		
		String msg = new String(buff);
		
		System.out.println("Client: "+ msg);
		
		ds.close();

	}

}
