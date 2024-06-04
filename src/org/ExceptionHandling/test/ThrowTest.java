package org.ExceptionHandling.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ThrowTest {

	public static void main(String[] args) throws IOException {
		ThrowTest t = new ThrowTest();
		t.file();
		//t.checkNum(0);
		System.out.println("Remaining code still work");
		
		try {
			t.checkNum(0);
		}catch(ArithmeticException e){
			System.out.println(e);
		}finally {
		
			System.out.println("Handle Exception through finally block");
		}
		
		System.out.println("After handling the Exception, is it run...?");/////////////yes it is run.
	}
	public void checkNum(int num) {
		if(num<1)
		{
			throw new ArithmeticException("Number is zero or Negative,cannot find the square ");
		}else {
			System.out.println("Square of Number "+ num + " is :: "+ (num*num));
		}
		
	}
	public void file() throws IOException {
		File f = new File("E:\\TestDATA\\Test.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		//throw new FileNotFoundException("Empty file");
		String str;
		while((str=br.readLine())!= null){
			System.out.println(str);
		}
		
	}
	
}
