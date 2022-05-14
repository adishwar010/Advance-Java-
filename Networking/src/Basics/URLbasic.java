package Basics;

import java.net.URL;

public class URLbasic {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		URL x = new URL("https://www.javatpoint.com/InetAddress-class#:~:text=Java%20InetAddress%20class%20represents%20an,.facebook.com%2C%20etc.");
		System.out.println("Protocol : "+x.getProtocol());
		System.out.println("Port: "+ x.getPort());
		System.out.println(x.getPath());
		System.out.println(x.getHost());
		
	}

}
