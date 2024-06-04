package org.accenture.corejavabasics;

public class MethodsExample {
	
	public void performSubtraction() {
		int i =10;
		int j= 20;
		System.out.println("Substraction :"+(i-j));
	}
	public void performSubtraction(int a , int b) {
		System.out.println("Substraction :"+(a-b));
	}
	public void performSubraction(float i, float j) {
		System.out.println("Substraction :"+(i-j));
	}
	public void performSubraction(double i, double j) {
		System.out.println("Substraction :"+(i-j));
	}
	public void performSubraction(double i, float j) {
		System.out.println("Substraction :"+(i-j));
	}
	public void performSubtraction(int a , int b ,int c) {
		System.out.println("Substraction :"+(a-b-c));
	}

	static public void main() {
	}
	
	static public void main(String args []) {
		
		MethodsExample m = new MethodsExample();
		m.performSubtraction();
		m.performSubraction(30.4f, 0.4f);
		m.performSubtraction(300, 200);
		m.performSubtraction(50, 10, 10);
		m.performSubraction(30.0, 40.80);
		m.performSubraction(100,1000.7);
	}

}
