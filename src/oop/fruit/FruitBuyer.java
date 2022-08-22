package oop.fruit;

// 과일 판매자 
public class FruitBuyer {
	int numOfApple;
	int myMoney;
	
	public FruitBuyer(int money) {
		this.myMoney = money;
		this.numOfApple = 0;
	}
	
	public void showBuyResult () {
		System.out.println("구입한 사과: " + numOfApple);
		System.out.println("현재 잔액: " + myMoney);
	}
	
	// 구매 메소드 - 특정 판매자(seller)에게서 money 만큼 구매 
	public void buyApple(FruitSeller seller, int money) {
		numOfApple += seller.saleApple(money); 
		// 파라미터로 넘어온 판매자의 saleApple메소드 호출
		myMoney -= money;
	}

}
