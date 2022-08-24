package oop;

public class GoodsStock {
	String goodsCode;
	int stockNum;
	
	public GoodsStock(String goodsCode, int stockNum) {
		// TODO Auto-generated constructor stub
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	
	// Object의 메소드 toString을 오버라이딩
	public String toString() {
		String str = "상품코드: " + goodsCode + ", 재고수량: " + stockNum;
		return str;
	}

}
