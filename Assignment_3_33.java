package Assignment_3;

import java.util.Scanner;

public class Assignment_3_33 {

	public static void main(String[] args) {
		Assignment_3_33 obj = new Assignment_3_33();
		obj.checkVowels();
	}

	public void checkVowels() {
		Scanner s = new Scanner(System.in);
		Boolean check = false;
		System.out.println("Enter the String ");
		String s1 = s.nextLine();
		for (int i = 0; i < s1.length(); i++) {

			if (s1.contains("a") && s1.contains("e") && s1.contains("i") && s1.contains("o") && s1.contains("u")) {
				check = true;

			}
		}
		if (check == true) {
			System.out.println("contains all vowels");
		} else {
			System.out.println(" not contains all vowels");
		}

	}

}
