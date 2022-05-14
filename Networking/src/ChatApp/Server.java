package ChatApp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(7777);
		System.out.println("Server ready...");
		
		Socket s = ss.accept();
		System.out.println("Connection done...");
		
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str,x;
		while(true) {
//		while((str=(String)din.readUTF())!=null) {
			
//			String msg = (String)din.readUTF();
			
//			System.out.println("CLient: "+str);
			str=(String)din.readUTF();
			System.out.println("CLient: "+str);
			
			System.out.print("Enter message for client :");
			x = br.readLine();
			
			
			if(x.equals("exit")) {
				dout.writeUTF("Server Terminated");
				break;
			}
			dout.writeUTF(x);
			
//		}
		
		}
		
		ss.close();
//		System.exit(0);
		
		
	}

}
