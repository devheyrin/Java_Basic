package exception;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			throw new Exception("고의로 예외발생");
		} catch (Exception e) {
			System.out.println("에러 메시지: " + e.getMessage());
			e.printStackTrace();
			// 스택을 확인하는 명령 
			// 스택에는 지금까지 실행한 명령들이 쌓임 
			// java.lang.Exception: 고의로 예외발생
			// at exception.ExceptionEx2.main(ExceptionEx2.java:7)
		}
		System.out.println("프로그램 정상 종료");
			
	}

}
