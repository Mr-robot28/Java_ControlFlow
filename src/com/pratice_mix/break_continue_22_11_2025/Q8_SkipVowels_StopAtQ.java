package com.pratice_mix.break_continue_22_11_2025;

public class Q8_SkipVowels_StopAtQ {

	public static void main(String[] args) {

		System.out.println("8) Print characters A–Z but skip vowels and stop when you reach 'Q':");
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c == 'Q')
				break;
			if ("AEIOU".indexOf(c) != -1)
				continue;
			System.out.println(c);
		}
	}

}
