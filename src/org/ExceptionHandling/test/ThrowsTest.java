package org.ExceptionHandling.test;

public class ThrowsTest {

	public static int divideNum(int a , int b)throws ArithmeticException {
		int res;
		res = a/b;
		return res;
	}
	
	public static void main(String[] args) {
		
		ThrowsTest t = new ThrowsTest();
		try {
		int divNum = t.divideNum(45, 0);
		System.out.println(divNum);
		}catch(Exception e) {
			System.out.println("Number can not be divided by zero");
		}
		
		System.out.println("Rest of code");
	}
}
