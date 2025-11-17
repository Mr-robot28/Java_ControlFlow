package com.if_else_pratice;

public class Voting_Eligibility {
	
	public static void main(String[] args) {
		int age = 25;
		if (age >= 18) {
            System.out.println("You are eligible to vote.");
            
            if (age >= 25) {
                System.out.println("You can also contest in elections.");
            } else {
                System.out.println("But you cannot contest in elections yet.");
            }
        } else {
            System.out.println("You are not eligible to vote yet.");
        }
	}

}
