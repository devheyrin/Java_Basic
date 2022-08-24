package oop;

public class GoodsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodsStock obj = new GoodsStock("1234", 100);
		// toString이 오버라이딩되었기 때문에 
		// GoodsStrock에 구현된 내용대로 출력 
		// 상품코드 : 1234, 재고수량 : 100 
		System.out.println(obj); 
		
		
		String str = "재고정보=" + obj;
		System.out.println(str);
		// String 타입의 변수는 toString 메소드가 자동 호출된다. 

	}

}
