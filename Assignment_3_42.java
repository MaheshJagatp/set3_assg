package Assignment_3;

import java.util.HashMap;
import java.util.Scanner;

public class Assignment_3_42 {

	public static void main(String[] args) {
		Assignment_3_42 obj = new Assignment_3_42();
		obj.hashMap1();

	}

	public void hashMap1() {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the limit");
		int l = s.nextInt();
		Float sum = (float) 0;
		HashMap<Integer, Float> hm = new HashMap<Integer, Float>();

		for (int i = 0; i < l; i++) {
			System.out.println("enetr keys");
			int h1 = s.nextInt();

			System.out.println("enetr values");
			Float h2 = s.nextFloat();
			hm.put(h1, h2);
			if (h1 % 2 == 0) {
				sum = sum + hm.get(Math.round(h1));
			}

		}
		System.out.println(hm);
		System.out.println("Sum is -> " + sum);

	}
}
