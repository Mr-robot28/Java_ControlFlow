package com.pratice_mix.break_continue_22_11_2025;

public class Q9_SkipDivisibleBy3_StopAt70 {

	public static void main(String[] args) {

		System.out.println("9) Print numbers 1 to 100 but skip numbers divisible by 3 and stop when number becomes 70:");
		for (int i = 1; i <= 100; i++) {
			if (i == 70)
				break;
			if (i % 3 == 0)
				continue;
			System.out.println(i);
		}
	}

}
