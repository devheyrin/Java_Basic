import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0; // 사용자가 입력 
		int count = 0; // 시도 횟수 카운트 
		
		Scanner sc = new Scanner(System.in);
		
		do {
			count++;
			System.out.println("1~100사이의 값을 입력하세요 : ");
			input = sc.nextInt();
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
