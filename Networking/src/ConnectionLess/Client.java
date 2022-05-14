package ConnectionLess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
//import java.net.SocketException;

public class Client {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket ds = new DatagramSocket();
		System.out.println("Client Ready...");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Client : ");
		String msg = br.readLine();
		
		InetAddress Ip  = InetAddress.getByName("127.0.0.1");
		DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.length(), Ip , 37);
		
		ds.send(dp);
		ds.close();
	}

}
