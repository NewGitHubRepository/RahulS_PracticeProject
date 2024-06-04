package org.ExceptionHandling.test;

import java.io.IOException;

public class BasicJavaFilehandling {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Sample message");
		System.err.println("Error message ");
		int i = System.in.read();
		System.out.println((char) i);

	}

}
