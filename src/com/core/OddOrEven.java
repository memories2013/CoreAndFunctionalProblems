package com.core;

import java.util.Scanner;

public class OddOrEven {

	public void check() {
		Scanner scan = new Scanner(System.in);
	
		System.out.print(" Please enter the number to check: ");
		int x = scan.nextInt();
		
		if (x % 2 == 0)
			System.out.println(" The number is even");
		else
			System.out.println(" The number is odd");
		
		scan.close();
	}
}