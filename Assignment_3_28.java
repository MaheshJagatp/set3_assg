package Assignment_3;

import java.util.Scanner;

public class Assignment_3_28 {

	public static void main(String[] args) {
		Assignment_3_28 obj = new Assignment_3_28();
		obj.panVld();
	}

	public void panVld() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter ur pan-card number");
		String s1 = s.next();

		String s2 = s1.substring(0, 3);
		String s3 = s1.substring(3, 7);
		String s4 = s1.substring(7);

		int count1 = 0, count2 = 0, count3 = 0;

		if (s1.length() == 8) {

			for (int i = 0; i < s2.length(); i++) {

				if (Character.isAlphabetic(s2.charAt(i)) && Character.isUpperCase(s2.charAt(i)))

					count1++;

			}

			for (int i = 0; i < s3.length(); i++) {

				if (Character.isDigit(s3.charAt(i))) {
					count2++;
				}
			}

			for (int i = 0; i < s4.length(); i++) {

				if (Character.isAlphabetic(s4.charAt(i)) && Character.isUpperCase(s4.charAt(i))) {
					count3++;
				}
			}
		}

		if (count1 == 3 && count2 == 4 && count3 == 1) {
			System.out.println("Correct Pan-card number");
		} else {
			System.out.println("Incorrect Pan-card number");
		}

	}

}
