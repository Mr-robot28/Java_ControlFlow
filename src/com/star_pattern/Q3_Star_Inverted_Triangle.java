package com.star_pattern;

public class Q3_Star_Inverted_Triangle {

	public static void main(String[] args) {
		
		for (int i = 5; i >= 1; i--) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}

	}
}
