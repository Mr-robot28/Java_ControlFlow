package com.pratice_mix.loops_24_11_2025;

public class Q2_TableOf7_AllLoops {

	public static void main(String[] args) {

		System.out.println("Q2) Print the multiplication table of 7 using for, while, and do-while loops:\n");

		System.out.println("\n-- for loop --\n");

		for (int i = 1; i <= 10; i++) {
			System.out.println(7 * i);
		}

		System.out.println("\n-- while loop --\n");
		int i2 = 1;
		while (i2 <= 10) {
			System.out.println(7 * i2);
			i2++;
		}

		System.out.println("\n-- do-while loop --\n");
		int i3 = 1;
		do {
			System.out.println(7 * i3);
			i3++;
		} while (i3 <= 10);
	}

}
