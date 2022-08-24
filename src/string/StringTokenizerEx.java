package string;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		StringTokenizer stok = new StringTokenizer("사과 배 복숭아");
		
		while (stok.hasMoreTokens()) { // 토큰이 있을 동안 
			String str = stok.nextToken(); // 다음 토큰 가져오기
			System.out.println(str);
		}
		
		StringTokenizer stok2 = new StringTokenizer("사과,배,복숭아", ","); // 두번째 인자 - 구분자
		
		while (stok2.hasMoreTokens()) {
			String str = stok2.nextToken();
			System.out.println(str);
		}
		
		StringTokenizer stok3 = new StringTokenizer("사과=10|배=3|복숭아=1", "=|", true);
		
		while (stok3.hasMoreTokens()) {
			String str = stok3.nextToken();
			if (str.equals("="))
				System.out.print("\t");
			else if (str.equals("|"))
				System.out.print("\n");
			else 
				System.out.print(str);
		}
	}

}
