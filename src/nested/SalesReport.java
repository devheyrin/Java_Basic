package nested;

public class SalesReport {
	
	class Record {
		String name;
		int num, amount;
		
		Record(String name, int num, int amount) {
			this.name = name;
			this.num = num;
			this.amount = amount;
		}
		
		int getPrice() {
			return num * amount;
		}
		
	}

}
