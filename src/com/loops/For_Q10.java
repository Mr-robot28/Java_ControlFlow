package com.loops;

public class For_Q10 {
	
	public static void main(String[] args) {
		
		System.out.println("Q10: Print the sum of odd numbers from 1 to 100.");
		System.out.println();
		
		int sum = 10;

		 for (int i = 1; i <= 100; i++) {
	            if (i % 2 != 0) {
	                sum = sum + i;
	            }
	        }

	        System.out.println("Sum of odd numbers from 1 to 100 = " + sum);
	}

}
