package exception;

import java.util.Scanner;

public class UserExceptionMain {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
//		System.out.println("나이를 입력하세요 -> ");
//		
//		try {
//			int age = readAge();
//			System.out.println("당신은 " + age + "세 입니다.");
//		} catch(AgeInputException e) {
//			System.out.println(e.getMessage());	
//		}
		
		try {
			PersonalInfo info = readPersonalInfo();
			info.showPersonalInfo();
		} catch (AgeInputException e) {
			e.printStackTrace();
		} catch (NameLengthException e) {
			e.showWrongName(); // 잘못 입력된 이름 : X 
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// 이름, 나이를 입력받아 PersonalInfo객체를 리턴하는 함수 
	public static PersonalInfo readPersonalInfo() throws AgeInputException, NameLengthException {
		String name = readName();
		int age = readAge();
		return new PersonalInfo(name, age);
	}
	
	public static int readAge() throws AgeInputException{
		System.out.println("나이 입력: ");
		int age = sc.nextInt();
		if (age < 0) {
			throw new AgeInputException();
		}
		return age;
	}
	
	public static String readName() throws NameLengthException {
		System.out.println("이름 입력: ");
		String name = sc.nextLine();
		if (name.length() < 2 || name.length() > 4) {
			throw new NameLengthException(name);
		}
		return name;
	}

}
