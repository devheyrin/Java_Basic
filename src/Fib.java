import java.util.Scanner;

public class Fib {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(n);
		
		int[] intArray = new int[n+1];
		
		intArray[0] = 0;
		intArray[1] = 1;
		System.out.println(intArray[1]);
		
		for (int i = 2; i <= n; i++) {
			intArray[i] = intArray[i-1] + intArray[i-2];
			System.out.println(intArray[i]);
		} 
	}

}
