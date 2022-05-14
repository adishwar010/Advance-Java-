package Basics;

import java.io.*;
import java.net.*;

public class GetIP {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter URL : ");
		String web = br.readLine();
		 InetAddress in = InetAddress.getByName(web);
		 System.out.println(in);
		 
		 InetAddress in2 = InetAddress.getLocalHost();
		 System.out.println(in2);
		 
		 InetAddress address1 = InetAddress.getByName("66.254.114.234");
		 InetAddress address2 = InetAddress.getByName("www.brazzers.com");
		 boolean flag = address1.equals(address2);
		 System.out.println(flag);
		 
		 InetAddress array[]=InetAddress.getAllByName(web);
//		 System.out.println(array);
		 for(int i=0;i<array.length;i++) {
			 System.out.println(array[i]);
		 }
	}
}
