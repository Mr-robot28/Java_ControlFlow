package com.pratice_mix.loops_24_11_2025;

public class Q8_DivisibleBy3And5 {

	public static void main(String[] args) {
		System.out.println("Q8) Print all numbers divisible by 3 and 5 between 1 and 150:");
		for (int i = 1; i <= 150; i++) {
			
			if (i % 3 == 0 && i % 5 == 0)
				
				System.out.println(i);
		}

	}
}
