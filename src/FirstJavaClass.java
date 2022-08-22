
public class FirstJavaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이클립스에서 자바 실행 성공!");
		// ctrl + f11 -> 실행
		int APPLE_PRICE = 100;
		System.out.println(APPLE_PRICE);
		APPLE_PRICE = 200;
		char a = 'a';
		System.out.println(a); // a
		System.out.println((int)a); // 97
		
		int b = 98;
		System.out.println(b); // 98
		System.out.println((char)b); // b 
		
		int intValue = (int) 3.0;
		float floatValue = (float)3.0; 
		System.out.println(intValue);
		System.out.println(floatValue);
		
		double doubleValue = 10; 
		System.out.println(doubleValue); 

	}
}
