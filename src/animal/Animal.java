package animal;

abstract public class Animal {
	protected int legs;
	
	protected Animal(int legs) {
		this.legs = legs;
	}
	
	public void eat() {
		
	}
	
	public void walk() {
		
	}
	
	abstract public String toString(); 
	

}
