package multi;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



class Electrician2 implements Runnable{
	
	String house;
	
	public Electrician2(String house) {
//		super();
		this.house = house;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("ELE Started "+house);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Finished"+house);
	}
}

class Plumber2 implements Runnable{

	
	String house;
	
	public Plumber2(String house) {
//		super();
		this.house = house;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("PLUM Started "+house);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Finished"+house);
	}

}


public class FinalThreadPool {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n);
		

		ExecutorService electrician = Executors.newFixedThreadPool(3);
		ExecutorService plumber = Executors.newFixedThreadPool(4);
		
		for(int i=0;i<n;i++) {
			Runnable r = new Electrician2("Flat no "+ i);
			electrician.execute(r);
		}
		for(int i=0;i<n;i++) {
			Runnable r = new Plumber2("Flat no "+ i);
			plumber.execute(r);
		}

	}

}
