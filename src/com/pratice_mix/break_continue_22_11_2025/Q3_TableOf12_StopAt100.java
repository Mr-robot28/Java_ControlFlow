package com.pratice_mix.break_continue_22_11_2025;

public class Q3_TableOf12_StopAt100 {

	public static void main(String[] args) {
		
		System.out.println("3) Print the table of 12 but stop printing when the product becomes greater than 100:");
        for(int i=1;i<=20;i++){
            int p = 12*i;
            if(p>100) break;
            System.out.println(p);
        }
	}
}
