
public class MyValueException extends Exception{
	static final long serialVersionUID = 5387032512909160886L;
	private int value;
	public MyValueException(){ }
	public MyValueException(int value){ this.value = value; }
	public int getValue(){ return value; }

}
