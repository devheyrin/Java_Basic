package nested;

import java.util.ArrayList;

public class Cart {
	
	ArrayList<Item> list = new ArrayList<Item>();
	
	void addItem(String name, int num, int unitPrice) {
		list.add(new Item(name, num, unitPrice));
	}
	
	void removeItem(int index) {
		list.remove(index);
	}
	
	Item getItem(int index) {
		return list.get(index);
	}
	
	int getItemNum() {
		return list.size();
	}
	
	int getTotalPrice() {
		int total = 0;
		for (Item item: list) {
			total += item.getPrice();
		}
		return total;
	}
	
	class Item{
		String name;
		int num;
		int unitPrice;
		
		Item(String name, int num, int unitPrice) {
			this.name = name;
			this.num = num;
			this.unitPrice = unitPrice;
		}
		
		int getPrice() {
			return num * unitPrice;
		}
	}
	

}
