package method;

public class StaticVerifyTest {
	
	private static int i = 10;
	private int j;
	
	static void test1() {
		// static int k;
		int k = 300;
		i = 100;
		System.out.println(i);
	}
	
	void test20() {
		// static int k;
		i = 200;
		j = 300;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(i);
		test1();
		System.out.println(i);
		// System.out.println(k);

	}

}
