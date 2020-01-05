package Assignment_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment_3_34 {

	public static void main(String[] args) {
		Assignment_3_34 obj = new Assignment_3_34();
		obj.swapChar();

	}

	public void swapChar() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = s.next();

		char[] a = s1.toCharArray();
		System.out.println(Arrays.toString(a));
		char temp;

		for (int i = 0; i < s1.length(); i = i + 2) {
			if (s1.length() % 2 == 0) {
				temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
			}

		}

		 System.out.println(Arrays.toString(a));

	}

}
