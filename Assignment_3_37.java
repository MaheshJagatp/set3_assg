package Assignment_3;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_3_37 {

	public static void main(String[] args) {
		Assignment_3_37 obj = new Assignment_3_37();
		obj.strOp();

	}

	public void strOp() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first input");
		String s1 = s.nextLine();
		System.out.println("Enter second input");
		String s2 = s.nextLine();

		char[] s1array = s1.toCharArray();
		char[] s2array = s2.toCharArray();
		System.out.println(s1array);
		 System.out.println(s2array);

		char[] s3array = new char[s1.length()];
		for (int i = 0; i < s1.length(); i++) {
			s3array[i] = '+';
			//System.out.print(Arrays.toString(s3array));
		}

		for (int i = 0; i < s1array.length; i++) {

			for (int j = 0; j < s2array.length; j++) {

				if (s1array[i] == s2array[j] || Character.toUpperCase(s1array[i]) == s2array[j]
						|| Character.toLowerCase(s1array[i]) == s2array[j]) {

					s3array[i] = s1array[i];

				}

			}

		}
		for (int i = 0; i < s3array.length; i++) {
			System.out.print(s3array[i]);
		}

	}
}
