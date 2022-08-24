package nested;


public class OuterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Outer o = new Outer(); 
		 * Outer.Inner in = o.new Inner(); // Outer.Inner 타입
		 * in.jababa();
		 */
		
		// 2줄
		/*
		 * Outer.Inner in = new Outer().new Inner(); 
		 * in.jababa();
		 */
		
		
		// 1줄 
		new Outer().new Inner().jababa();
		
		

	}

}
