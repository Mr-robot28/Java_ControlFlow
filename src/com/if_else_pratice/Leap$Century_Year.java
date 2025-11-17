package com.if_else_pratice;

public class Leap$Century_Year {

	public static void main(String[] args) {
		 
		System.out.println("Q: Write a program to check if a year is leap year, and if leap, check if it’s a century year.");
		System.out.println();
		int year = 2000;
		System.out.println("year = " + year);
		System.out.println();
		if (year % 400 == 0) {
		    System.out.println("=> Leap year and Century year");
		}
		else if (year % 100 == 0) {
		    System.out.println("=> Century year but NOT a leap year");
		}
		else if (year % 4 == 0) {
		    System.out.println("=> Leap year but NOT a century year");
		}
		else {
		    System.out.println("=> Not a leap year");
		}

	}
}
