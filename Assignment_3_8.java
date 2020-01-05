package Assignment_3;


import java.util.LinkedHashSet;
import java.util.Scanner;

public class Assignment_3_8 {

	public static void main(String[] args) {
		Assignment_3_8 obj=new Assignment_3_8();
		obj.delTwice();
	}
	
	public void delTwice() {
		Scanner s =new  Scanner(System.in);
		System.out.println("enter the string");
		String s1=s.nextLine();
		
		LinkedHashSet<Character> st=new LinkedHashSet<Character>();
		for(int i=0;i<s1.length();i++) {
		st.add(s1.charAt(i));
		
		}System.out.println(st);
		
		
	
		
		
		
	}

}
