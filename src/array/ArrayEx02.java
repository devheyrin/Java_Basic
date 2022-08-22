package array;

public class ArrayEx02 {
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		for (int i=0; i< args.length; i++) {
			System.out.print(args[i] + "\t" + args[i].length());
			System.out.println();
		}
		
		// 향상된 for문 - 자료구조객체와 for문 사용하는경우, 성능에 좋은 영향
		for (String str:args) {
			System.out.println(str);
			System.out.println(str.length());
		}
	}
}
