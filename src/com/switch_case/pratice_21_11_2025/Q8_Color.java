package com.switch_case.pratice_21_11_2025;

public class Q8_Color {
	
	public static void main(String[] args) {
		
		System.out.println("Q8. Accept a color code (R, G, B, Y) and print the color name.");
		System.out.println();
		
		char color = 'R';
		
		switch (color) {
        case 'R':
            System.out.println("Red");
            break;
        case 'G':
            System.out.println("Green");
            break;
        case 'B':
            System.out.println("Blue");
            break;
        case 'Y':
            System.out.println("Yellow");
            break;
        default:
            System.out.println("Invalid color code");
    }
	}

	
}
