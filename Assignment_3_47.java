package Assignment_3;

import java.util.Scanner;

public class Assignment_3_47 {

	public static void main(String[] args) {
		Assignment_3_47 obj = new Assignment_3_47();

		obj.addElement();

	}

	public void addElement() {
		int sum = 0, sum1 = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int i = s.nextInt();
		while (i != 0) {
			sum = sum + i % 10;
			i = i / 10;

		}

		while (sum > 10 || sum != 0) {
			sum1 = sum1 + sum % 10;
			sum = sum / 10;
		}
		System.out.println("sum is-> " + sum1);
	}

}
