package com.switch_case.pratice_21_11_2025;



public class Q10_PPP {

	
	public static void main(String[] args) {
		
		System.out.println("Q10. Accept user choice (1–3):\r\n"
				+ "1 → Print “Start”\r\n"
				+ "2 → Print “Stop”\r\n"
				+ "3 → Print “Restart”\r\n");
		System.out.println();
		
		int choice = 1;
		switch (choice) {
        case 1:
            System.out.println("Start");
            break;

        case 2:
            System.out.println("Stop");
            break;

        case 3:
            System.out.println("Restart");
            break;

        default:
            System.out.println("Invalid choice");
    }
	}
}
