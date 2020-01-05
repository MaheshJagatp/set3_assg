package Assignment_3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignment_3_39 {

	public static void main(String[] args) {

		Assignment_3_39 obj = new Assignment_3_39();
		obj.maxVowel();

	}

	public void maxVowel() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = s.nextLine();
		ArrayList<String> al = new ArrayList<String>();

		StringTokenizer st = new StringTokenizer(s1, " ");
		while (st.hasMoreElements()) {
			al.add(st.nextToken());

		} // System.out.println(al);

		String sb = " ";
		int count = 0, sub = 0;
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		for (int i = 0; i < al.size(); i++) {
			sb = al.get(i).toLowerCase();
			for (int j = 0; j < sb.length(); j++) {
				char c = sb.charAt(j);
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

					count++;
				}
			}
			al1.add(count);
			count = 0;

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
