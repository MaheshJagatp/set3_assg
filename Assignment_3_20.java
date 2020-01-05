package Assignment_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_3_20 {

	public static void main(String[] args) {
		Assignment_3_20 obj = new Assignment_3_20();
		obj.arrayListOp();

	}

	public void arrayListOp() {
		Scanner s = new Scanner(System.in);

		System.out.println("enter the limit");
		int limit1 = s.nextInt();
		ArrayList<String> ar1 = new ArrayList<String>();
		for (int i = 0; i < limit1; i++) {
			String k = s.next();
			ar1.add(k);
		}
		System.out.println(ar1);

		System.out.println("enter the limit");
		int limit2 = s.nextInt();
		ArrayList<String> ar2 = new ArrayList<String>();
		for (int i = 0; i < limit2; i++) {
			String k = s.next();
			ar2.add(k);
		}
		System.out.println(ar2);

		ArrayList<String> ar3 = new ArrayList<String>();

		for (int i = 0; i < ar1.size(); i++) {
			StringBuffer sb = new StringBuffer(ar1.get(i));
			// System.out.println("ar1 -> "+ar1.get(i));
			if (sb.charAt(0) == 'a' || sb.charAt(0) == 'g') {

			} else {
				ar3.add(ar1.get(i));

			}
		}

		for (int i = 0; i < ar2.size(); i++) {
			StringBuffer sb = new StringBuffer(ar2.get(i));
			// System.out.println("ar1 -> "+ar2.get(i));
			int l = sb.length();

			if (sb.charAt(l - 1) == 'n' || sb.charAt(l - 1) == 'e') {

			} else {
				ar3.add(ar2.get(i));

			}
		}
		System.out.println("final arraylist is-> " + ar3);

	}

}
