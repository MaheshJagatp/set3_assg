package Assignment_3;

import java.util.Scanner;

public class Assignment_3_5 {

	public static void main(String[] args) {
		Assignment_3_5 obj=new Assignment_3_5();
		obj.squareRoot();

	}
	
	public void squareRoot() {
		
		Scanner s =new Scanner(System.in);
		System.out.println("enter the value of x1");
		int x1=s.nextInt();
		System.out.println("enter the value of x2");
		int x2=s.nextInt();
		System.out.println("enter the value of y1");
		int y1=s.nextInt();
		System.out.println("enter the value of y2");
		int y2=s.nextInt();
		
		int result1=(x1+x2)*(x1+x2);
		//System.out.println(result1);
		int result2=(y1+y2)*(y1+y2);
		//System.out.println(result2);
		int result=result1+result2;
		System.out.println(result);
		System.out.println("Square root is-> "+Math.sqrt(result));
		
		
/*		double temp;

		double sr = result / 2;

		do {
			temp = sr;
			sr = (temp + (result / temp)) / 2;
		} while ((temp - sr) != 0);

		System.out.println("Square root is-> "+sr);
	  */
		
		
		
	
	}

}
