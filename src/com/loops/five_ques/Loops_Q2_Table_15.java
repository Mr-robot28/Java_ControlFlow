package com.loops.five_ques;

public class Loops_Q2_Table_15 {

	public static void main(String[] args) {

		System.out.println("Q2: Print the table of 15 by using (3 loops ");
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println("For");
		System.out.println();

		for (int i = 1; i <= 10; i++) {
			System.out.println("15 ✖️ " + i + " = " + (15 * i));

		}
		System.out.println("-----------------------------------------");
		System.out.println("While");
		System.out.println();

		int i = 1;
		while (i <= 10) {
			System.out.println("15 ✖️ " + i + " = " + (15 * i));
			i++;

		}
		System.out.println("--------------------------------------------");
		System.out.println("Do - While");
		System.out.println();
		int a = 1;

		do {
			System.out.println("15 ✖️ " + a + " = " + (15 * a));
			a++;

		} while (a <= 10);

	}
}
