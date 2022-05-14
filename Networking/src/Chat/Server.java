package Chat;

import java.net.*;
import java.io.*;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(7777);
		System.out.println("Server Ready...");
		
		Socket s = ss.accept();
		System.out.println("Connection done...");
		System.out.println("\n\n");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		DataInputStream din = new DataInputStream(s.getInputStream());
		
		String msg,msg2;
		
		while(true) {
			msg = (String)din.readUTF();
			System.out.println("Client: "+msg);
			
			System.out.print("Message for client from Server: ");
			msg2 =br.readLine();
			if(msg2.equals("exit")) {
				System.out.println("Server Terminated");
				dout.writeUTF("Server Terminated the Chat");
				break;
			}
			dout.writeUTF(msg2);
			
		}
		ss.close();
		System.exit(0);

		
	}
	
	

}
