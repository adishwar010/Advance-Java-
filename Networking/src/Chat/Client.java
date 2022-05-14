package Chat;

import java.net.*;
import java.io.*;

public class Client {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket s = new Socket("127.0.0.1",7777);
		System.out.println("Client Ready...");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		DataInputStream din = new DataInputStream(s.getInputStream());
		
		String msg,msg2;
		while(true) {
			System.out.print("Message from Client: ");
			msg = br.readLine();
			if(msg.equals("exit")) {
				dout.writeUTF("Client terminated");
				break;
			}
			dout.writeUTF(msg);
			
			msg2 = (String)din.readUTF();
			if(msg2.equals("exit")) {
				System.out.println("Server Terminated already");
				s.close();
				break;
			}

			System.out.println("Server: "+msg2);
			
		}
		s.close();

	}

}
