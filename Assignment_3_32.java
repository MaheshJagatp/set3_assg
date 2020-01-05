package Assignment_3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignment_3_32 {

	public static void main(String[] args) {
		Assignment_3_32 obj = new Assignment_3_32();
		obj.maxWord();

	}

	public void maxWord() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = s.nextLine();
		ArrayList<String> al = new ArrayList<String>();

		StringTokenizer st = new StringTokenizer(s1, " ");
		while (st.hasMoreElements()) {
			al.add(st.nextToken());

		}
		System.out.println(al);

		ArrayList<Integer> al1 = new ArrayList<Integer>();
		String sb = "";
		for (int i = 0; i < al.size(); i++) {
			sb = al.get(i);
			int ele = sb.length();
			al1.add(ele);
		}
		 System.out.println(al1);

		String temp = "";
		int max = 0;
		for (int i = 0; i < al.size(); i++) {

			if (al1.get(i) > max) {
				max = al1.get(i);
				temp = al.get(i);
			}
		}
		System.out.println(temp);

	}

}
