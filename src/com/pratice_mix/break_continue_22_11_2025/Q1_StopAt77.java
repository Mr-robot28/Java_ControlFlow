package com.pratice_mix.break_continue_22_11_2025;

public class Q1_StopAt77 {
	public static void main(String[] args) {

		System.out.println("1) Print numbers from 1 to 100 but stop when the number reaches 77:");
		for (int i = 1; i <= 100; i++) {
			if (i == 77)
				break;
			System.out.println(i);
		}

	}

}
