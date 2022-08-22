import java.util.Calendar;
import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		// 출신 지역 구하기 
		// 0: 서울, 1: 인천/경기, 5: 전라도, 7/8: 경상도, 9: 제주도
		// String id = "000226-4834567";
		
		Scanner scan = new Scanner(System.in);
		
		// new : 힙 에다가 이 클래스를 '객체화'  시켜라
		
		String id = scan.nextLine(); 
		
		char code = id.charAt(8);
		String hometown = "";
		
		switch (code) {
		case '0':
			hometown = "서울";
			break;
		case '1':
			hometown = "인천/경기";
			break;
		case '5':
			hometown = "전라도";
			break;
		case '7': 
		case '8':
			hometown = "경상도";
			break;
		case '9':
			hometown = "제주도";	
			break;
		}
		System.out.println(hometown);
		
		// 나이 구하기 
		char sung = id.charAt(7);
		String birthStr = id.substring(0, 2); // 1~2 
		int birthYear = Integer.parseInt(birthStr);
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		
		switch(sung) {
		case '1':
		case '2':
			birthYear = 1900 + birthYear;
			break;
		case '3':
		case '4':
			birthYear = 2000 + birthYear;
			break;
		}	
		System.out.println(year - birthYear + 1);
		
		
		
		
	}
}
