package oop.lendable;


public class AppCDInfo extends CDInfo implements Lendable {
	String borrower, checkOutDate;
	byte state;
	
	public AppCDInfo(String registerNo, String title) {
		// TODO Auto-generated constructor stub
		super(registerNo, title);
	}
	
	@Override
	public void checkOut(String borrower, String checkOutDate) {
		// TODO Auto-generated method stub
		if (state != STATE_NORMAL) return;
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		this.state = STATE_BORROWED;
		System.out.println("[" + super.title + "] 대출완료" );
		
	}
	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		this.borrower = null;
		this.checkOutDate = null;
		this.state = STATE_NORMAL;
		System.out.println("[" + super.title + "] 반납완료");
		
	}

}
