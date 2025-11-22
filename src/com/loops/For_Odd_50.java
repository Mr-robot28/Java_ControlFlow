package com.loops;

public class For_Odd_50 {

	public static void main(String[] args) {

		System.out.println("Q4: Print all odd numbers between 1 and 50.");
		System.out.println();

		for (int i = 1; i <= 50; i++) {

			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}
