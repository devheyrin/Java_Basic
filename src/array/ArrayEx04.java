package array;

public class ArrayEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2차원 배열을 이용한 성적처리 프로그램 
		
		int[][] score = {{ 90, 85, 65}
				        , { 20, 76, 100}
				        , { 30, 30, 30}
				        , { 40, 80, 90}
				        , { 100, 70, 58}};
		
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("============================================");
		for (int i=0; i<score.length; i++) {
			// 과목별 점수 누적 
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];

			// 학생별 성적 총점, 평균 구하여 출력 
			int sum = 0;
			double avg = 0;
			for (int j=0; j<score[i].length; j++) {
				sum += score[i][j];
			}
			avg = sum / score[i].length;
			System.out.println((i+1) + "\t" + score[i][0] + "\t" + score[i][1] + "\t" + score[i][2] + "\t" + sum + "\t" + avg );			
		}
		System.out.println("=============================================");
		System.out.println("총점\t" + korTotal + "\t" + engTotal + "\t" + mathTotal );
	}

}
