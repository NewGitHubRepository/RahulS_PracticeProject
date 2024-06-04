package org.capgemini.corejavabasics;

import java.util.Scanner;

public class CheckIntegerNumberlength {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any long number :: ");
		
		int num = scan.nextInt();
		int temp = num;
		int length = 0;
		while(temp != 0) {
			length = length+1;
			temp = temp/10;
	    }
	System.out.println("length of " +num +" = "+ length);	
	}
}
