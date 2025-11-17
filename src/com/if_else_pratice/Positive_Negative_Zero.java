package com.if_else_pratice;

public class Positive_Negative_Zero {

	public static void main(String[] args) {
		
		System.out.println("Write a program to check whether a number is positive, negative, or zero.");
		System.out.println();
		int num = 0;
		
		if (num > 0) {
			System.out.println( num + " is positive.");
		}else if (num < 0) {
			System.out.println( num + " is Negative.");
		}else {
			System.out.println("It's Zero.");
		}
	}
}
