package oop.fruit;

// 과일 판매자 
public class FruitSeller {
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE; // 변경할 수 없는 변수 
	
	public FruitSeller (int money, int appleNumber, int price) {
		this.myMoney = money;
		this.numOfApple = appleNumber;
		this.APPLE_PRICE = price;
	}
	
	// 판매 메소드 
	public int saleApple(int money) {
		int num = money / APPLE_PRICE; // 판매 과일 수 
		numOfApple -= num;
		myMoney += money;
		return  num;
	}
	
	public void showSaleResult () {
		System.out.println("남은 사과: " + numOfApple);
		System.out.println("판매 수익: " + myMoney);
	}
	
	
	

}
