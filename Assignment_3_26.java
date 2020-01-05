package Assignment_3;

import java.util.Scanner;

public class Assignment_3_26 {

	public static void main(String[] args) {
		Assignment_3_26 obj = new Assignment_3_26();
		obj.checkISBN();

	}

	public void checkISBN() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number with 10 digit");
		String s1 = s.next();
		int sum = 0, j = 10;
		if (s1.length() == 10) {
			for (int i = 0; i < s1.length(); i++) {
				char c = s1.charAt(i);
				int a = Character.getNumericValue(c);
				// System.out.println(a);
				if (j > 0) {
					sum = sum + (a * j);
					j--;

				}

			}
			System.out.println("Sum is-- > " + sum);

		} else {
			System.out.println("Enter number with 10 digit");
		}
		if (sum % 11 == 0) {
			System.out.println("It is isbn number");
		} else {
			System.out.println("It is not isbn number");
		}

	}

}
