package com.break_continue;

public class $Continue_Q6 {

	
	public static void main(String[] args) {
		
		
		System.out.println("Q6: Print characters from A to Z but skip vowels");
		System.out.println();
		System.out.println("-----------------------------------------------------");

		// FOR
		System.out.println("For");
		System.out.println();

		for (char ch = 'A'; ch <= 'Z'; ch++) {
		    if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
		        continue;
		    }
		    System.out.println(ch);
		}

		System.out.println("-----------------------------------------------------");

		// WHILE
		System.out.println("While");
		System.out.println();

		char c2 = 'A';

		while (c2 <= 'Z') {
		    if (c2 == 'A' || c2 == 'E' || c2 == 'I' || c2 == 'O' || c2 == 'U') {
		        c2++;
		        continue;
		    }
		    System.out.println(c2);
		    c2++;
		}

		System.out.println("-----------------------------------------------------");

		// DO-WHILE
		System.out.println("Do-While");
		System.out.println();

		char c3 = 'A';

		do {
		    if (c3 == 'A' || c3 == 'E' || c3 == 'I' || c3 == 'O' || c3 == 'U') {
		        c3++;
		        continue;
		    }
		    System.out.println(c3);
		    c3++;
		} while (c3 <= 'Z');

		System.out.println("-----------------------------------------------------");

	}
}
