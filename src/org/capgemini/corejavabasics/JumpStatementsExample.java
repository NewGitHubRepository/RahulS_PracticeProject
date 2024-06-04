package org.capgemini.corejavabasics;

public class JumpStatementsExample {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			System.out.println("Value of i is :: " + i);
			if(i==5) {
				System.out.println("i value reached to 5 :: " + i);
				continue;
			}else if(i==6) {
				continue;
			}else if(i==7) {
				break;
			}else if(i==8) {
				continue;
			}
		}

	}

}
