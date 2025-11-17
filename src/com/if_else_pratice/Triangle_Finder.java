package com.if_else_pratice;

public class Triangle_Finder {

	public static void main(String[] args) {
		System.out.println("Q: Write a program to check the type of triangle (Equilateral, Isosceles, or Scalene).");
		System.out.println();
		
		int a = 5, b = 8, c = 10;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println();
		if (a == b && b == c) {
		    System.out.println("=> Equilateral Triangle");
		} else if (a == b || b == c || a == c) {
		    System.out.println("=> Isosceles Triangle");
		} else {
		    System.out.println("=> Scalene Triangle");
		}
	}
}
