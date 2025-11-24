package com.pratice_mix.if_else_23_11_2025;

public class Q7_NearestTo100 {

	public static void main(String[] args) {

		System.out.println("7) Accept two numbers and print which is nearer to 100:");
		int x = 90, y = 105;
		if (Math.abs(100 - x) < Math.abs(100 - y))
			System.out.println(x + " is nearer to 100");
		else
			System.out.println(y + " is nearer to 100");

	}

}
