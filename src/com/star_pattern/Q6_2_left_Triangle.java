package com.star_pattern;

public class Q6_2_left_Triangle {

	public static void main(String[] args) {
		
		  int rows = 4;  // number of rows
	        
	        for(int i = 1; i <= rows; i++) {
	            // print leading spaces
	            for(int s = rows - i; s > 0; s--) {
	                System.out.print("  ");
	            }
	            // print 2's
	            for(int j = 1; j <= i; j++) {
	                System.out.print("2 ");
	            }
	            System.out.println();
	        }

	}
}
