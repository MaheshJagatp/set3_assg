package Assignment_3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignment_3_21 {

	public static void main(String[] args) {
		Assignment_3_21 obj = new Assignment_3_21();
		obj.equalStr();

	}

	public void equalStr() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string");
		String s1 = s.next();
		if (s1.contains("*")) {

			StringTokenizer st = new StringTokenizer(s1, "*");
			String s2 = st.nextToken();
			String s3 = st.nextToken();

			if (s2.equals(s3)) {
				System.out.println("true");
			} else
				System.out.println("false");

		} else
			System.out.println("false");
	}

}
