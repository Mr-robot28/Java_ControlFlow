package com.loops;

public class Loops_info {

	
	public static void main(String[] args) {
		
		 // LOOPS IN JAVA  
        // 1. Introduction  
        // Loops are used when we want to execute a block of code multiple times. 
        // Helps reduce code duplication and improves logic flow. 
        // Key idea : repeat a task until a condition becomes false.

        // Why Loops Are Needed : 
        // “If you want to print ‘Hello’ 100 times, will you write 100 print statements?"
        // No — that’s why loops exist.

        // 3. Types of Loops in Java :
        // (A) Entry-Controlled Loops 
        //     for loop 
        //     while loop  
        // (B) Exit-Controlled Loop 
        //     do-while loop  (upcoming topic)
        // (C) Enhanced Loop 
        //     for-each loop (Used for arrays and collections)

        // 1) for loop syntax :  
        // for(initialization; condition; updation) {     
        //     // code 
        // }  
        // example :
        // for(int i = 1; i <= 5; i++) {     
        //     System.out.println(i); 
        // }    

        // 2) while loop syntax :  
        // while(condition) {     
        //     // code 
        // }  
        // example :
        // int i = 1; 
        // while(i <= 5) {     
        //     System.out.println(i);     
        //     i++; 
        // }    

        // 3) do - while loop syntax :  
        // do {     
        //     // code 
        // } while(condition);   
        // example :
        // int i = 1; 
        // do {     
        //     System.out.println(i);     
        //     i++; 
        // } while(i <= 5);  


        // Now printing each line using System.out.println()

        System.out.println("LOOPS IN JAVA");
        System.out.println("1. Introduction");
        System.out.println("Loops are used when we want to execute a block of code multiple times.");
        System.out.println("Helps reduce code duplication and improves logic flow.");
        System.out.println("Key idea : repeat a task until a condition becomes false.");

        System.out.println("Why Loops Are Needed :");
        System.out.println("If you want to print ‘Hello’ 100 times, will you write 100 print statements?");
        System.out.println("No — that’s why loops exist.");

        System.out.println("Types of Loops in Java :");
        System.out.println("(A) Entry-Controlled Loops");
        System.out.println("    for loop");
        System.out.println("    while loop");
        System.out.println("(B) Exit-Controlled Loop");
        System.out.println("    do-while loop");
        System.out.println("(C) Enhanced Loop");
        System.out.println("    for-each loop (Used for arrays and collections)");

        System.out.println("1) for loop syntax :");
        System.out.println("for(initialization; condition; updation) { }");
        System.out.println("Example: for(int i = 1; i <= 5; i++) { System.out.println(i); }");

        System.out.println("2) while loop syntax :");
        System.out.println("while(condition) { }");
        System.out.println("Example: int i = 1; while(i <= 5) { System.out.println(i); i++; }");

        System.out.println("3) do-while loop syntax :");
        System.out.println("do { } while(condition);");
        System.out.println("Example: int i = 1; do { System.out.println(i); i++; } while(i <= 5);");
	}
}
