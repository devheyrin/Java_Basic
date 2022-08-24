package exception;

public class RectangleMain {
	public static void main(String[] args) {
		Rectangle r = null;
		
		try {
			r = new Rectangle(5, 98);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		int area = r.getArea();
		System.out.println("넓이: " + area);
	}

}
