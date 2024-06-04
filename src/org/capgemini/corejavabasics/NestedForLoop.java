package org.capgemini.corejavabasics;

public class NestedForLoop {

	public static void main(String[] args) {
		outer:
		for(int i =1;i<5;i++) {
			
			System.out.println("Outer for loop ");
			System.out.println("i value is :: "+ i);
			
			inner:
			for(int j= 1;j<5;j++) {
				//System.out.println("Inner for loop ");
				System.out.println("j value is :: "+ j);
				if(j==2) {
					break outer;
				}
			}
		}

	}

}
