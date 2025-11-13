package com.controlflow_statments;

public class Marks_Pratice {

	
	public static void main(String[] args) {
		int marks = 40;
		
		if (marks >= 90 && marks <= 100) {
            System.out.println("Grade A : Excellent");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("Grade B : Best");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("Grade C : Good");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("Grade D : Better");
        } else if (marks >= 50 && marks <= 59) {
            System.out.println("Grade E : Average");
        } else {
            System.out.println("Grade F : Better luck next time...!");
        } 
	}
}
