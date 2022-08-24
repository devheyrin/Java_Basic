package exception;

public class Rectangle {
	private int width;
	private int heigth;
	public Rectangle(int width, int height) throws Exception {
		if (width <= 0 || height <= 0) {
			throw new Exception("넓이 또는 높이의 값이 잘못되었습니다");
		} 
		this.width = width;
		this.heigth = height;
		
	}
	
	int getArea() {
		return width *heigth;
	}

}
