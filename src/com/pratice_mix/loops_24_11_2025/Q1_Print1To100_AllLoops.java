package com.pratice_mix.loops_24_11_2025;

public class Q1_Print1To100_AllLoops {

	public static void main(String[] args) {

		System.out.println("Q1) Print all numbers from 1 to 100 using for, while, and do-while loops:\n");

		System.out.println("-- for loop --\n");

		for (int i = 1; i <= 100; i++) {

			System.out.println(i);
		}

		System.out.println("\n-- while loop --\n");

		int i2 = 1;
		while (i2 <= 100) {

			System.out.println(i2);
			i2++;
		}

		System.out.println("\n-- do-while loop --\n");
		int i3 = 1;
		do {
			System.out.println(i3);
			i3++;
		} while (i3 <= 100);

	}

}
