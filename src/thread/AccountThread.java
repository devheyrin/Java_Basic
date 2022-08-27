package thread;

public class AccountThread implements Runnable {
	
	Account acc = new Account();
	
	@Override
	public void run() {
		while(acc.balance > 0) {
			int money_out = (int)(Math.random() * 3 + 1) * 1000; // 1000~3000 사이의 임의값 출력
			int money_in = (int)(Math.random() * 3 + 1) * 1000;
			acc.withdraw(money_out);
			System.out.println(Thread.currentThread().getName() +  " 출금액: " + money_out + " 잔액: " + acc.balance);
			acc.deposit(money_in);
			System.out.println(Thread.currentThread().getName() + " 입금액: " + money_in + " 잔액: " + acc.balance);
			
		}
		
	}

}
