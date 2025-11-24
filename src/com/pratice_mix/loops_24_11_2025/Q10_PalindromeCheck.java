package com.pratice_mix.loops_24_11_2025;

public class Q10_PalindromeCheck {
	
	public static void main(String[] args) {
		
		 System.out.println("Q10) Accept a number and check whether it is palindrome or not (using while loop):");
	        int z = 121, rev2 = 0, temp = z;
	        while (z > 0) {
	            rev2 = rev2 * 10 + z % 10;
	            z /= 10;
	        }
	        if (rev2 == temp)
	            System.out.println("Palindrome");
	        else
	            System.out.println("Not Palindrome");
	}

}
