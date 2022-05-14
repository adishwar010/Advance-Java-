package multi;


class MyAnotherThread implements Runnable{
	public void run()
	{
		
		Thread.currentThread().setName("Adi");
		Thread.currentThread().setPriority(4);
		System.out.println("Name: "+Thread.currentThread().getName() +
				" with Priority : "+Thread.currentThread().getPriority());
//		Thread.yield();
		System.out.println("hello");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("World");
		
	}
}
class MyAnotherThread1 implements Runnable{
	public void run()
	{
//		
		Thread.currentThread().setName("Adishwar");
//		Thread.currentThread().setPriority(8);
		System.out.println("Name: "+Thread.currentThread().getName() +
				" with Priority : "+Thread.currentThread().getPriority());
//		Thread.join();
		System.out.println("hello I am Jannu");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


public class Thread3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
			MyAnotherThread x =new MyAnotherThread();
			Thread t = new Thread(x);
//			t.setPriority(10);
			t.start();
			t.join();
			MyAnotherThread1 y =new MyAnotherThread1();
			Thread t2 = new Thread(y);
//			t2.setPriority(8);
			t2.start();
			t2.join();
			
			Thread.currentThread().getPriority();
			System.out.println(Thread.currentThread().getPriority()+" name: " + Thread.currentThread().getName());
		

	}

}
