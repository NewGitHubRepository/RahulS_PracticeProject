package org.capgemini.corejavabasics;

import java.util.Scanner;

public class ForloopStatements {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			System.out.println("Value of i :: " + i);
		}
		
		// print tables
		//how to take user input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number :: ");
		int number = scan.nextInt();
		for(int i =1;i<=10;i++) {
			System.out.println(number +"x"+ i +" = " +(number*i));
		}

	}

}
