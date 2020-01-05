package Assignment_3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignment_3_15 {

	public static void main(String[] args) {
		Assignment_3_15 obj=new  Assignment_3_15();
		obj.countWrd();

	}
	
	public void countWrd() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=s.nextLine();
		int count=0;
		
		StringTokenizer st=new StringTokenizer(s1," ");
		while(st.hasMoreElements()) {
			st.nextToken();
			count++;
		}
		System.out.println("count is-> "+count);
		
		
	}

}
