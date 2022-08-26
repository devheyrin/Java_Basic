package thread;

public class ThreadEx3Main {
	public static void main(String[] args) {
		ThreadEx3_1 th1 = new ThreadEx3_1();
		ThreadEx3_2 th2 = new ThreadEx3_2();
		
		
		
//		th2.setPriority(7); // 우선순위 기본값 : 5 (1~10) 숫자 클수록 우선순위 높다
//		System.out.println("th1우선순위: " + th1.getPriority());
//		System.out.println("th2우선순위: " + th2.getPriority());
//		th1.start();
//		th2.start();
		
//		th1.start();
//		
//		try {
//			th1.join(); 
//			// 두 스레드를 번갈아 실행하지 않고 순차적으로 실행할 때 사용
//			// but 멀티스레드에서 중요한내용은 아님 
//			
//		}catch (Exception e) {
//			// TODO: handle exception
//		
//		}
//		
//		th2.start();
		
		th1.start();
		th2.start();
		try {
			th1.sleep(5000);
		} catch (InterruptedException e) {
		}
		System.out.println("main종료");
		
		
		
	}

}
