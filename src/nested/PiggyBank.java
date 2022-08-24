package nested;

public class PiggyBank {
	
	int total;
	Slot slot; // 저금통 입구 
	
	public PiggyBank() {
		total = 0;
		slot = new Slot();
	}
	
	
	class Slot {
		void put(int amount) {
			total += amount;
		}
	}

}
