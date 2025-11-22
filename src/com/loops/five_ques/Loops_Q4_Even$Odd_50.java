package com.loops.five_ques;

public class Loops_Q4_Even$Odd_50 {

	public static void main(String[] args) {
		
		System.out.println("Q4: Numbers from 1 to 50 with Even/Odd label.");
		System.out.println();

		System.out.println("_________________________________");
		System.out.println("For");
		System.out.println();

		for (int i = 1; i <= 50; i++) {
			if (i % 2 ==0) {
				System.out.println(i + " is Even No.");
			}else {
				System.err.println(i + " is Odd No.");
			}

		}

		System.out.println("_________________________________");
		System.out.println("While");
		System.out.println();
		int i = 1;
		while (i <= 50) {
			if (i % 2 ==0) {
				System.out.println(i + " is Even No.");
			}else {
				System.err.println(i + " is Odd No.");
			}
			i++;

		}
		System.out.println("_________________________________");
		System.out.println("Do-While");
		System.out.println();
		int i1 = 1;
		
		do {
			if (i1 % 2 ==0) {
				System.out.println(i1 + " is Even No.");
			}else {
				System.err.println(i1 + " is Odd No.");
			}
			i1++;
			
		}while(i1<= 50);
	}
}
