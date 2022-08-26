package thread;


public class AccountMain {
	public static void main(String[] args) {

		Runnable r = new AccountThread(); 
		// 한 계좌에서 두 은행이 출금하는 상황 
		
		Thread th1 = new Thread(r);
		Thread th2 = new Thread(r);
		
		th1.start();
		th2.start();
		
	}

}
