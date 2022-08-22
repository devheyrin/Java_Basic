import java.util.Scanner;

public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for : 1-100의 합계 구하기 
		int sum = 0;
		for (int i=1; i<=100; i+=2) {
			sum += i;
		}
		System.out.println(sum);
		
		// while 
		/*
		int sum1 = 0;
		int i = 1;
		while (i <= 100) {
			sum1 += i;
			i+=2;
		}
		System.out.println(sum1);
		
		// do-while
		int sum2 = 0;
		int j = 1;
		do {
			sum2 += j;				
			j+=2;
		}
		while (j <= 100);
		System.out.println(sum2);
		*/
		
		// 구구단의 단을 입력받아서 해당 단의 구구단 출력
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		System.out.println(dan);
		for (int k=1; k<=9; k++) {
			System.out.println(dan + "x" + k + "=" + dan*k);
		}
		// 구구단의 홀수 단만 가로로 출력
		for (int i=1; i<=9; i+=2) {
			for (int j=2; j<=9; j++) {
				System.out.print(i + "x" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}

	}

}
