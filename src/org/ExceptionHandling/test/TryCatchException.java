package org.ExceptionHandling.test;

public class TryCatchException {

	public static void main(String[] args) //throws ArrayIndexOutOfBoundsException
		{
		int number [] = {10,20,30,50, 70,50};
		try {
		String []name = new String[10];
		name[0]="Yogi";
		name[1]="Jyotika";
		name[2]="Himanshu";
		name[5]= "Bhanu";
		name[10]="Ganga";
		name[8] = "Geeta";
		for(int i = 0 ;i<name.length;i++) {
			System.out.println(name[i]);
		}
		System.out.println("No exception");
		}catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("Exception is handled by catch block");
			System.out.println("ArrayIndexOutOfBoundsException found");
			
		}
		System.out.println("after try catch block");
	}

}
