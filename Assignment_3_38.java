package Assignment_3;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_3_38 {

	public static void main(String[] args) {
		Assignment_3_38 obj = new Assignment_3_38();
		obj.numberOp();

	}

	public void numberOp() {
		Scanner s = new Scanner(System.in);

		int sum = 0;
		System.out.println("Enter the limit for array");
		int l = s.nextInt();
		System.out.println("enter the values");
		int[] a = new int[l];
		for (int i = 0; i < l; i++) {
			int k = s.nextInt();
			a[i] = k;
		}
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < l; i++) {
			if (i % 2 == 0) {
				sum = sum + a[i] * a[i] * a[i];
			} else {
				sum = sum + a[i] * a[i];
			}
		}
		System.out.println("sum--> " + sum);

	}

}
