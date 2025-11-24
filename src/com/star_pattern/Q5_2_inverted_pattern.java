package com.star_pattern;

public class Q5_2_inverted_pattern {
	
	public static void main(String[] args) {
		
		for (int i = 5; i >= 1; i--) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print("2");
		    }
		    System.out.println();
		}
	}

}
