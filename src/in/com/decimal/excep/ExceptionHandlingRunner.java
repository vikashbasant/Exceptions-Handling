package in.com.decimal.excep;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		method1();
		System.out.println("Main Ended");
	}

	public static void method1() {
		method2();
		System.out.println("method1 Ended");
	}

	public static void method2() {
		String str = null;
		str.length();
		System.out.println("method2 Ended");
	}
}
