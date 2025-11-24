package com.pratice_mix.loops_24_11_2025;

public class Q6_Factorial_DoWhile {

	public static void main(String[] args) {

		System.out.println("Q6) Print factorial of number 5 using do-while loop:\n");

		int n = 5;
		int fact = 1;
		int i = 1;

		do {
			fact = fact * i; // multiply fact by current number
			i++; // move to next number
		} while (i <= n);

		System.out.println(fact);

	}
}
