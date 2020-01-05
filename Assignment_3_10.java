package Assignment_3;

import java.util.Scanner;

public class Assignment_3_10 {

	public static void main(String[] args) {
		Assignment_3_10 obj=new Assignment_3_10();
		obj.skipNum();
	}
	
	public void skipNum() {
		
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("first input");
		int x1=s.nextInt();
		System.out.println("second input");
		int x2=s.nextInt();
		System.out.println("third input");
		int x3=s.nextInt();
		if(x3==13) {
			sum=sum+x1+x2;
			System.out.println(sum);
		}
		else if(x2==13) {
			sum=sum+x1;
			System.out.println(sum);
				}
		
		else if(x1==13) {
			sum=sum+x3;
			System.out.println(sum);
		}else {
			sum=x1+x2+x3;
			System.out.println(sum);
		}
		
		
	}

}
