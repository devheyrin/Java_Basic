
public class MyValueCall {
	public static void valueA(int a) throws MyValueException{
		if(a<10) throw new MyValueException();
	}
	public static void valueB(int b) throws MyValueException{
		if(b<20) throw new MyValueException(b);
	}



}
