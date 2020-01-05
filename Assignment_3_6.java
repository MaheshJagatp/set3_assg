package Assignment_3;

import java.util.HashMap;
import java.util.Scanner;

public class Assignment_3_6 {

	public static void main(String[] args) {
		Assignment_3_6 obj= new Assignment_3_6();
		obj.hashMap1();

	}
	public void hashMap1(){

		Scanner s =new Scanner(System.in);
		System.out.println("enter the limit");
		int l=s.nextInt();
		
		HashMap<String,String> hm =new HashMap<String,String>();
		
		for(int i=0;i<l;i++) {
			System.out.println("Enter key");
			String h1=s.next();
			System.out.println("enetr values");
			String h2=s.next();
			hm.put(h1,h2);
		
			
			
		}System.out.println(hm);
		System.out.println("Enter the values to be key search");
		String k =s.next();
		System.out.println(hm.get(k));
		
	}	

}
