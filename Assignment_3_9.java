package Assignment_3;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_3_9 {

	public static void main(String[] args) {
		Assignment_3_9 obj = new Assignment_3_9();
		obj.prefix();

	}

	public void prefix() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the limit");
		int l = s.nextInt();
		System.out.println("Enter the values");
		String[] a = new String[l];
		for (int i = 0; i < l; i++) {
			a[i] = s.next();
		}
		System.out.println(Arrays.toString(a));
		System.out.println("enter the prefix");
		String s2 = s.next();
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			 if (a[i].contains(s2)) {

				count++;
			}
		}
		System.out.println(count);

	}

}
