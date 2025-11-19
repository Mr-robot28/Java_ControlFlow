package com.switch_case;

public class Q7 {
	
	public static void main(String[] args) {
		
		System.out.println("Q7. Use a switch statement to check if a number is even or odd (hint: use number % 2 as the expression)");
		System.out.println();
		
		int num = 2;
        

        switch (num % 2) {
            case 0:
                System.out.println(num + " is Even");
                break;

            case 1:
                System.out.println(num + " is Odd");
                break;
        }
	}

}
