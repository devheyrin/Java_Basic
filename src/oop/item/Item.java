package oop.item;

public class Item {
	int itemNo;
    String title;
    int price;

    public Item(int itemNo, String title, int price) {
        this.itemNo = itemNo;
        this.title = title;
        this.price = price;
    }

    public void output() {
        System.out.println("제품번호: " + itemNo);
        System.out.println("이름: " + title);
        System.out.println("가격: " + price);
    }

}
