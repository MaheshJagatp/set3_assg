package Assignment_3;

import java.util.Scanner;

public class Assignment_3_30 {

	public static void main(String[] args) {
		Assignment_3_30 obj = new Assignment_3_30();
		obj.checkLastFirst();

	}

	public void checkLastFirst() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = s.nextLine();

		if (s1.charAt(0) == s1.charAt(s1.length() - 1)) {
			System.out.println("match");

		} else {
			System.out.println("not match");
		}
	}

}
