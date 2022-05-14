package ConnectionLess;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
//import java.net.SocketException;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket ds = new DatagramSocket(37);
		System.out.println("Server Ready");
		
		byte[] barr = new byte[1000];
		
		DatagramPacket dp = new DatagramPacket(barr, 1000);
		
		ds.receive(dp);
		String msg = new String(barr);
		
		System.out.println("client: "+msg);
		ds.close();
	}

}
