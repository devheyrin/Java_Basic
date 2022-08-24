package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionNumberGame {
	public static void main(String[] args) {
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0; // 사용자가 입력 
		int count = 0; // 시도 횟수 카운트 
		
		
		do {
			count++;
			System.out.println("1~100사이의 값을 입력하세요 : ");
			
			try {
				input = new Scanner(System.in).nextInt();
				// 예외처리시에는 Scanner객체를 반복문 안에서 생성한다. 
			} catch (InputMismatchException e) {
				System.out.println("입력이 잘못됨");
				continue;
				// e.printStackTrace();
			}
			if (input == answer) {
				System.out.println("정답!");
				System.out.println("시도 횟수 : " + count);
				break;
			} else if (input < answer) {
				System.out.println("up");
				System.out.println("시도 횟수 : " + count);
				continue;
			} else if (input > answer) {
				System.out.println("down");
				System.out.println("시도 횟수 : " + count);
				continue;
			}

		} while (true);
	}

}
