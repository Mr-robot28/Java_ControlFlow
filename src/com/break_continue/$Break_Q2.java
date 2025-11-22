package com.break_continue;

public class $Break_Q2 {

	public static void main(String[] args) {

		System.out.println("Q: Print even numbers from 2 to 100 but stop when an odd number appears");
		System.out.println();
		System.out.println("-----------------------------------------------------");


		// FOR LOOP
		System.out.println("For");
		System.out.println();

		for (int i = 2; i <= 100; i++) {
		    if (i % 2 == 0) {
		        System.out.println(i);
		    } else {
		        break;
		    }
		}

		System.out.println("-----------------------------------------------------");


		// WHILE LOOP
		System.out.println("While");
		System.out.println();

		int i2 = 2;

		while (i2 <= 100) {
		    if (i2 % 2 == 0) {
		        System.out.println(i2);
		    } else {
		        break;
		    }
		    i2++;
		}

		System.out.println("-----------------------------------------------------");


		// DO-WHILE LOOP
		System.out.println("Do-While");
		System.out.println();

		int i3 = 2;

		do {
		    if (i3 % 2 == 0) {
		        System.out.println(i3);
		    } else {
		        break;
		    }
		    i3++;
		} while (i3 <= 100);

		System.out.println("-----------------------------------------------------");

	}

}
