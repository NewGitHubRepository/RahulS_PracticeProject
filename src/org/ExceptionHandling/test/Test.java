package org.ExceptionHandling.test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
	public void fileCheck() throws IOException,FileNotFoundException {
		File f = new File("");
		FileReader fr = new FileReader(f);
		fr.read();
	}
	public void div(int i ,int j) {
		int R = i/j;
		System.out.println("division value is "+ R);
		}
	public static void main(String[] args) {
		Test t = new Test();
		try {
			t.fileCheck();
			t.div(10, 0);
			t.fileCheck();
		} catch (ArithmeticException e) {
			System.out.println("Handle Arithmetic Exception");
			System.out.println(e);
		} catch (Throwable e) {
			System.out.println("Handle Exception");
			System.out.println(e);
		}
	}
}
