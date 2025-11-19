package com.switch_case;

public class Q1 {

	public static void main(String[] args) {

		System.out.println(
				"Q1. Write a Java program that takes an integer (1–7) and prints the corresponding day name (e.g., 1 → Monday)");
		System.out.println();

		int day = 6;

		switch (day) {

		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thusday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;

		default:
			System.out.println("NOT FOUND ...! ");
		}
	}
}
