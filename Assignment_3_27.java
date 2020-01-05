package Assignment_3;

import java.util.Scanner;

public class Assignment_3_27 {

	public static void main(String[] args) {
		Assignment_3_27 obj = new Assignment_3_27();
		obj.passwordVld();

	}

	public void passwordVld() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the password");
		String s1 = s.next();
		int l = s1.length();

		boolean a = false, b = false, c = false, d = false;

		try {
			if (s1.length() >= 8) {
				a = true;
			}
			if (s1.contains("@") || s1.contains("_") || s1.contains("#")) {
				b = true;
			}
			if (s1.charAt(0) != '@' && s1.charAt(0) != '_' && s1.charAt(0) != '#') {
				c = true;
			}

			if (s1.charAt(l - 1) != '@' && s1.charAt(l - 1) != '_' && s1.charAt(l - 1) != '#') {
				d = true;
			}
		} catch (Exception e) {
			System.out.println("Exception");

		}

		if (a && b && c && d == true) {
			System.out.println("password is valid");
		} else {
			System.out.println("Invalid password");
		}

	}

}
