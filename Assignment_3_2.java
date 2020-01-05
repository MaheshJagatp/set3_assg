package Assignment_3;

import java.util.HashMap;
import java.util.Scanner;

public class Assignment_3_2 {

	public static void main(String[] args) {
		
		Assignment_3_2 obj=new Assignment_3_2();
		obj.hashMap1();

	}public void hashMap1(){

	Scanner s =new Scanner(System.in);
	System.out.println("enter the limit");
	int l=s.nextInt();
	
	HashMap<String,String> hm =new HashMap<String,String>();
	
	for(int i=0;i<l;i++) {
		
		
		System.out.println("enetr values");
		String h2=s.next();
		String s1=h2;
		String sub=s1.substring(0,3).toUpperCase();
		
        hm.put(sub,h2);
		
				
       
		
	}System.out.println(hm);
	
}
}	

