package oop.fruit;

public class FruitSaleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitSeller seller1 = new FruitSeller(0, 100, 1500);
		FruitSeller seller2 = new FruitSeller(0, 300, 2000);
		
		FruitBuyer buyer = new FruitBuyer(100000);
		
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 8000);
		
		System.out.println("판매자 1 현재상황");
		seller1.showSaleResult();
		System.out.println("판매자 2 현재상황");
		seller2.showSaleResult();
		System.out.println("구매자 현재상황");
		buyer.showBuyResult();

	}

}
