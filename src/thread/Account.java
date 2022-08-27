package thread;

// 계좌 클래스
public class Account {
	
	int balance = 10000;
	
	// 출금 메소드
	public void withdraw(int money) {
		
		synchronized (this) {
			if(balance >= money) {
				try {
					Thread.sleep(1000); // 1초 대기 
				} catch (Exception e) {
					
				}
				balance -= money;
			}
		}
		
	}
	
	public void deposit(int money) {
		
		synchronized (this) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			balance += money;
		}
	}

}


// 입금 메소드 구현 - 동기화 처리 
// 한 사람이 입금하고 있을때는 다른 사람이 입금할 수 없음 

