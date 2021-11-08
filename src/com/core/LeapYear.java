package com.core;

import java.util.Scanner;

public class LeapYear {
	public void year() {
		Scanner scan = new Scanner(System.in);
		System.out.print(" Please enter the year: ");
		int year = scan.nextInt();
		
		if (year < 1000 || year > 9999) {
			System.out.println(" Please enter a year of four digits");
			scan.close();
			return;
		}
		
		if (year % 100 == 0) {
			if (year % 400 == 0) 
				System.out.println(" It is a leap year and a century");
			else 
				System.out.println(" It is NOT a leap year");
		}
		else if (year % 4 == 0) 
			System.out.println(" It is a leap year");
		else
			System.out.println(" It is NOT a leap year");
		
		scan.close();
	}
}