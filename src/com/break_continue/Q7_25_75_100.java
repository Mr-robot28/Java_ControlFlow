package com.break_continue;

public class Q7_25_75_100 {

	public static void main(String[] args) {

		// print 1 to 25
		for (int i = 1; i <= 100; i++) {
			if (i == 26) {
				break; // stop the loop
			}
			System.out.println(i);
		}

		// print 75 to 100
		for (int i = 1; i <= 100; i++) {
			if (i < 75) {
				continue; // skip 1 to 74
			}
			System.out.println(i);
		}
	}
}
