package com.core;

import java.util.Scanner;

public class HarmonicNumber {

	public void harmonic() {
		Scanner scan = new Scanner(System.in);
		double sum = 0.0;
		
		System.out.print(" Please enter the value of n: ");
		int n = scan.nextInt();
		
		if (n <= 0) {
			System.out.println(" Please enter a value greater than 0");
		}
		
		for (int i = 1; i <= n; i++) {
			sum += (1 / (double)i);
		}
		
		System.out.println(" The final value is: " + sum);
		scan.close();
	}
}