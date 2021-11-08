package com.core;

import java.util.Scanner;

public class Largest {

	public void largest() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" Please enter the first number: ");
		int x = scan.nextInt();
		
		System.out.print(" Please enter the second number: ");
		int y = scan.nextInt();
		
		System.out.print(" Please enter the third number: ");
		int z = scan.nextInt();
		
		if (x >= y && x >= z)
			System.out.println(x + " is the largest number");
		else if (y >= x && y >= z)
			System.out.println(y + " is the largest number");
		else if (z >= x && z >= y) 
			System.out.println(z + " is the largest number");
		
		scan.close();
	}
}