package org.IBM.oops;

import java.util.Scanner;

public class Rectangle extends Shape{

	public static void main(String[] args) {	
		Shape ractangle = new Rectangle();
		Shape circle = new Circle();
		circle.draw();
		circle.area();
		ractangle.draw();
		ractangle.area();	
	}
	@Override
	public void draw() {
		System.out.println(" Rectangle is drawing ");
	}
	@Override
	public double area() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter one integer number:: ");
		int length =  scan.nextInt();
		System.out.println("Enter another integer number:: ");
		int width = scan.nextInt();
		double area = length * width;
		System.out.println("Area of rectangle is :: "+ area);
		return area;
	}

	



}

