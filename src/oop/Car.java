package oop;

// 생성자 오버로딩 
public class Car {
	// private String color;
	// private String gearType;
	// private int door;
	String color;
	String gearType;
	int door;
	
	Car() {
		// 생성자 안에서 또 다른 생성자 호출
		this("white", "auto", 3);
		System.out.println("기본생성자");
		// this - 자기자신의 클래스명 
		
	}
	
	Car(String color) {
		this(color, "stick", 5);
		System.out.println("색상값만 지정");
		
	}
	
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

}
