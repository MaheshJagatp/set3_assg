package Assignment_3;

import java.util.Scanner;

public class Assignment_3_31 {

	public static void main(String[] args) {
		Assignment_3_31 obj = new Assignment_3_31();
		obj.strOp();

	}

	public void strOp() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1 = s.nextLine();
		System.out.println("Enter the Second string");
		String s2 = s.nextLine();
		String s3 = "";

		if (s1.length() == s2.length()) {
			s3 = s1 + s2;
			System.out.println(s3);

		} else if (s1.length() > s2.length()) {
			String sub = s1.substring(s2.length());
			s3 = sub + s2;
			System.out.println(s3);

		} else if (s1.length() < s2.length()) {
			String sub = s2.substring(s1.length());
			s3 = sub + s1;
			System.out.println(s3);
		}

	}

}
