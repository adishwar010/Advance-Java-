package ChatApp;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket s = new Socket("127.0.0.1",7777);
		System.out.println("Client Ready");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str,x;
		
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		
		while(true ) {
			System.out.print("Enter message for Server: ");
//			str = br.readLine();
			str=br.readLine();
			if(str.equals("exit")) {
				dout.writeUTF("Client terminated");
				break;
			}
			dout.writeUTF(str);
			
			x =(String)din.readUTF();
			System.out.println("Server: "+x);
			
			
		}

		s.close();
	}

}
