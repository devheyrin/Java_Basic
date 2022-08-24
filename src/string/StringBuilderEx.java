package string;

public class StringBuilderEx {
	public static void main(String[] args) {
		/*
		 * StringBuilder sb = new StringBuilder("역사를 하노라고 맨땅을 파다가 ");
		 * System.out.println(sb);
		 * System.out.println(sb.append("커다란 고인돌을 끄집어 내어놓고 보니"));
		 * System.out.println(sb.insert(26, "하나 ")); System.out.println(sb.delete(21,
		 * 23)); // 21~22 삭제 System.out.println(sb.deleteCharAt(9)); // 9 삭제
		 */

		StringBuilder sb = new StringBuilder("푸른 산빛을");
		printStringBuilder(sb);
		sb.append(" 깨치고 적은 길을 걸어서 참어 떨치고 갔습니다.");
		printStringBuilder(sb);
		sb.insert(10, " 단풍나무 숲을 향하여 난");
		printStringBuilder(sb);

	}

	static void printStringBuilder(StringBuilder sb) {
		String str = sb.toString();
		int len = sb.length();
		int bufSize = sb.capacity();
		System.out.printf("%s(%d): %d %n", str, len, bufSize);
	}

}
