package array; // 문서의 최상단 

public class ArrayEx01 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i=0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		
	}
	
}
