package Assignment_3;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_3_16 {

	public static void main(String[] args) {
		Assignment_3_16 obj = new Assignment_3_16();
		obj.checkSeries();

	}

	public void checkSeries() {
		Boolean check = false;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the limit");
		int l = s.nextInt();
		int a[] = new int[l];
		System.out.println("enter the values");
		for (int i = 0; i < l; i++) {
			a[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(a));
		
		for (int i = 0; i < a.length - 2; i++) {
			if (a[i] == 1 && a[i + 1] == 2 && a[i + 2] == 3) {
				check = true;

				break;
			} else {
				check = false;

			}
		}
		if (check) {
			System.out.println("Sequence found");
		} else {
			System.out.println("false");
		}

	}

}
