package com.core;

import java.util.Scanner;

public class CoinFlipPercent {

	public void percent() {
		Scanner scan = new Scanner(System.in);
		double coin;
		double tails = 0;
		double heads = 0;
		
		System.out.print(" Please enter the numer of times to flip: ");
		int n = scan.nextInt();
		
		if (n < 0) {
			System.out.println(" Please enter a number that is greater than 0" );
			scan.close();
			return;
		}
		
		for (int i = 0; i < n; i++) {
			coin = Math.random();
			if (coin > 0.5) {
				System.out.println(" We flipped to heads");
				heads++;
			}
			else {
				System.out.println(" We flipped to tails");
				tails++;
			}
		}
		
		System.out.println(" Percentage of heads(" + heads + ": " + (heads / n * 100));
		System.out.println(" Percentage of tails(" + tails + ": " + (tails / n * 100));
		
		scan.close();
	}
}