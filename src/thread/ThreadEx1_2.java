package thread;

public class ThreadEx1_2 implements Runnable {
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println("Ex2: " + i);
		}
		System.out.println(Thread.currentThread().getName());
	}
	
}
