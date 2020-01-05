package Assignment_3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Assignment_3_23 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the limit");
		int l = s.nextInt();

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		HashMap<String, String> hm1 = new HashMap<String, String>();
		for (int i = 0; i < l; i++) {

			System.out.println("enetr Key");
			String h1 = s.next();
			System.out.println("enetr values");
			int h2 = s.nextInt();
			hm.put(h1, h2);

		}
		System.out.println(hm);

		String s1 = new String();
		String s2 = new String();
		int n = 0;
		Iterator<String> i = hm.keySet().iterator();
		while (i.hasNext()) {

			s1 = i.next();
			n = hm.get(s1);
			if (n >= 60) {
				s2 = "pass";
			} else {
				s2 = "fail";
			}
			hm1.put(s1, s2);
		}
		System.out.println(hm1);

	}

}
