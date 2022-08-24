package oop.lendable;

public interface Lendable {
	final static byte STATE_BORROWED = 1; // 대출중 
	// 배포용, 항상 공용으로 사용할것이므로 static
	final static byte STATE_NORMAL = 0; // 대출가능 
	
	// 대출
	void checkOut(String borrower, String date);
	// 반납 
	void checkIn();
	
	

}
