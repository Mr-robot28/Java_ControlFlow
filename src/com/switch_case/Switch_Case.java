package com.switch_case;

public class Switch_Case {
	
	
	public static void main(String[] args) {
		
		// Switch Case : 
        // The switch statement in Java is used to execute one block of code 
        // among many options based on the value of an expression.

        // When to Use switch-case :
        // When you have multiple conditions based on the same variable or expression.

        // Syntax :
        //
        // switch (expression) {
        //     case value1:
        //         break;
        //     case value2:
        //         break;
        //     case value3:
        //         break;
        //     default:
        // }

        // Note :
        // Keyword      Description
        // switch       Starts the switch statement and evaluates the expression.
        // case         Executes block if the expression matches case value.
        // break        Exits switch block (prevents fall-through).
        // default      Runs when no case matches.
		
		System.out.println("Switch Case : The switch statement in Java is used to execute one block of code among many options based on the value of an expression (usually an int, char, String, or enum).");
        System.out.println();
        System.out.println("When to Use switch-case : When you have multiple conditions based on the same variable or expression.");
        System.out.println();
        System.out.println("Syntax :");
        System.out.println("switch (expression) {");
        System.out.println("    case value1:");
        System.out.println("        break;");
        System.out.println("    case value2:");
        System.out.println("        break;");
        System.out.println("    case value3:");
        System.out.println("        break;");
        System.out.println("    default:");
        System.out.println("}");
        System.out.println();
        System.out.println("Note :");
        System.out.println("Keyword\t\tDescription");
        System.out.println("switch\t\tStarts the switch statement and evaluates the expression.");
        System.out.println("case\t\tDefines a block of code that executes if the expression matches the given value.");
        System.out.println("break\t\tExits from the switch block; if omitted, the code will continue to next case (fall-through).");
        System.out.println("default\t\tOptional block that executes if no case matches.");
        System.out.println();
	}

}
