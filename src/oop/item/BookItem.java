package oop.item;

public class BookItem extends Item implements Lendable {

    String name, outDate;
    int pageNum;
    String borrower;
    String checkoutDate;
    byte state;

    public BookItem(int itemNo, String title, int price, String name, int pageNum, String outDate){
        super(itemNo, title, price);
        this.name = name;
        this.pageNum = pageNum;
        this.outDate = outDate;
    }

    public void output() {
        super.output();
        System.out.println("저자명: " + name);
        System.out.println("쪽수: " + pageNum);
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