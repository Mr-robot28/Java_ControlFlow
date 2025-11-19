package com.switch_case;

public class Q10 {

	public static void main(String[] args) {

		String season = "winter";

		switch (season) {
		case "winter":
			System.out.println("winter has dec,jan, feb ");
			break;
		case "summer":
			System.out.println("summer has march, april, may");
			break;
		case "monsoon":
			System.out.println("monsoon has june, july, august");
			break;
		case "autum":
			System.out.println("autum has sept, oct, nov,");
			break;
		default:
			System.out.println("season not found");
		}
	}
}
