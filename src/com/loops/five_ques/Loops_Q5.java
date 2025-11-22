package com.loops.five_ques;

public class Loops_Q5 {

	public static void main(String[] args) {

		System.out.println("Q5: Print the sum of digits of all numbers from 1 to 50.");
		System.out.println();

		System.out.println("_________________________________");
		System.out.println("For");
		System.out.println();
		int sum1 = 0;
		for (int i1 = 1; i1 <= 50; i1++) {

			sum1 = sum1 + i1;

		}
		System.out.println("sum = " + sum1);

		System.out.println("_________________________________");
		System.out.println("While");
		System.out.println();
		int i2 = 1;
		int sum2 = 0;

		while (i2 <= 50) {
			sum2 = sum2 + i2;

			i2++;

		}
		System.out.println("sum = " + sum1);

		System.out.println("_________________________________");
		System.out.println("Do-While");
		System.out.println();
		int i3 = 1;
        int sum3 = 0;
		do {
			sum3 = sum3 + i3;
			i3++;
		} while (i3 <= 50);
		
		System.out.println("sum = " + sum3);
	}

}
