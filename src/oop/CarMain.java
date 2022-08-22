package oop;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("blue", "auto", 4);
		Car c2 = new Car();
		Car c3 = new Car("black");
		
		System.out.println("c1 " + c1.color + c1.gearType + c1.door);
		System.out.println("c2 " + c2.color + c2.gearType + c2.door);
		System.out.println("c3 " + c3.color + c3.gearType + c3.door);
	}

}
