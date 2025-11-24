package com.pratice_mix.switch_case_pratice_21_11_2025;

public class Q7_Vehicle_Toll_Tax {

	public static void main(String[] args) {

		System.out.println(
				"Q7. Accept a vehicle type (Car, Bike, Bus, Truck) and print the toll tax amount using switch case. ");
		System.out.println();
		String vehicle = "Car";

		switch (vehicle) {

		case "Car":
			System.out.println(" Car => ₹200");
			break;
		case "Bike":
			System.out.println(" Bike => ₹0");
			break;
		case "Bus":
			System.out.println(" BUs => ₹300");
			break;
		case "Truck":
			System.out.println("Truck => ₹500");
			break;
		default:
			System.out.println("Invalide vehicle...!");

		}

	}
}
