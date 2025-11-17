package com.if_else_pratice;

public class Age_Group_Message {
	
	public static void main(String[] args) {
		
		System.out.println("Q8: Write a program to print a message based on age group:");
		int age = 24;
		if (age >= 0 && age <= 12) {
            System.out.println("=> You are a Child.");
        } else if (age >= 13 && age <= 19) {
            System.out.println("=> You are a Teenager.");
        } else if (age >= 20 && age <= 59) {
            System.out.println("=> You are an Adult.");
        } else {
            System.out.println("=> You are a Senior Citizen.");
        } 
	}

}
