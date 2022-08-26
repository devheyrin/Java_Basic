package thread;

public class ThreadEx1_1 extends Thread{
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println("Ex1: " + i);
		}
		System.out.println(getName());
		
	}


}
