package method;

public class MethodEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 5;
		System.out.println(value + "의 절대값: " + abs(value));
		value = -10;
		System.out.println(value + "의 절대값: " + abs(value));

	}
	
	public static int abs(int num) {
		return (num >= 0)? num: -num;
	}

}
