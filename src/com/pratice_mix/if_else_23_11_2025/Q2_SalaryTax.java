package com.pratice_mix.if_else_23_11_2025;

public class Q2_SalaryTax {
	public static void main(String[] args) {

		System.out.println("2) Accept salary and apply tax:");
		int sal = 75000;
		if (sal < 50000)
			System.out.println("No Tax");
		else if (sal <= 100000)
			System.out.println("10% Tax");
		else
			System.out.println("20% Tax");
	}

}
