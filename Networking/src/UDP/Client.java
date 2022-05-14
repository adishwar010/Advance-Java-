package UDP;

import java.net.*;
import java.io.*;

public class Client {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		DatagramSocket ds = new DatagramSocket();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String msg = br.readLine();
		
		InetAddress Ip = InetAddress.getByName("127.0.0.1");
		
		DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.length(),Ip , 37);
		ds.send(dp);
		ds.close();
		

	}

}
