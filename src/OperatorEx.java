
public class OperatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = ++a;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("오늘은 " + 1 + "일차 자바수업입니다.");
		System.out.println("3+4 = " + (3 + 4)); // 더하기 연산 
		System.out.println("3+4 = " + 3 + 4); // 연결 연산
		System.out.println("3*4 = " + 3 * 4); 
		
		int i = 3;
		if (i > 3 && ++i > 3) {
			System.out.println("조건 만족");
		}
		System.out.println("i = " + i); // 3
		
		if (i > 1 || ++i > 3) {
			System.out.println("조건 만족");
		}
		System.out.println("i = " + i); // 3
		
		// 삼항 연산자 
		int j = 30;
		int k = 25;
		int m = (j > k) ? j : k;
		System.out.println("큰 값: " + m); // 30 
	

	}

}
