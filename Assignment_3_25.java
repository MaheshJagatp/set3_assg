package Assignment_3;

import java.util.Scanner;

public class Assignment_3_25 {

	public static void main(String[] args) {
		Assignment_3_25 obj = new Assignment_3_25();
		obj.twicePrint();

	}

	public void twicePrint() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = s.next();
		System.out.println("Enter the input");
		int i1 = s.nextInt();
		String s2 = "";
		String s3 = s1.substring(s1.length() - 2, s1.length());

		for (int i = 0; i < i1; i++) {
			s2 = s2 + s3;
		}
		System.out.println(s2);

	}

}
