package com.pratice_mix.if_else_23_11_2025;

public class Q4_CharacterType {

	public static void main(String[] args) {

		System.out.println("4) Accept a character and check if it is uppercase, lowercase, digit, or special:");
		char ch = 'A';
		if (ch >= 'A' && ch <= 'Z')
			System.out.println("Uppercase Letter");
		else if (ch >= 'a' && ch <= 'z')
			System.out.println("Lowercase Letter");
		else if (ch >= '0' && ch <= '9')
			System.out.println("Digit");
		else
			System.out.println("Special Character");
	}
}
