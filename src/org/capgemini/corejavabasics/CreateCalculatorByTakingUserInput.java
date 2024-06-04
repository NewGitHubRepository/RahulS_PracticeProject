package org.capgemini.corejavabasics;

import java.util.Scanner;

public class CreateCalculatorByTakingUserInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number 1 :: ");
		int n1 = scan.nextInt();
		System.out.println("Enter Number 2 :: ");
		int n2 = scan.nextInt();
		System.out.println("Enter any Symbols (+ , - , * , / ) :: ");
		String sym = scan.next();
		switch(sym){
		case "+":
			System.out.println("Additon of numbers :: "+(n1+n2));
			break;
		case "-":
			System.out.println("Substraction of numbers :: "+(n1-n2));
			break;
		case "*":
			System.out.println("Multiplication of numbers :: "+(n1*n2));
			break;
		case "/":
			System.out.println("Division of numbers :: "+(n1/n2));
			break; 
		}
		
	}

}
