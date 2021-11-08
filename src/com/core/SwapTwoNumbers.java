package com.core;

import java.util.Scanner;

public class SwapTwoNumbers {

	public void swap() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" Please enter the first number: ");
		int x = scan.nextInt();
		
		System.out.print(" Please enter the second number: ");
		int y = scan.nextInt();
		
		System.out.println(" The two numbers are: " + x + " " + y);
		
		int temp = x; 
		x = y; 
		y = temp;
		
		System.out.println(" The two numbers are: " + x + " " + y);
		
		scan.close();
	}
}