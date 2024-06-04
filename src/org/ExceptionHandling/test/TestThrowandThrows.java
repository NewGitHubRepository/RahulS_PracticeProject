package org.ExceptionHandling.test;

public class TestThrowandThrows {

	public static void AgeforVoting() throws ArithmeticException {
		System.out.println("Inside the method");
		int age = 16;
		if(age<18) {
		throw new ArithmeticException("You are not eligible for voting");
		}else {
			System.out.println("you are eligible");
		}
		}
	
	
	public static void main(String[] args) {
		try {
			AgeforVoting();
		}catch(ArithmeticException e) {
			System.out.println("Exception caught in method AgeforVoting()");
			System.out.println(e);
		}
		
	}
}
