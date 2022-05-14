package multi;

class thread implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child" + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class FinalThreading {

	public static void main(String[] args) throws InterruptedException {
		thread t = new thread();
		Thread x = new Thread(t);
		x.start();
		x.join();
		
		for(int i=0;i<10;i++) {
			System.out.println("Parent" + i);
		}

	}

}
