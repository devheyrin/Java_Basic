package Homework;

import java.util.*;

class Student2 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}
} // class Student

class BanNoAscending implements Comparator<Student2> {
	// java.util 패키지에 속한 인터페이스(API 참고해 볼 것!)

	@Override
	public int compare(Student2 o1, Student2 o2) {
		// TODO Auto-generated method stub
		if (o2.ban == o1.ban) {
			return o1.no - o2.no;
		}
		return o1.ban - o2.ban;
	}
}