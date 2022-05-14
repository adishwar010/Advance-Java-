package multi;

class Adishwar implements Runnable{
	public void run() {
//		Thread.yield();
		System.out.println("Adishwar is running");
//		isko pehle chalana hai
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Still Adishwar,goinfg to end");
	}
}
class Adi implements Runnable{
	public void run() {
		Thread.yield();
		System.out.println("Adi is running");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Adi going to end");
	}
}

public class Thread4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
//		Adi x = new Adi();
//		Thread t2 = new Thread(x);
//		t2.start();
//		t2.join();
//		
		
		
		Adishwar a = new Adishwar();
		Thread t = new Thread(a);
		t.start();
		t.join();
//		t.setPriority(10);
		
		System.out.println("main function running");
	}

}
