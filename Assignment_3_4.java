package Assignment_3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignment_3_4 {

	public static void main(String[] args) {
		Assignment_3_4 obj=new Assignment_3_4();
		obj.validation();

	}
	
	public void validation() {
		Scanner s =new Scanner(System.in);
		System.out.println("enter the Email-id");
		String smain=s.nextLine();
		boolean a=false,b=false,c=false,d=false;
		try {
			StringTokenizer st=new StringTokenizer(smain,"@");
			String s1=st.nextToken();
			String s2=st.nextToken();
			
			StringTokenizer st1=new StringTokenizer(s2,".");
		
			String s3=st1.nextToken();
			String s4=st1.nextToken();
			if(s1.length()>=3) 
				a=true;
			if(s3.length()==5)
				b=true;
			if(s4.equals("com"))
				c=true;
			
			if(s2.indexOf('@')==s2.lastIndexOf('@')&&s2.indexOf('.')==s2.lastIndexOf('.'))
			d=true;
				
			
		}
		catch(Exception e1) {
			
			
		}
		if(a && b && c && d==true) {
			System.out.println("correct mail-id");
		}else {
			System.out.println("Invalid Email id");
		}
		
	}

}
