package com.break_continue;

public class $Break_Q3 {
	
	public static void main(String[] args) {
		
		System.out.println("Q3: Print table of 9 but stop when product becomes more than 50");
		System.out.println();
		System.out.println("-----------------------------------------------------");

		// FOR
		System.out.println("For");
		System.out.println();

		for (int i = 1; i <= 10; i++) {
		    int product = 9 * i;
		    if (product > 50) {
		        break;
		    }
		    System.out.println(product);
		}

		System.out.println("-----------------------------------------------------");

		// WHILE
		System.out.println("While");
		System.out.println();

		int i2 = 1;

		while (i2 <= 10) {
		    int product = 9 * i2;
		    if (product > 50) {
		        break;
		    }
		    System.out.println(product);
		    i2++;
		}

		System.out.println("-----------------------------------------------------");

		// DO-WHILE
		System.out.println("Do-While");
		System.out.println();

		int i3 = 1;

		do {
		    int product = 9 * i3;
		    if (product > 50) {
		        break;
		    }
		    System.out.println(product);
		    i3++;
		} while (i3 <= 10);

		System.out.println("-----------------------------------------------------");

	}

}
