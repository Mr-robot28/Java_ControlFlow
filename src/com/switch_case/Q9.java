package com.switch_case;

public class Q9 {
	
	public static void main(String[] args) {
		
		System.out.println("Q9. Take month number (1–12) and print the corresponding season:");
		System.out.println();
		
		int month = 2;
		
		 switch (month) {
         case 12:
         case 1:
         case 2:
             System.out.println("Winter");
             break;

         case 3:
         case 4:
         case 5:
             System.out.println("Summer");
             break;

         case 6:
         case 7:
         case 8:
             System.out.println("Monsoon");
             break;

         case 9:
         case 10:
         case 11:
             System.out.println("Autumn");
             break;

         default:
             System.out.println("Invalid month number");
             
		 }
		
		
	}

}
