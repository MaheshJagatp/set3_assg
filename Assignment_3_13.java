package Assignment_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment_3_13 {

	public static void main(String[] args) {
		Assignment_3_13 obj = new Assignment_3_13();
		obj.notInBothList();

	}

	public void notInBothList() {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the limit for first arraylist");
		int l1 = s.nextInt();
		System.out.println("Enter the values");
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < l1; i++) {
			int k = s.nextInt();
			al.add(k);
		}
		System.out.println(al);

		ArrayList<Integer> al3 = new ArrayList<Integer>();

		System.out.println("Enter the limit for Second arraylist");
		int l2 = s.nextInt();
		System.out.println("Enter the values");
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		for (int i = 0; i < l2; i++) {
			int k = s.nextInt();
			al2.add(k);
		}
		System.out.println(al2);

		for(int i=0;i<al.size();i++) {
			for(int j=0;j<al2.size();j++) {
				if(al.get(i) == al2.get(j)) {
					
					
				}
				
			}
			
		}

	}

}
