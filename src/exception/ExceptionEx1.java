package exception;

public class ExceptionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int number = 100; int result = 0; for(int i=0; i<10; i++) { try { result =
		 * number / (int)(Math.random()*10); // 0~9 // Exception in thread "main"
		 * java.lang.ArithmeticException: / by zero System.out.println(result); } catch
		 * (ArithmeticException e) { System.out.println("0으로 나눠짐"); }
		 * 
		 * }
		 */
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0); // 예외발생!!!
			System.out.println(4); // 예외발생 이후의 명령은 실행되지 않음 
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(5);
		}finally {
			System.out.println(6);
		}

	}

}
