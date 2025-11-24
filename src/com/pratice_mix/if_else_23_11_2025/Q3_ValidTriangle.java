package com.pratice_mix.if_else_23_11_2025;

public class Q3_ValidTriangle {
	public static void main(String[] args) {

		System.out.println("3) Accept 3 sides and check if triangle is valid:");
		int a = 5, b = 6, c = 7;
		if (a + b > c && b + c > a && a + c > b)
			System.out.println("Valid Triangle");
		else
			System.out.println("Invalid Triangle");
	}

}
