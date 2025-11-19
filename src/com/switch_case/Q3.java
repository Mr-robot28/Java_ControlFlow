package com.switch_case;

public class Q3 {
	
	public static void main(String[] args) {
		
		System.out.println("Q3. Accept two numbers and an operator (+, -, *, /) from the user and perform the operation using a switch case.");
		System.out.println();
		
		char operation = '/';

		switch (operation) {

		case '+':
			int a = 3, b = 4;
			System.out.println("Addition of " + a + " + " + b + "  is = " + (a + b));
			break;

		case '-':
			int c = 3, d = 4;
			System.out.println("Sub of " + c + " + " + d + "  is = " + (c - d));
			break;
		case '*':
			int e = 3, f = 4;
			System.out.println("Multi of " + e + " + " + f + "  is = " + (e * f));
			break;
		case '/':
			int g = 6, h = 3;
			System.out.println("Div of " + g + " + " + h + "  is = " + (g / h));
			break;
		case '%':
			int i = 3, j = 4;
			System.out.println("Mod of " + i + " + " + j + "  is = " + (i + j));
			break;
		default:

			System.out.println("Invalid Operation...!");

		}
	}

}
