package com.pratice_mix.if_else_23_11_2025;

public class Q1_MultipleOf5And11 {
	public static void main(String[] args) {

		System.out.println("1) Accept a number and check whether it is a multiple of 5 and 11 or not:");
		int n = 55;
		if (n % 5 == 0 && n % 11 == 0)
			System.out.println("Yes, multiple of both");
		else
			System.out.println("No");
	}

}
