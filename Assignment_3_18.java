package Assignment_3;

import java.util.Scanner;

public class Assignment_3_18 {

	public static void main(String[] args) {

		Assignment_3_18 obj = new Assignment_3_18();
		obj.strOp();
	}

	public void strOp() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string ");
		String s1 = s.next();

		if (s1.length() >= 3) {
			String s2 = s1.substring(0, 3);
			s2 +=s2;
			System.out.println(s2);
			
		} else if (s1.length() <= 3) {
			String s3 = s1.substring(0, s1.length());
			if (s1.length() == 2) {
				s3 = s3 + s3 + s3;
			} else {

			}

			System.out.println(s3);
		}

	}

}
