package com.break_continue;

public class $Break_Q1 {

	public static void main(String[] args) {

		// Q1: Print numbers from 1 to 50 but stop when number becomes 25
		System.out.println("Q1: Print numbers from 1 to 50 but stop when number becomes 25");
		System.out.println();
		System.out.println("-----------------------------------------------------");


		// ------------------ FOR LOOP ------------------
		System.out.println("For");
		System.out.println();

		for (int i = 1; i <= 50; i++) {
		    if (i == 25) {
		        break;
		    }
		    System.out.println(i);
		}

		System.out.println("-----------------------------------------------------");


		// ------------------ WHILE LOOP ------------------
		System.out.println("While");
		System.out.println();

		int i2 = 1;

		while (i2 <= 50) {
		    if (i2 == 25) {
		        break;
		    }
		    System.out.println(i2);
		    i2++;
		}

		System.out.println("-----------------------------------------------------");


		// ------------------ DO-WHILE LOOP ------------------
		System.out.println("Do-While");
		System.out.println();

		int i3 = 1;

		do {
		    if (i3 == 25) {
		        break;
		    }
		    System.out.println(i3);
		    i3++;
		} while (i3 <= 50);

		System.out.println("-----------------------------------------------------");


	}
}
