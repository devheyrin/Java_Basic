package Homework;

class Student implements Comparable {
	String name;
	int    ban;
	int    no;
	int    kor;
	int    eng;
	int    math;

	int    total;	// 총점
	int    schoolRank;	// 전교등수

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban  = ban;
		this.no   = no;
		this.kor  = kor;
		this.eng  = eng;
		this.math = math;

		total = kor+eng+math;
	}

	int getTotal() {
		return total;
	}

	float getAverage() {
		return (int)((getTotal()/ 3f)*10+0.5)/10f;
	}

	public int compareTo(Object o) {
		
		return ban;
	}

	public String toString() {
		return name
			 +","+ban
			 +","+no
			 +","+kor
			 +","+eng
			 +","+math
			 +","+getTotal()
			 +","+getAverage()
			 +","+schoolRank	// 새로 추가
			 ;
	}
}