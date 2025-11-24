package com.pratice_mix.loops_24_11_2025;

public class Q3_SumOfDigits {

	public static void main(String[] args) {

		System.out.println("Q3) Print the sum of digits of number 487 using while loop:");

		int i = 487;
		int sum = 0;

		while (i > 0) {
			sum = sum + i % 10; // add last digit
			i = i / 10; // remove last digit
		}

		System.out.println(sum);

	}

}
