package multi;

class MyThread extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread : "+ i);
		}
	}
}


public class ExtendDemo {
	public static void main(String args[]) {
		MyThread a1 = new MyThread();
		a1.start();
		a1.run();
//		MyThread a2 = new MyThread();
//		a2.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread : "+ i);
		}
	}
}
