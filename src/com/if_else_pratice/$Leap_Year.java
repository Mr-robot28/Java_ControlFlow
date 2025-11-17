package com.if_else_pratice;

public class $Leap_Year {
public static void main(String[] args) {
	
	System.out.println("Q5: Write a program to check whether a given year is leap year or not.");
		
		int year = 2500;
		if (year % 4 == 0 || year % 400 == 0 || year % 100 == 0) {
			System.out.println("This is an Leap Year...!");
			
		}else {
			System.out.println("This is not a Leap Year...!");
		}
	}
}
