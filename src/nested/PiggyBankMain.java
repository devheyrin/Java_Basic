package nested;

public class PiggyBankMain {
	public static void main(String[] args) {
		
		PiggyBank bank1 = new PiggyBank();
		PiggyBank bank2 = new PiggyBank();
		PiggyBank bank3 = new PiggyBank();
		
		bank2.slot.put(1000);
		bank3.slot.put(2000);
		bank3.slot.put(2000);
		
		System.out.println("첫 번째 저금통: " + bank1.total);
		System.out.println("두 번째 저금통: " + bank2.total);
		System.out.println("세 번째 저금통: " + bank3.total);

		
	}

}
