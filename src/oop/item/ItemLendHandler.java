package oop.item;

import java.util.Scanner;

public class ItemLendHandler {
	
	private Lendable[] myLends;
    private int numOfLends;
    
    public ItemLendHandler(int num) {
		// TODO Auto-generated constructor stub
    	myLends = new Lendable[num];
    	numOfLends = 0;
	}
    
    private void addLendInfo(Lendable L) {
    	myLends[numOfLends++] = L;
    }
    
    public void addLend(int choice) {
    	int itemNo, price, trackNum, runtime, pageNum;
        String title, singer, actor, name, outDate;
        Scanner sc = new Scanner(System.in);

        System.out.println("제품번호: ");  itemNo = Integer.parseInt(sc.nextLine());
        System.out.println();
        System.out.println("이름: "); title = sc.nextLine();
        System.out.println();
        System.out.println("가격: "); price = Integer.parseInt(sc.nextLine());

        if (choice == 1) {
            // CD
            System.out.println("가수: "); singer = sc.nextLine();
            System.out.println("트랙수: "); trackNum = Integer.parseInt(sc.nextLine());
            System.out.println("출고일자: "); outDate = sc.nextLine();
            this.addLendInfo(new CDItem(itemNo, title, price, singer, trackNum, outDate));
        } else if (choice == 2) {
            // DVD
            System.out.println("주연배우: "); actor = sc.nextLine();
            System.out.println("상영시간: "); runtime = Integer.parseInt(sc.nextLine());
            System.out.println("출고일자: "); outDate = sc.nextLine();
            this.addLendInfo(new DVDItem(itemNo, title, price, actor, runtime, outDate));
        } else {
            // Book
            System.out.println("저자명: "); name = sc.nextLine();
            System.out.println("쪽수: "); pageNum = Integer.parseInt(sc.nextLine());
            System.out.println("출고일자: "); outDate = sc.nextLine();
            this.addLendInfo(new BookItem(itemNo, title, price, name, pageNum, outDate));
        }
        System.out.println("입력 완료!");
    }
    
//    public void showAllData() {
//        for (int i=0; i<numOfLends; i++) {
//        	myLends[i].output();
//        }
//    }
    
    public void checkOutAll() {
    	String borrower, date;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("대여자명: "); borrower = sc.nextLine();
    	System.out.println("대여일: "); date = sc.nextLine();
    	
    	for (int i=0; i<myLends.length; i++) {
    		if (myLends[i] != null) {
    			myLends[i].checkOut(borrower, date);
    		}
    		
    	}
    }
  

}
