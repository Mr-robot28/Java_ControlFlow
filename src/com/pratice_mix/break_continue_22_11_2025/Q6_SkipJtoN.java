package com.pratice_mix.break_continue_22_11_2025;

public class Q6_SkipJtoN {

	public static void main(String[] args) {
		System.out.println("6) Print all characters from A to Z but skip the letters from J to N:");
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c >= 'J' && c <= 'N')
				continue;
			System.out.println(c);
		}

	}
}
