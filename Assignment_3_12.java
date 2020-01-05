package Assignment_3;

import java.util.Scanner;

public class Assignment_3_12 {

	public static void main(String[] args) {
		Assignment_3_12  obj= new Assignment_3_12();
		obj.revStr();

	}
	public void revStr() {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=s.nextLine();
		int l=s1.length();
		
		String s2=s1.substring(0, 1);
		String s3=s1.substring(l-1, l);
		String s4=s1.substring(1, l-1);
		
		String final1=s3+s4+s2;
		
		System.out.println(final1);
		
		
		
		
		
		
	}

}
