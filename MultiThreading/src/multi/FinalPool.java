package multi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Electrician1 implements Runnable{
	
	String house;
	public Electrician1(String house) {
		this.house = house;
	}

	
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Started"+house);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Finished"+house);
		
		
	}
}


public class FinalPool {

	public static void main(String[] args) {
		ExecutorService electrician = Executors.newFixedThreadPool(2);
		
		for(int i=0;i<20;i++) {
			Runnable r = new Electrician1("Flat no"+i);
			electrician.execute(r);
		}

	}

}
