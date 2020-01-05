package Assignment_3;

import java.util.Scanner;

public class Assignment_3_35 {

	public static void main(String[] args) {

		Assignment_3_35 obj = new Assignment_3_35();
		obj.encrp();

	}

	public void encrp() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = s.nextLine();
		String s2 = "";

		for (int i = 0; i < s1.length(); i++) {
			if (i % 2 == 0) {
				char c = s1.charAt(i);
				if (s1.charAt(i) != 'z' || s1.charAt(i) != 'Z') {
					c++;
					s2 = s2 + c;
				} else {
					c = 'a';
					s2 = s2 + c;
				}

			}else {
			s2 = s2 + s1.charAt(i);
			}
		}
		System.out.println(s2);
	}

}
