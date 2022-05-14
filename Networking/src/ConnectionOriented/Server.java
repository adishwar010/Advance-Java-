package ConnectionOriented;

import java.io.*;
import java.io.IOException;
import java.net.*;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(7777);
		System.out.println("Server Ready ......");
		
		Socket s = ss.accept();
		System.out.println("Connection Ready");
		
		DataInputStream din = new DataInputStream(s.getInputStream());
		String msg = (String)din.readUTF();
		System.out.println("Client:" + msg);
		
		din.close();
		

	}

}
