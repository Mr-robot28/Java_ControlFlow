package com.switch_case.pratice_21_11_2025;

public class Q3_Month_Days {

	public static void main(String[] args) {

		System.out.println("Q3. Accept a month number (1–12) and print how many days the month has.");
		System.out.println();

		int month = 2;

		switch (month) {

		case 1, 3, 5, 7, 8, 10, 12:

			System.out.println("31 Days");
			break;
		case 2:
			System.out.println("28 Days");
			break;
		case 4, 6, 9, 11:
			System.out.println("30 days");
			break;

		default:
			System.out.println("Invalid Month Number...! ");
		}
	}
}
