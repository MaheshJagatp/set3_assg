package Assignment_3;

import java.util.Scanner;

public class Assignment_3_11 {

	public static void main(String[] args) {
		Assignment_3_11 obj=new Assignment_3_11();
		obj.arrayOp();

	}
	public void arrayOp() {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=s.nextLine();
		String s2="";
		//System.out.println(s1);
		for(int i=0;i<=s1.length();i++) {
			if(i%2==0) {
				s2=s2+s1.charAt(i);
				
			}
		}System.out.println(s2);
		
		
	}

}
