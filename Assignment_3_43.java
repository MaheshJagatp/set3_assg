package Assignment_3;

import java.util.Scanner;

public class Assignment_3_43 {

	public static void main(String[] args) {
		Assignment_3_43 obj=new Assignment_3_43();
		obj.colorCode();
		
		
	}

	public void colorCode() {
		Scanner s= new Scanner(System.in);
		System.out.println("enter color code");
		String s1=s.next();
		boolean a=false ,d=false;
		
		if(s1.length()==7) {
			if(s1.charAt(0)=='#') {
				a=true;
			}
			
		for(int i=1;i<s1.length();i++) {
			if(Character.isAlphabetic(s1.charAt(i))||Character.isDigit(s1.charAt(i))) {
			char c=s1.charAt(i);
				
			if(c>='a'&& c<='f'||c>='A'&& c<='F'|| c>=0||c<=9 ) {
					d=true;
			}	
			}
			}
		
		}else {
			System.out.println("Color code should be 7 in length");
		}
		if(a && d==true) {
			System.out.println("Acceptable");
		}else {
			System.out.println("Not Acceptable");
		}
		
		
		
	}
	
}


