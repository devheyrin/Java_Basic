package oop;

public class Student {

	private String hakbun, name;
	private int kor, eng, mat;
	private double tot, avg;
	
	// 기본 생성자 
	public Student() {
		
		
	}
	
	// 생성자 오버로딩 	
	public Student(String hakbun, String name, int kor, int eng, int mat) {
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	
	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public double getTot() {
		return tot;
	}

	public void setTot(double tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	
	void sum() {
		this.tot = kor + eng + mat;
		// this - 현재 자기자신의 클래스명과 같다.
	}
	
	void average() {
		this.avg = this.tot / 3.0;
	}
	
	void output() {
		System.out.println("이름: " + this.name + " 총점: " + this.tot + " 평균: " + this.avg);
	}
	
	// setter, getter 메소드를 이용해서 접근 
	// setter : 값 초기화 (파라미터 필요)
	// getter : 값 얻기 (return 값 필요)
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

}


