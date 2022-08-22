package method;

import java.util.Calendar;
import java.util.Scanner;

public class MethodExJumin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요: ");
		String id = sc.nextLine();
		
		String sex = sex(id);
		System.out.println("성별: " + sex);
		
		String birth = area(id);
		System.out.println("출신지역: " + birth);
		
		String naiYear = id.substring(0, 2);
		char sexInfo = id.charAt(7);
		System.out.println("나이: " + age(naiYear, sexInfo) + "세 입니다.");

	}

	public static int age(String naiYear, char sexInfo) {
		// TODO Auto-generated method stub
		int result = 0;
		if (sexInfo == '1' || sexInfo == '2') {
			result = 2022 - Integer.parseInt("19" + naiYear) + 1;
		} else {
			result = 2022 - Integer.parseInt("20" + naiYear) + 1;
		}
		return result;
	}

	public static String area(String id) {
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
		default:
			hometown = "없음";
		}
		return hometown;
	}

	public static String sex(String id) {
		// 주민번호를 받아서 성별"남자", "여자"를 리턴하는 메소드
		// TODO Auto-generated method stub
		char code = id.charAt(7);
		if (code == '1' || code == '3') {
			return "남자";
		} else {
			return "여자";
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
