package oop.lendable;

public class LendableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeperateVolume obj = new SeperateVolume("863ㅂ", "나무", "베르베르");
		obj.checkOut("홍동우", "2022-08-23");
		obj.checkIn(); // 반납 
		
		AppCDInfo obj2 = new AppCDInfo("1111", "After Like");
		obj2.checkOut("전혜린", "2022-08-23");
		obj2.checkIn();
	}

}
