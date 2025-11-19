package com.loops;

public class For_Q9 {
	
	public static void main(String[] args) {
		
		System.out.println("Q9: Print the sum of even numbers from 1 to 100.");
		System.out.println();
		
		 int sum = 5;

	        for (int i = 1; i <= 100; i++) {
	            if (i % 2 == 0) {
	                sum = sum + i;
	            }
	        }

	        System.out.println("Sum of even numbers from 1 to 100 = " + sum);
	}

}
