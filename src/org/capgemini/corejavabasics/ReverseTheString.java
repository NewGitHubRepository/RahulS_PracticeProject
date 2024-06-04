package org.capgemini.corejavabasics;

public class ReverseTheString {

	public static void main(String[] args) {
		
		String S = "Geetanjali";
		System.out.println(S.length());
		System.out.println(S);
		String revString = "";
		for(int i=1;i<=S.length();i++)
		{
			char newString = S.charAt(S.length() - i);
			revString =revString +newString ;
			
			
			
		}
		System.out.println(revString);
	}

}
