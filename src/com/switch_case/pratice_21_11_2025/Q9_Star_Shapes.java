package com.switch_case.pratice_21_11_2025;

public class Q9_Star_Shapes {
	public static void main(String[] args) {

		System.out.println(
				"Q9. Accept a number 1–5 and print the star pattern type (Square, Triangle, Pyramid, Diamond, Reverse Triangle).");
		System.out.println();

		int num = 1;

		switch (num) {
		case 1:
			System.out.println("Square Pattern");
			break;
		case 2:
			System.out.println("Triangle Pattern");
			break;
		case 3:
			System.out.println("Pyramid Pattern");
			break;
		case 4:
			System.out.println("Diamond Pattern");
			break;
		case 5:
			System.out.println("Reverse Triangle Pattern");
			break;
		default:
			System.out.println("Invalid pattern number");
		}
	}

}
