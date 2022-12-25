package in.com.decimal.excep;

public class ExceptionHandlingRunner2 {

	public static void main(String[] args) {
		method1();
		System.out.println("Main Ended");
	}

	public static void method1() {
		method2();
		System.out.println("method1 Ended");
	}

	public static void method2() {
		try {
//			String str = null;
//			str.length();

			int[] i = { 1, 2 };
			int number = i[3];
			System.out.println("method2 Ended");
		} catch (NullPointerException exception) {
			System.out.println("Matched NullPointerException");
			exception.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Matched ArrayIndexOutOfBoundsException");
			exception.printStackTrace();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
