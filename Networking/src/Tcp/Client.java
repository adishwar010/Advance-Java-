package Tcp;

import java.io.*;
import java.io.IOException;
import java.net.*;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket s = new Socket("127.0.0.1",7777);
		System.out.println("Client Ready...");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter message for Server : ");
		String msg = br.readLine();
		System.out.println();
		
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		dout.writeUTF(msg);
		
		br.close();
		dout.close();

	}

}
