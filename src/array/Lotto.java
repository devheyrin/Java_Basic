package array;

public class Lotto {
	public static void main(String[] args) {
		// 45개 배열 생성
		// 1-45 초기화 
		// 임의의 방번호(0-44중에서)를 추출하여 방의 값을 0번째 방의 값과 교환 (수천번 반복)
		// [1, ...... ,45] 
		// 1. 랜덤으로 방번호 1개 뽑기 -> 22번방 
		// 1번방의 숫자와 22번방의 숫자 교환 
		// 2. 랜덤으로 방번호 1개 뽑기 -> 11번방 
		// 1번방의 숫자와 11번방의 숫자 교환 
		// .... 반복 
		// 앞에서부터 6개방을 추출 (로또번호)
		
		int[] intArr = new int[45];
		for (int i=0; i<intArr.length; i++) {
			intArr[i] = i+1;
		}
		
		for (int i=0; i<1000; i++) {
			// 1부터 44까지의 임의의 숫자 뽑기  
			int random = (int) (Math.random() * 44) + 1;
			int first_num = intArr[0];
			intArr[0] = intArr[random];
			intArr[random] = first_num; 
		}
		for (int i=0; i<6; i++) {
			System.out.println(intArr[i]);
		}
	
	}

}
