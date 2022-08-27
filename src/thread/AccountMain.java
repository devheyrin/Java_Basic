package thread;


public class AccountMain {
	public static void main(String[] args) {

		Runnable r = new AccountThread(); 
		// 한 계좌에서 두 은행이 출금하는 상황 
		
		Thread th1 = new Thread(r, "신한은행");
		Thread th2 = new Thread(r, "국민은행");
	
		
		th1.start();
		th2.start();
		
	}

}
