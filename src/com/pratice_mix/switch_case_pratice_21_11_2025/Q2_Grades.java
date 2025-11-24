package com.pratice_mix.switch_case_pratice_21_11_2025;

public class Q2_Grades {

	public static void main(String[] args) {

		System.out.println("Q2. Accept a grade (A, B, C, D, F) and print the remark using switch case.");
		System.out.println();

		char grade = 'A';

		switch (grade) {

		case 'A':
			System.out.println("=> Excellent");
			break;
		case 'B':
			System.out.println("=> Good");
			break;
		case 'C':
			System.out.println("=> Average");
			break;
		case 'D':
			System.out.println("=> Poor");
			break;
		case 'F':
			System.out.println("=> Fail");
			break;
		default:
			System.out.println("=> NOT FOUND ...! ");
		}
	}

}
