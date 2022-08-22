package method;

public class MethodEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123";
		System.out.println(str + "은 숫자입니까? " + isNumber(str));
		
		str = "123 0";
		System.out.println(str + "은 숫자입니까? " + isNumber(str));
		
	}
	
	public static boolean isNumber(String str) {
		if (str == null || str.equals(" ")) {
			return false;
		} 
		// 숫자 아스키코드 범위안에있는지확인 
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) < '0' || str.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}

}
