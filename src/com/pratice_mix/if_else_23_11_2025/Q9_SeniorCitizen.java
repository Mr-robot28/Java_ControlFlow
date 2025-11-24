package com.pratice_mix.if_else_23_11_2025;

public class Q9_SeniorCitizen {

	public static void main(String[] args) {
		System.out.println("9) Accept age and gender and check senior citizen category:");
		int age = 65;
		char g = 'F';
		if (age > 60 && g == 'F')
			System.out.println("Senior Woman Citizen");
		else if (age > 60 && g == 'M')
			System.out.println("Senior Man Citizen");
		else
			System.out.println("Not a Senior Citizen");
	}

}
