package multi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Electrician implements Runnable{
	String house;
	public Electrician(String house) {
		this.house=house;
	}
	public void run() {
		System.out.println("Electrician "+ Thread.currentThread().getId() + 
				" started to do the electricity repair of "+ house);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Electrician "+ Thread.currentThread().getId() +" finished his job");
	}
}

class Painter implements Runnable{
	String house;
	public Painter(String house) {
		this.house=house;
	}
	public void run() {
		System.out.println("Painter "+ Thread.currentThread().getId() + 
				" started to paint the  "+ house);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Painter "+ Thread.currentThread().getId() +" finished his job");
	}
}

class Plumber implements Runnable{
	String house;
	public Plumber(String house) {
		this.house=house;
	}
	public void run() {
		System.out.println("Plumber "+ Thread.currentThread().getId() + 
				" started to do the  repair of "+ house);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Plumber "+ Thread.currentThread().getId() +" finished his job");
	}
}


public class MultiPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService electrician = Executors.newFixedThreadPool(5);
		ExecutorService painter = Executors.newFixedThreadPool(4);
		ExecutorService plumber = Executors.newFixedThreadPool(3);
		
		for(int i=1;i<=20;i++) {
			Runnable r = new Electrician("Flat No" + i);
			electrician.execute(r);
		}
		electrician.shutdown();
		for(int i=1;i<=20;i++) {
			Runnable r = new Painter("Flat No" + i);
			painter.execute(r);
		}
		painter.shutdown();
		for(int i=1;i<=20;i++) {
			Runnable r = new Plumber("Flat No" + i);
			plumber.execute(r);
		}
		plumber.shutdown();

	}

}
