package Assignment_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignment_3_17 {

	public static void main(String[] args) {

		Assignment_3_17 obj = new Assignment_3_17();
		obj.strOp();
	}

	public void strOp() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string ");
		String s1 = s.nextLine();
		System.out.println("Enter input");
		String s2 = s.next();

		ArrayList<String> al = new ArrayList<String>();

		StringTokenizer st = new StringTokenizer(s1, s2);
		while (st.hasMoreElements()) {
			al.add(st.nextToken());

		}
		System.out.println(al);

		String[] array = new String[al.size()];
		for (int i = 0; i < al.size(); i++) {

			StringBuffer sb = new StringBuffer(al.get(i).toLowerCase());
			sb.reverse();
			array[i] = sb.toString();

		}
		System.out.println(Arrays.toString(array));

	}

}
