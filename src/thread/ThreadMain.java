package thread;

public class ThreadMain {
	
	public static void main(String[] args) {
		// 멀티 스레드 구현
		
		// 객체생성방법 1
		// ThreadEx1_1 : Thread 클래스 상속 
		ThreadEx1_1 th1 = new ThreadEx1_1();
		
		
		// 객체생성방법 2
		// ThreadEx1_2 : Runnable 인터페이스 상속 
		Thread th2 = new Thread(new ThreadEx1_2());
		
		// th1.run() X 
		
		// 실행방법 - start();
		// main, th1, th2 세 개의 스레드가 동시에 실행 
		th1.start();
		th2.start();
		
	}
	

}
