package com.controlflow_statments;

public class If_Else {

	
	
	
	public static void main(String[] args) {
		
		int marks = 150;
		
		if(marks > 100) {
			System.out.println("Invalid marks!");
		}
		else if (marks >= 35) {
			System.out.println("Your Pass");
			
		}
		else {
			System.out.println("Sorry your fail😔");
		}
	}
}
