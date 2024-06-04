package org.IBM.oops;

public class Calculation extends AbstactDemo{
	
	public static void main(String[] args) {
		AbstactDemo Abs = new Calculation();
		Abs.add(2, 5);
		Abs.mul(10, 10);
		Abs.sub(10, 5);
	}

	@Override
	public void sub(int a, int b) {
		System.out.println("substraction to two numbers :: "+ (a-b));
		
	}

	@Override
	public void mul(int a, int b) {
		
		System.out.println("multiplication of two numbers :: "+(a*b));
	}
	
}
