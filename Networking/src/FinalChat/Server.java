package FinalChat;

import java.io.*;
import java.net.*;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(7777);
		System.out.println("System Ready");
		
		Socket s = ss.accept();
		System.out.println("connection ready....");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		DataInputStream din = new DataInputStream(s.getInputStream());
		
		String msg1,msg2;
		while(true) {
			
			msg1=(String)din.readUTF();
			System.out.println("Client: "+msg1);
			
			System.out.println("Server: ");
			msg2=br.readLine();
			
			if(msg2.equals("exit")) {
				dout.writeUTF("Server terminated");
				break;
			}
			dout.writeUTF(msg2);
		}
		ss.close();

	}

}
