package string;

public class StringEx {
	
	public static void main(String[] args) {
		/*
		String str1 = "자바";
		String str2 = "자바";
		
		if (str1 == str2) 
			System.out.println("같음");
		else 
			System.out.println("다름");
		
		
		String str3 = new String("자바");
		String str4 = new String("자바");
		
		if (str3.equals(str4)) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		
		String str = "자바 커피";
		
		int len = str.length();
		for (int cnt = 0; cnt < len; cnt++) {
			char ch = str.charAt(cnt);
			System.out.println(ch);
		}
		
		String str5 = "신나고 재미있는 자바~";
		System.out.println(str5.substring(3)); // 3~끝까지 
		System.out.println(str5.substring(3, 7)); // 3~6까지 추출 
		
		*/
		
		// trim, concat, toUpperCase, toLowerCase, replace - 원본을 변경하지 않는다. 
		String str1 = "   Let it be.  ";
        String str2 = str1.trim();
        System.out.println(str2);
        System.out.println(str2.concat(" Speaking words of wisdom."));
        System.out.println(str2.toUpperCase());
        System.out.println(str2.toLowerCase());
        System.out.println(str2.replace('e', 'a'));
        System.out.println(str1);
        System.out.println(str2);
		
		
	}

}
