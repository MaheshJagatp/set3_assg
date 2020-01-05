package Assignment_3;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_3_3 {

	public static void main(String[] args) {
		Assignment_3_3 obj = new Assignment_3_3();
		obj.strOp();

	}

	public void strOp() {
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter the limit for array");
		int l = s.nextInt();
		System.out.print("enter values");
		String[] a = new String[l];
		for (int i = 0; i < l; i++) {
			a[i] = s.next();
		}
		System.out.println(Arrays.toString(a));*/
		String[] a= {"Vikas","Lokesh","Ashok"};

		String s1 = "";
		String temp;
		for (int i = 0; i < a.length; i++) {
			temp = a[i];

			s1 = s1 + temp;
			if (a.length > i + 1) {
				s1 = s1 + ",";
			}
		}
		System.out.println("string is->" + s1);
	}

}
