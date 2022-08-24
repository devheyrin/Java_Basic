package oop.item;

public class DVDItem extends Item implements Lendable {

    String actor, outDate;
    int runtime;
    
    String borrower;
    String checkoutDate;
    byte state;

    public DVDItem(int itemNo, String title, int price, String actor, int runtime, String outDate) {
        super(itemNo, title, price);
        this.actor = actor;
        this.runtime = runtime;
        this.outDate = outDate;
    }

    public void output() {
        super.output();
        System.out.println("주연배우: " + actor);
        System.out.println("상영시간: " + runtime);
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