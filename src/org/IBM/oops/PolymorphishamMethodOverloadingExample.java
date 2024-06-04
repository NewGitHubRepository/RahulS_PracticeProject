package org.IBM.oops;

public class PolymorphishamMethodOverloadingExample {
	
	public static void main(String[] args) {
		PolymorphishamMethodOverloadingExample ex = new PolymorphishamMethodOverloadingExample();
		ex.performAdd();
		ex.performAdd(1000, 8000);
		ex.performAdd(30.64, 30.64);
	}
	

	public void performAdd() {
		System.out.println(10+20);
	}

	public void performAdd(int i, int j) {
		System.out.println(i+j);
	}

	public void performAdd(double i, double j) {
		System.out.println(i+j);
	}

}
