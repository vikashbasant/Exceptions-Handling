package in.com.decimal.excep;

import java.util.Scanner;

public class SumOfTwoArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = scanner.nextInt();
		}

		int m = scanner.nextInt();
		int arr2[] = new int[m];
		for (int i = 0; i < m; i++) {
			arr2[i] = scanner.nextInt();
		}

		String string = sum(arr1, arr2);
		System.out.println(string);

	}

	private static String sum(int[] arr1, int[] arr2) {
		String string = "";
		int carray = 0;
		int i = arr1.length - 1;
		int j = arr2.length - 1;

		while (i >= 0 && j >= 0) {
			int temp1 = arr1[i];
			i--;
			int temp2 = arr2[j--];
			int tempSum = temp1 + temp2 + carray;

			carray = tempSum / 10;
			string = tempSum % 10 + string;
		}

		while (i >= 0) {
			int temp1 = arr1[i];
			i--;
			int tempSum = temp1 + carray;
			carray = tempSum / 10;
			string = tempSum % 10 + string;
		}
		while (j >= 0) {
			int temp2 = arr2[j];
			j--;
			int tempSum = temp2 + carray;
			carray = tempSum / 10;
			string = tempSum % 10 + string;
		}

		if (carray > 0) {
			string = carray + string;
		}

		return string;
	}
}
