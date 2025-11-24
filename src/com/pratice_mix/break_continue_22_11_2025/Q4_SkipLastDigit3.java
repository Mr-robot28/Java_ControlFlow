package com.pratice_mix.break_continue_22_11_2025;

public class Q4_SkipLastDigit3 {

	public static void main(String[] args) {
		System.out.println("4) Print numbers from 1 to 200 but skip numbers whose last digit is 3:");
		for (int i = 1; i <= 200; i++) {
			if (i % 10 == 3)
				continue;
			System.out.println(i);
		}
	}
}
