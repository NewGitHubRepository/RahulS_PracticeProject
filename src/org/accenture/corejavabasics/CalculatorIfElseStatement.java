package org.accenture.corejavabasics;

public class CalculatorIfElseStatement {

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		char c= '-';
		
		if(c == '+') {
			System.out.println("Addition of numbers 10 & 20 is " + (n1+n2));
		}else if(c == '-') {
			System.out.println("substraction of numbers 10 & 20 is " +(n1-n2));
		}else if(c == '*') {
			System.out.println("Multiplication of numbers 10 & 20 is " +(n1*n2));
		}else if(c=='/') {
			System.out.println("Division of numbers 10 & 20 is " +(n1/n2));
		}else {
			System.out.println("Please select any operator");
		}
			
		
		

	}

}
