package com.break_continue;

public class Break_Continue {

	
	public static void main(String[] args) {
		
		// ---------------------------------------------
        // BREAK STATEMENT THEORY
        // ---------------------------------------------
        System.out.println("Break Statement :");
        System.out.println("break is used to stop/exit a loop immediately.");
        System.out.println("When to use :");
        System.out.println("1. When a condition becomes true and you want to stop the loop.");
        System.out.println("2. Used in for, while, do-while, and switch.\n");

        // Example for break
        System.out.println("Example of break:");
        System.out.println("for(int i = 1; i <= 10; i++) {");
        System.out.println("    if(i == 5) {");
        System.out.println("        break;   // loop stops");
        System.out.println("    }");
        System.out.println("    System.out.println(i);");
        System.out.println("}\n");

        // ---------------------------------------------
        // CONTINUE STATEMENT THEORY
        // ---------------------------------------------
        System.out.println("Continue Statement :");
        System.out.println("continue is used to skip one iteration and move to the next loop cycle.");
        System.out.println("When to use :");
        System.out.println("1. When you want to skip printing or processing a particular value.\n");

        // Example for continue
        System.out.println("Example of continue:");
        System.out.println("for(int i = 1; i <= 10; i++) {");
        System.out.println("    if(i == 5) {");
        System.out.println("        continue;  // skips 5");
        System.out.println("    }");
        System.out.println("    System.out.println(i);");
        System.out.println("}\n");
	}
}
