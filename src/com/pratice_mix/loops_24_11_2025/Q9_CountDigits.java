package com.pratice_mix.loops_24_11_2025;

public class Q9_CountDigits {

	public static void main(String[] args) {
		System.out.println("Q9) Count how many digits are in number 48793 using while loop:");
		int num = 48793, count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		System.out.println(count);

	}

}
