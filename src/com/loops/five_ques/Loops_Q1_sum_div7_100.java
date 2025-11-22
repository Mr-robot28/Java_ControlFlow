package com.loops.five_ques;

public class Loops_Q1_sum_div7_100 {

	public static void main(String[] args) {

		System.out.println("Q1: sum of number from 1-100 divisible by 7");
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("For");
		System.out.println();
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				sum = sum + i;
			}

		}
		System.out.println("=> sum = " + sum);

		System.out.println("----------------------------------------------------");
		System.out.println("while");
		System.out.println();

		int i = 1;
		int sum2 = 0;

		while (i <= 100) {
			if (i % 7 == 0) {
				sum2 = sum2 + i;
			}
			i++;
		}
		System.out.println("=> sum = " + sum);

		System.out.println("-------------------------------------------");
		System.out.println("Do-while");
		System.out.println();

		int i3 = 1;
		int sum3 = 0;

		do {
			if (i3 % 7 == 0) {
				sum3 = sum3 + i;

			}

		} while (i <= 100);
		System.out.println("=> sum = " + sum);
		

	}

}
