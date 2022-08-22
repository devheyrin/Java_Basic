import java.util.Scanner;

public class Fib2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(n);
		
		int prev1 = 0;
		int prev2 = 1;
		int res = 0;
		
		for (int i = 1; i <= n; i++) {
			res = prev1 + prev2;
			prev1 = prev2;
			prev2 = res;
			System.out.println(res);
		} 
	}

}
