package com.pratice_mix.if_else_23_11_2025;

public class Q6_TimeGreeting {

	public static void main(String[] args) {

		System.out.println("6) Accept time in 24-hour format and print greeting:");
		int t = 15;
		if (t <= 11)
			System.out.println("Good Morning");
		else if (t <= 16)
			System.out.println("Good Afternoon");
		else if (t <= 20)
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");
	}

}
