package org.ExceptionHandling.test;

public class ExceptionHandlingInArray {

	public static void main(String[] args) {
		int num[]= {10,20,30,40,40};
		
		try {
			//System.out.println(10/0);
			System.out.println(num[5]);
			System.out.println(10/0);
		//}catch(Exception ex) {
		//	System.out.println(ex);//////Its a parent class.P--->C not working 
		}catch(ArithmeticException e) {    /////but Child---->Parent we got no Errors
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
		}catch(Exception ex) {
			System.out.println(ex);
		}
		System.out.println("rest of the code");
	}

}
