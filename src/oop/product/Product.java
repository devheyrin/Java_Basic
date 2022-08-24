package oop.product;

public class Product {
	int price, bonusPoint;
	
	public Product(int price) {
		this.price = price;
		this.bonusPoint = (int)(price / 10.0);
	}
	
	// 생성자 오버로딩 
	public Product() {
		this.price = 0;
		this.bonusPoint = 0;
	}
	
}
