package org.IBM.oops;

public abstract class AbstactDemo {

	int a, b ;
	int sum=0;
	public void add(int a ,int b) {
		 sum = a+b;
		System.out.println("Additon of two numbers :: "+sum);
	}
	public abstract void sub(int a, int b);
	public abstract void mul(int a,int b);
	
}
