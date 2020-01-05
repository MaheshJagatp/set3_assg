package Assignment_3;

import java.util.ArrayList;

public class Assignment_3_14 {

	public static void main(String[] args) {
		String[] a = { "mahesh", "jagtap", "mahe", "trewa", "jag" };

		int count = 0;

		for (int i = 0; i < a.length; i++) {
			String s1 = a[i];
			for (int j = 0; j < a.length; j++) {

				if (i == j) {
					continue;
				}

				String s2 = a[j];

				if (s2.startsWith(s1))
					count++;

			}

		}
		System.out.println(count);
	}

}
