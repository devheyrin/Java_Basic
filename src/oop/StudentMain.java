package oop;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		st.hakbun = "2122222";
		st.name = "홍동우";
		st.kor = 100;
		st.eng = 70;
		st.mat = 50;
		*/
		// st.setName("홍동우");
		// st.getName();
		
		// st.setStudent("1234566", "홍동우", 100, 90, 70);
	
		Student st = new Student("1234566", "홍동우", 100, 90, 70);
		// 객체생성과 멤버변수 초기화를 한번에 할 수 있다. 
		st.sum();
		st.average();
		st.output();
		
		Student st2 = new Student("222222", "홍다인", 100, 90, 80);
		
		Student st3 = new Student();
	}

}
