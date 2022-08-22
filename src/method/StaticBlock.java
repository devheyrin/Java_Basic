package method;


// 정적 초기화 블럭 - static{}
// 클래스가 사용되기 전에 JVM에 의해 단 한 번 호출(실행)되게 하기 위해 사용 
// 정적 필드(변수)의 초기화 설정에 주로 사용됨 - 누구나 언제 어디서든 접근할 수 있도록! 
public class StaticBlock {
	static int[] arr;
	// arr 배열을 1~100으로 단 한 번 초기화 
	static {
		arr = new int[100];
		for (int i=0; i<100; i++) {
			arr[i] = i+1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticBlock.arr[34]);
		System.out.println(StaticBlock.arr[97]);
		System.out.println(StaticBlock.arr[12]);
		
	}

}
