package com.pratice_mix.break_continue_22_11_2025;

public class Q5_EvenStopAt56 {

	
	public static void main(String[] args) {
		
		  System.out.println("5) Print all even numbers from 1 to 100 and stop when you get the number 56:");
	        for(int i=1;i<=100;i++){
	            if(i==56) break;
	            if(i%2==0) System.out.println(i);
	        }

	}
}
