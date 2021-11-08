package com.core;

import java.util.Scanner;

public class VowelOrConsonant {

	public void vowel() {
		char[] vowels = new char[] {'a', 'e', 'i', 'o', 'u'};
		Scanner scan = new Scanner(System.in);
		int flag = 0;
		
		System.out.print(" Please enter the char to check: ");
		char c = scan.next().charAt(0);
		
		for(int i = 0; i < 5; i++) {
			if (c == vowels[i]) {
				flag = 1;
			}
		}
		
		if (flag == 0) 
			System.out.println(" It is a consonant");
		else
			System.out.println(" It is a vowel");
		
		scan.close();
		
	}
}