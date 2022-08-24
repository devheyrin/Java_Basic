package oop.product;

// 고객(구매자) 
public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Product[] items = new Product[3]; 
	// 구입한 제품을 저장하기 위한 배열 (장바구니)
	int i = 0;
	
	// buy 메소드 구현 
	public void buy(Product product) {
		// TODO Auto-generated method stub
		if (product.price > this.money) {
			System.out.println(product + " 구매 실패 - 잔액이 부족합니다.");
			return;
		} 
		this.money -= product.price;
		this.bonusPoint += product.bonusPoint;
		this.items[i++] = product;
		System.out.println(product + " 구매 완료");
	}
	
	// summary 메소드 구현
	public void summary() {
		int sum = 0;
		System.out.println("----------구매내역----------");
		for (Product item : this.items) {
			if (item == null) break;
			sum += item.price;
			System.out.println("제품명: " + item + " 가격: " + item.price + " 보너스: " + item.bonusPoint);
		}
		System.out.println("총 가격: " + sum);
		
	}

	// TODO - 반납 메소드 구현
	// vetor or ArrayList 사용 
	

}
