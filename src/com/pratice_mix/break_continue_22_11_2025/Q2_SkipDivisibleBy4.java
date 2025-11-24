package com.pratice_mix.break_continue_22_11_2025;

public class Q2_SkipDivisibleBy4 {

	public static void main(String[] args) {
		System.out.println("2) Print numbers from 1 to 50 but skip numbers divisible by 4:");
		for (int i = 1; i <= 50; i++) {
			if (i % 4 == 0)
				continue;
			System.out.println(i);
		}
	}
}
