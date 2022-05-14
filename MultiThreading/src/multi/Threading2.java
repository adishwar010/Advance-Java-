package multi;

class MythreadAnother  implements Runnable{
	public void run() {
		Thread.currentThread().setName("Adi");

//		Thread.currentThread().setName("Adi");
		System.out.println("Child Thread NAme: " +Thread.currentThread().getName());
		System.out.println("thred1");
		for(int i=0;i<10;i++) {
			System.out.println("Childe Thread : "+ i);
		}
		System.out.println("thread1 terminated");
	}
}

public class Threading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Parent Thread Id: " +Thread.currentThread().getId());

		System.out.println("Parent Thread NAME: " +Thread.currentThread().getName());
		MythreadAnother x = new MythreadAnother();
		Thread t1 = new Thread(x);
		t1.start();

	}

}
