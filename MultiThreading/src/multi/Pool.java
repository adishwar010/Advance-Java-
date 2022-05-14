 package multi;

//import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyPool implements Runnable{
	
	String name;
	public MyPool(String name) {
		this.name=name;
	}
	 public void run() {
		System.out.println("Thread "+ Thread.currentThread().getId()+" started to "+name);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread "+ Thread.currentThread().getId()+" finished his job");
	 }
 }
 
 
public class Pool {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService ex = Executors.newFixedThreadPool(3);
		for(int i=1;i<=20;i++) {
			Runnable r = new MyPool("paint wall : "+i);
			ex.execute(r);
			
		}
		ex.shutdown();

	}

}
