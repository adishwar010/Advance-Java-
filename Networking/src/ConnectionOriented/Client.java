package ConnectionOriented;

import java.io.*;
import java.io.IOException;
import java.net.*;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket s = new Socket("127.0.0.1",7777);
		System.out.println("Client Ready....");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter message for server: ");
		String msg = br.readLine();
		
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		dout.writeUTF(msg);
		
		dout.close();
		br.close();
		

	}

}
