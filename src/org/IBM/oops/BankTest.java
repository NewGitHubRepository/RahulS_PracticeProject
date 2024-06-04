package org.IBM.oops;

public class BankTest {

	public static void main(String[] args) {
		
		Bank sbi = new SBIbank();
		Bank  icici = new ICICIbank();
		System.out.println("SBI bank, rate of interest is :: "+ sbi.rateOfInterest()+"%");
		System.out.println("ICICI bank, rate of Interest is :: "+icici.rateOfInterest()+"%");
	}

}
