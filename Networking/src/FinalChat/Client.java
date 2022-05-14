package FinalChat;

import java.io.*;
import java.net.*;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket s = new Socket("127.0.0.1",7777);
		System.out.println("Client Ready...");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		DataInputStream din = new DataInputStream(s.getInputStream());
		
		String msg1,msg2;
		while(true) {
			System.out.println("Client: ");
			msg1=br.readLine();
			
			if(msg1.equals("exit")) {
				dout.writeUTF("Client terminated");
				break;
			}
			dout.writeUTF(msg1);
			
			msg2=(String)din.readUTF();
			System.out.println("Server: "+msg2);
		}
		s.close();
	}
	

}
