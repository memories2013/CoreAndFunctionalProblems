package com.functional;

import java.io.PrintStream;
import java.util.Scanner;

public class TwoDArray {

	Scanner scan = new Scanner(System.in);
	PrintStream print = new PrintStream(System.out);
	
	public void IntTwoArray(int m, int n) {
		int[][] array = new int[m][n]; 		
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" Please enter value: ");
				array[i][j] = scan.nextInt();
			}
		}
		
		System.out.println(" The array: ");
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				print.print(" " + array[i][j]);
			}
			System.out.println();
		}
	}

	public void DoubleTwoArray(int m, int n) {
		double[][] array = new double[m][n]; 		
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" Please enter value: ");
				array[i][j] = scan.nextDouble();
			}
		}
		
		System.out.println(" The array: ");
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				print.print(" " + array[i][j]);
			}
			System.out.println();
		}
	}

	public void BooleanTwoArray(int m, int n) {
		boolean[][] array = new boolean[m][n]; 		
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" Please enter value: ");
				array[i][j] = scan.nextBoolean();
			}
		}
		
		System.out.println(" The array: ");
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				print.print(" " + array[i][j]);
			}
			System.out.println();
		}
	}
	
	public void start() {
		System.out.print(" Please enter the value of m: ");
		int m = scan.nextInt();
		
		System.out.print(" Please enter the value of n: ");
		int n = scan.nextInt();
		
		System.out.println(" Please enter your choice of array type: ");
		
		System.out.println(" 1. Integer\n 2. Double\n 3. Booleans");
		int ch = scan.nextInt();
		
		switch(ch) {
		case 1: 
			IntTwoArray(m, n);
			break;
		case 2: 
			DoubleTwoArray(m, n);
			break;
		case 3: 
			BooleanTwoArray(m, n);
			break;
		default: 
			System.out.println(" Please enter a correct choice");
			break;
		}
		
	}
}