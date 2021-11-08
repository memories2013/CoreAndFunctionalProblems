package com.core;

import java.util.Scanner;

public class Factors {
	
	public boolean prime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if(n % i == 0) 
				return false;
		}
		return true;
	}

	public void factors() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" Please enter the number to check out: ");
		int n = scan.nextInt();
		
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				if (prime(i)) {
					System.out.println(i);
				}
			}
		}
		scan.close();
	}
}