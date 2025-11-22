package com.break_continue;

public class $Continue_Q4 {

	
	public static void main(String[] args) {
		
		System.out.println("Q4: Print numbers from 1 to 50 but skip numbers divisible by 7");
		System.out.println();
		System.out.println("-----------------------------------------------------");

		// FOR
		System.out.println("For");
		System.out.println();

		for (int i = 1; i <= 50; i++) {
		    if (i % 7 == 0) {
		        continue;
		    }
		    System.out.println(i);
		}

		System.out.println("-----------------------------------------------------");

		// WHILE
		System.out.println("While");
		System.out.println();

		int i2 = 1;

		while (i2 <= 50) {
		    if (i2 % 7 == 0) {
		        i2++;
		        continue;
		    }
		    System.out.println(i2);
		    i2++;
		}

		System.out.println("-----------------------------------------------------");

		// DO-WHILE
		System.out.println("Do-While");
		System.out.println();

		int i3 = 1;

		do {
		    if (i3 % 7 == 0) {
		        i3++;
		        continue;
		    }
		    System.out.println(i3);
		    i3++;
		} while (i3 <= 50);

		System.out.println("-----------------------------------------------------");

	}
}
