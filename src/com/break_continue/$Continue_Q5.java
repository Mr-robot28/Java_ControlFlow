package com.break_continue;

public class $Continue_Q5 {
	
	public static void main(String[] args) {
		
		System.out.println("Q5: Print numbers from 1 to 100 but skip numbers ending with 5");
		System.out.println();
		System.out.println("-----------------------------------------------------");

		// FOR
		System.out.println("For");
		System.out.println();

		for (int i = 1; i <= 100; i++) {
		    if (i % 10 == 5) {
		        continue;
		    }
		    System.out.println(i);
		}

		System.out.println("-----------------------------------------------------");

		// WHILE
		System.out.println("While");
		System.out.println();

		int i2 = 1;

		while (i2 <= 100) {
		    if (i2 % 10 == 5) {
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
		    if (i3 % 10 == 5) {
		        i3++;
		        continue;
		    }
		    System.out.println(i3);
		    i3++;
		} while (i3 <= 100);

		System.out.println("-----------------------------------------------------");

	}

}
