package Assignment_3;

import java.util.Scanner;

public class Assignment_3_45 {

	public static void main(String[] args) {
		Assignment_3_45 obj=new Assignment_3_45();
		obj.strOp();

	}
	
	public void strOp() {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=s.next();
		
		System.out.println("Enter the input");
		int input=s.nextInt();
		
		String sub1=s1.substring(0,input);
		String sub2=s1.substring(s1.length()-input, s1.length());
		
		String fin=sub1+sub2;
		System.out.println(fin);
		
		
		
	}
	

}
