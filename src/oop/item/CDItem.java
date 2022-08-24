package oop.item;

public class CDItem extends Item implements Lendable {
    private String singer;
    private int trackNum;
    private String outDate;
    private String borrower;
    private String checkoutDate;
    private byte state;

    public CDItem(int itemNo, String title, int price, String singer, int trackNum, String outDate) {
        super(itemNo, title, price);
        this.singer = singer;
        this.outDate = outDate;
        this.trackNum = trackNum;
    }

    public void output() {
        super.output();
        System.out.println("가수: " + singer);
        System.out.println("트랙수: " + trackNum);
        System.out.println("출고일자: " + outDate);
    }
    
    @Override
    public void checkOut(String borrower, String date) {
    	// TODO Auto-generated method stub
    	if (state != STATE_NORMAL) return;
    	this.borrower = borrower;
    	this.checkoutDate = date;
    	this.state = STATE_BORROWED;
    	System.out.println("[" + super.title + "] 대출완료");
    }
    
    @Override
    public void checkIn() {
    	// TODO Auto-generated method stub
    	this.borrower = null;
    	this.checkoutDate = null;
    	this.state = STATE_NORMAL;
    	System.out.println("[" + super.title + "] 반납완료");
    	
    }

}