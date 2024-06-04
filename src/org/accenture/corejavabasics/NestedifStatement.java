package org.accenture.corejavabasics;

public class NestedifStatement {

	public static void main(String[] args) {
		boolean aadhar = true;
		boolean pan = true;
		boolean passport = false;
		if(aadhar == true) {
			if(pan == true) {
				if(passport == true) {
					System.out.println("Aadhar is valid");
					System.out.println("PAN is valid");
					System.out.println("Passport is also valid");
				}else
				{
					System.out.println("Not Valid Details");
				}

			
			}
		}
		
	}

}
