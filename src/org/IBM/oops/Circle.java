package org.IBM.oops;

import java.util.Scanner;

public class Circle extends Shape{
    double pi = 3.14;
    
	@Override
	public void draw() {
		System.out.println("  Circle is drawing    ");
		
	}

	@Override
	public double area() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius :: ");
		double radius=  scan.nextDouble();
		
		double area = pi*radius*radius;
		System.out.println("Area of Circle is :: "+ area);
		return (area);
	}

}
