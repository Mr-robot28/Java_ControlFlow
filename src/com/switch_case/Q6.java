package com.switch_case;

public class Q6 {

	
	public static void main(String[] args) {
		
		System.out.println("Q6. Take a single character input and check whether it is a vowel or consonant using a switch statement.");
		System.out.println();
		
		char alph = 'd';

		switch (alph) {

		case 'a':
			System.out.println(alph + " is an Vowel");
			break;
		case 'e':
			System.out.println(alph + " is an Vowel");
			break;
		case 'i':
			System.out.println(alph + " is an Vowel");
			break;
		case 'o':
			System.out.println(alph + " is an Vowel");
			break;
		case 'u':
			System.out.println(alph + " is an Vowel");
			break;
		default:
			System.out.println(alph + " is an Consonant ...! ");
		}
	}
}
