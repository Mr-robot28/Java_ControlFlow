package com.pratice_mix.if_else_23_11_2025;

public class Q10_SeasonByMonth {
	public static void main(String[] args) {

		System.out.println("10) Accept month number and print season:");

		int m = 8;

		if (m >= 3 && m <= 6) {
			System.out.println("Summer Season");
		} else if (m >= 7 && m <= 10) {
			System.out.println("Rainy Season");
		} else {
			System.out.println("Winter Season");
		}
	}

}
