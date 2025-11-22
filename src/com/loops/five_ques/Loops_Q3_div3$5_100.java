package com.loops.five_ques;

public class Loops_Q3_div3$5_100 {

	public static void main(String[] args) {

		System.out.println("Q3: Numbers from 1 to 100 divisible by 3 and 5 both.");
		System.out.println();

		System.out.println("_________________________________");
		System.out.println("For");
		System.out.println();

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}

		}

		System.out.println("_________________________________");
		System.out.println("While");
		System.out.println();
		int i = 1;
		while (i <= 100) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
			i++;

		}
		System.out.println("_________________________________");
		System.out.println("Do-While");
		System.out.println();
		int i1 = 1;
		
		do {
			if (i1 % 3 == 0 && i1 % 5 == 0) {	
				System.out.println(i1);
			}
			
			i1++;
			
		}while(i1<= 100);

	}

}
