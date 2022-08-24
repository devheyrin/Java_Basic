package exception;

// Exception을 상속하면 Catch에 사용할 수 있는 예외 클래스가 된다. 
public class AgeInputException extends Exception {
	public AgeInputException() {
		super("유효하지 않은 나이가 입력되었습니다.");
	}

}
