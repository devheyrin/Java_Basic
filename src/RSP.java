import java.util.Scanner;

public class RSP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String man;
		String woman;
		Scanner sc = null;
		
		while (true) {
			sc = new Scanner(System.in);
			System.out.println("가위바위보중 하나를 입력: ");
			System.out.println("하녕: ");
			man = sc.nextLine();
			System.out.println("유진: ");
			woman = sc.nextLine();
			
			if (man.equals(woman)) {
				System.out.println("비겼습니다! 게임 재시작");
			} else if (man.equals("가위") && woman.equals("바위") || 
					   man.equals("바위") && woman.equals("보") || 
					   man.equals("보") && woman.equals("가위")) {
				System.out.println("유진 승리");
				break;
			} else {
				System.out.println("하녕 승리");
				break;
			}
		}
		
	
	}

}
