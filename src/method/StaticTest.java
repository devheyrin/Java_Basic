package method;

public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// printChar('*', 30);
		
		StaticTest pc = new StaticTest(); 
		// 선언과 초기화를 한번에 하는 방법 
		// pc 변수는 StaticTest 객체의 주소만을 가진다. 
		// pc 변수는 StaticTest 객체의 타입만을 가진다. 
		pc.printChar('*', 30);
		System.out.println("안녕 자바!~");
		pc.printChar('*', 30);
	}
	
	// static void printChar(char ch, int num) {
		
	void printChar(char ch, int num) {
		for (int cnt=1; cnt<num; cnt++) {
			System.out.print(ch);
		}
		System.out.println();
	}
}
