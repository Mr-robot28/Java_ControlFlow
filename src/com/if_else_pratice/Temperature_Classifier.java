package com.if_else_pratice;

public class Temperature_Classifier {
    public static void main(String[] args) {
	System.out.println("Q9: Write a program to classify a temperature as Hot, Warm, Cool, or Cold.");
	
	int temp = 15;
	
	if (temp >= 35) {
        System.out.println("It's Hot!");
    } else if (temp >= 25 && temp < 35) {
        System.out.println("It's Warm.");
    } else if (temp >= 15 && temp < 25) {
        System.out.println("It's Cool.");
    } else {
        System.out.println("It's Cold.");
    }


}
}
