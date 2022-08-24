package exception;

public class NameLengthException extends Exception {
	String name;
	
	public NameLengthException(String name) {
		super("잘못된 이름이 입력되었습니다.");
	}
	
	public void showWrongName() {
		System.out.println(this.name + "은(는) 잘못된 이름입니다.");
	}

}
