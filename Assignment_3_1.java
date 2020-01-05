package Assignment_3;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_3_1 {

	public static void main(String[] args) {
		Assignment_3_1 obj = new Assignment_3_1();
		obj.sumArray();

	}

	public void sumArray() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the limit of array");
		int l = s.nextInt();
		String[] a = new String[l];
		for (int i = 0; i < l; i++) {
			a[i] = s.next();
		}
		System.out.println(Arrays.toString(a));
		int  n;
		int sum = 0;
		String s1 = "";
		String temp;
		for (int i = 0; i < a.length; i++) {
			temp = a[i];

			s1 = s1 + temp;

		}
		System.out.println("string is->" + s1);

		for (int i = 0; i < s1.length(); i++) {
			if (Character.isDigit(s1.charAt(i))) {
				n = Character.getNumericValue(s1.charAt(i));
				// System.out.println(n);
				sum = sum + n;
			}

		}

		System.out.println("sum is-> " + sum);

	}
}