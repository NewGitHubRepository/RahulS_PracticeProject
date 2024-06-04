package org.accenture.corejavabasics;

public class MethodsExample2 {

	public int performAdd() {
		int i = 3;
		int j = 5;
		int sum = i+j;
		System.out.println("Addition "+ sum);
		return sum;
	}
	
	public void PerformMultiply(int a, int b) {
		int result= a * b;
		System.out.println("muliply: "+ result);
		return;
	}
	
	public static void enterStudentDetails(int Rollno, String Name, String Address, boolean FeesDetails, double Annualfees,char Grade) {
		
		System.out.println("Student RollNo is : "+ Rollno);
		System.out.println("Student Name is : "+ Name);
		System.out.println("Student Address is : "+ Address);
		System.out.println("Student FeesDetails is : "+ FeesDetails);
		System.out.println("Student AnnualFees is : "+ Annualfees);
		System.out.println("Student Grade is : "+ Grade);
		
	}
	public static void main(String[] args) {
		MethodsExample2 m2 = new MethodsExample2();
		int res = m2.performAdd();
		System.out.println("result: "+res);
		m2.PerformMultiply(res, 10);
		enterStudentDetails(101, "Geeta", "Hyderabad", false, 36000.00 ,'C');
		enterStudentDetails(111, "Bhanu", "Dehradun", true, 24000.50 ,'B');
	}

}
