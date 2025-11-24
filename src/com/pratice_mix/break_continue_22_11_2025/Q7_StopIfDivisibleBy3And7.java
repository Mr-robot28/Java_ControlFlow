package com.pratice_mix.break_continue_22_11_2025;

public class Q7_StopIfDivisibleBy3And7 {

	public static void main(String[] args) {

		System.out.println("7) Print numbers from 1 to 100 but stop if a number is divisible by both 3 and 7:");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 7 == 0)
				break;
			System.out.println(i);
		}
	}
}
