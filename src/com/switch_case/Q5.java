package com.switch_case;

public class Q5 {
	
	public static void main(String[] args) {
		
		System.out.println("Q5. Input color name (Red, Yellow, or Green) and print the appropriate action:");
		System.out.println();
		
		
		String color = "Red";

		switch (color) {

		case "Red":
			System.out.println("STOP...!");
			break;
		case "Yellow":
			System.out.println("Get Ready ...!");
			break;
		case "Green":
			System.out.println("Go ...! ");
			break;
		default:
			System.out.println("Invalid Signal...! ");
		}
	}

}
