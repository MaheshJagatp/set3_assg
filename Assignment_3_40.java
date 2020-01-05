package Assignment_3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignment_3_40 {

	public static void main(String[] args) {
		Assignment_3_40 obj = new Assignment_3_40();
		obj.checkFormat();

	}

	public void checkFormat() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the first input  CTS-LLL-XXXX in this format");
		String s1 = s.nextLine();
		System.out.println("Enter second input");
		String s2 = s.next();
		String sub = s2.substring(0, 3);

		boolean a = false, b = false;
		int count = 0;
		String f1 = "";
		String f2 = "";
		StringTokenizer st = new StringTokenizer(s1, "-");
		while (st.hasMoreElements()) {
			st.nextToken();
			f1 = st.nextToken();
			f2 = st.nextToken();

		}
		for (int i = 0; i < f2.length(); i++) {
			if (Character.isDigit(f2.charAt(i)))
				count++;

		}

		if (sub.equals(f1))
			a = true;

		if (count == 4)
			b = true;

		if (a && b == true) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
