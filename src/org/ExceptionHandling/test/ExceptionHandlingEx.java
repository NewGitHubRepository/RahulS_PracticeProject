package org.ExceptionHandling.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandlingEx {

	public static void main(String[] args) throws IOException   {
		try {
			System.out.println("1");
			System.out.println("Hi");
			System.out.println("Hello");

			FileInputStream fis = new FileInputStream("");
			fis.read();
			
			System.out.println(10/0);
		//}
		//catch(ArithmeticException ae) {
		//	System.out.println("Arithmetic Exception Handled ");
		}catch(FileNotFoundException fe) {
			System.out.println("FileNotFoundException ");
			//fe.printStackTrace();
		}
		finally {
			System.out.println("finally block");
			System.out.println("Testing");
		}
		
		
	}

}
