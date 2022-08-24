
public class WrapWork {
	public static void wrap(char test){
		if(Character.isLetter(test))
			System.out.println("문자");
		else if(Character.isDigit(test))
			System.out.println("숫자");
		else if(Character.isWhitespace(test))
			System.out.println("공백문자");
	}

	public static void wrap(String test){
		Byte b = Byte.parseByte(test);
		System.out.println(b);
	}


}
