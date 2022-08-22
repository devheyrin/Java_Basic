
public class ControlEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "123456-2122222";
		// 성별 구하기 
		char code = id.charAt(7); // charAt - 7번째에있는 char
	
		if (code == '1' || code == '3') {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}

	}
}