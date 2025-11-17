package com.controlflow_statments;

public class Leap_Year_Pratice {

	public static void main(String[] args) {
		
		int year = 2500;
		if (year % 4 == 0 || year % 400 == 0 || year % 100 == 0) {
			System.out.println("This is an Leap Year...!");
			
		}else {
			System.out.println("This is not a Leap Year...!");
		}
	}
}
