package org.capgemini.corejavabasics;

import java.util.Scanner;

public class ForloopExample {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("You are 18yr old. pls Enter true or false ::  ");
		boolean Isyear = scan.nextBoolean();
		
			if(Isyear == true) {
				System.out.println("You are Eligible for voting ");
			}else {
				System.out.println("Not Eligible for voting ");
			}

		
	}

}
