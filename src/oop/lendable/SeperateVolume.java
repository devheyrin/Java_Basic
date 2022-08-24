package oop.lendable;

public class SeperateVolume implements Lendable {
	String requestNo, bookTitle, writer, borrower, checkOutDate;
	byte state; //대출 상태 

	public SeperateVolume(String requestNo, String bookTitle, String writer) {
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}
	
	@Override
	public void checkOut(String borrower, String date) {
		// TODO Auto-generated method stub
		if (state != STATE_NORMAL) return; // 대출중이면 메소드종료
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = STATE_BORROWED;
		System.out.println("[" + bookTitle + "] 대출완료");

	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		this.borrower = null;
		this.checkOutDate = null;
		this.state = STATE_NORMAL;
		System.out.println("[" + bookTitle + "] 반납완료");
		
	}

}
