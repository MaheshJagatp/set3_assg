package Assignment_3;

import java.util.Scanner;

public class Assignment_3_22 {

	public static void main(String[] args) {
		Assignment_3_22 obj = new Assignment_3_22();
		obj.removeX();
	}

	public void removeX() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string");
		String s1 = s.next();
		String s2 = "";
		int count = 0;

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == 'x') {
				count++;

			} else {
				s2 = s2 + s1.charAt(i);
			}
		}
		// System.out.println(count);
		// System.out.println(s2);
		for (int i = 0; i < count; i++) {
			s2 = s2 + 'x';
		}
		System.out.println(s2);

	}
}
