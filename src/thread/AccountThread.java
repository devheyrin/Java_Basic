package thread;

public class AccountThread implements Runnable {
	
	Account acc = new Account();
	
	@Override
	public void run() {
		while(acc.balance > 0) {
			int money = (int)(Math.random() * 3 + 1) * 1000; // 1000~3000 사이의 임의값 출력
			
			acc.withdraw(money);
			System.out.println("잔액: " + acc.balance);
			
		}
		
	}

}
