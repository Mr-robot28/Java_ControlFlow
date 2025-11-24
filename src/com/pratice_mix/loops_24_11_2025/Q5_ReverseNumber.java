package com.pratice_mix.loops_24_11_2025;

public class Q5_ReverseNumber {
	
	public static void main(String[] args) {
		
		System.out.println("Q5) Print the reverse of number 1234 using while loop:\n");
		
        int i = 1234, rev = 0;
        while (i > 0) {
            rev = rev * 10 + i % 10;
            i /= 10;
        }
        System.out.println(rev);

	}

}
