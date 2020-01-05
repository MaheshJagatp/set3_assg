package Assignment_3;

import java.util.Scanner;

public class Assignment_3_46 {

	public static void main(String[] args) {
		Assignment_3_46 obj=new Assignment_3_46();
		obj.equalOrNot();
	}
	
	public void equalOrNot() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter first input");
		String s1=s.next().toLowerCase();
		
		System.out.println("Enter Second input");
		String s2=s.next().toLowerCase();
	
		System.out.println("enter the input");
		int i=s.nextInt();
		
		if(s1.charAt(i-1)==s2.charAt(s2.length()-i)) {
			System.out.println("Equal");
		}else {
			System.out.println("not equal");
		}
		
	}

}
