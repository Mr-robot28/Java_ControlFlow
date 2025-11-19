package com.switch_case;

public class Q8 {
	
	public static void main(String[] args) {
		
		System.out.println("Q8. Accept a category type (Domestic, Commercial, Industrial) and print the electricity rate per unit using a switch case.");
		System.out.println();
		
		String category = "Commercial";

        switch (category) {

            case "Domestic":
                System.out.println("Rate: ₹5 per unit");
                break;

            case "Commercial":
                System.out.println("Rate: ₹8 per unit");
                break;

            case "Industrial":
                System.out.println("Rate: ₹11 per unit");
                break;

            default:
                System.out.println("Invalid Category");
        }
	}

}
