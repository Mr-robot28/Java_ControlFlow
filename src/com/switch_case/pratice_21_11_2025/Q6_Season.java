package com.switch_case.pratice_21_11_2025;

public class Q6_Season {

	public static void main(String[] args) {

		System.out.println(
				"Q6. Accept a number between 1–4 and print the corresponding season:");
		System.out.println();

		int num = 2;

		switch (num) {

		case 1:
			System.out.println("Summer");
			break;
		case 2:
			System.out.println("Rainy");
			break;
		case 3:
			System.out.println("Winter");
			break;
		case 4:
			System.out.println("Spring");
			break;

		default:
			System.out.println("NOT FOUND ...! ");
		}
	}

}
