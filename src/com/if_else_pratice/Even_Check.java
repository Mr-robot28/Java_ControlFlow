package com.if_else_pratice;

public class Even_Check {
	public static void main(String[] args) {
		int num = 52;
		
		if (num % 2 == 0) {
			System.out.println(num + " is Even Number.");
			
			if (num > 50) {
				System.out.println(num + " is also Greater than 50.");
			}else {
				System.out.println(num + " is Not Greater than 50.");
			}
		}else {
			System.out.println(num + " is an Odd Number.");
		}
	}

}
