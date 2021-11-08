package com.core;

import java.util.Scanner;

public class PowerOfTwo {

	public void power() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" Please enter the value of n: ");
		int n = scan.nextInt();
		
		if (n > 31 || n < 0) {
			System.out.println(" Please enter a value between 0 and 31");
		}
		
		for (int i = 1; i <= n; i++) {
			System.out.println(Math.pow(2, i));
		}
		scan.close();
		
	}
}