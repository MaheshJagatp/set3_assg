package Assignment_3;

import java.util.Scanner;

public class Assignment_3_19 {

	public static void main(String[] args) {
		Assignment_3_19 obj = new Assignment_3_19();
		obj.repOp();
	}

	public void repOp() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter input first");
		int input1 = s.nextInt();
		System.out.println("Enter second first");
		int input2 = s.nextInt();
		System.out.println("Enter third first");
		int input3 = s.nextInt();

		if (input1 == input2 && input1 == input3) {
			System.out.println("all are matched");
		} else if (input1 == input2) {
			System.out.println(input3);
		} else if (input1 == input3) {
			System.out.println(input2);
		} else if (input2 == input3) {
			System.out.println(input1);
		}

		else {
			int sum = input1 + input2 + input3;
			System.out.println(sum);
		}

	}

}
