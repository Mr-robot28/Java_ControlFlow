package com.pratice_mix.loops_24_11_2025;

public class Q7_Fibonacci10Terms {

public static void main(String[] args) {
	 System.out.println("Q7) Print Fibonacci series up to 10 terms using for loop:");
     int a1 = 0, b1 = 1, c1;
     for (int q = 1; q <= 10; q++) {
         System.out.println(a1);
         c1 = a1 + b1;
         a1 = b1;
         b1 = c1;
     }
}
}
