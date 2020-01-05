package Assignment_3;

import java.time.Year;
import java.util.Scanner;

public class Assignment_3_48 {

	public static void main(String[] args) {
		Assignment_3_48 obj = new Assignment_3_48();
		obj.leopOrNot();

	}

	public void leopOrNot() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the year");
		int i = s.nextInt();
		Year y = Year.of(i);
		boolean b = y.isLeap();
		if (b == true) {
			System.out.println("Leap year");
		} else {
			System.out.println("Not a leap year");
		}

	}

}
