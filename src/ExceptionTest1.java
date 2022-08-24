
public class ExceptionTest1 {

	public static void main(String[] args) {
		try {
			MyValueCall.valueA(15);
		} catch (MyValueException e) {
			System.out.println(e.getValue());
		}
		try {
			MyValueCall.valueB(5);
		} catch (MyValueException e) {
			System.out.println(e.getValue());
		}

	}

}
