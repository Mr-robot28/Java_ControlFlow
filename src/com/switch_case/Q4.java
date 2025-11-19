package com.switch_case;

public class Q4 {

	public static void main(String[] args) {

		System.out.println("Q:4. Take a grade character (A, B, C, D, F) as input and print a message:");
		System.out.println();

		char grade = 'A';

		switch (grade) {

		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Average");
			break;
		case 'D':
			System.out.println("Poor");
			break;
		case 'F':
			System.out.println("Fail");
			break;
		default:
			System.out.println("NOT FOUND ...! ");
		}
	}

}
