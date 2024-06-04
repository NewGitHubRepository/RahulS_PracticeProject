package org.capgemini.corejavabasics;

public class StringMethods {

	public static void main(String[] args) {
		
		String word = "SeleniumJava";
		String word1 = "seleniumJava";
		System.out.println(word.equals(word1));
		if(word == word1) {
			System.out.println("Both Strings are Equal");
		}else {
			System.out.println("Not Equal");
		}
		
		String name1 = new String("CoreJava");
		String name2 = new String("CoreJava");
		if(name1 == name2) {
			System.out.println("both objects are equal");
		}else {
			System.out.println("both objects are not equal");
		}
		System.out.println(name1.equalsIgnoreCase(name2));
		
		
		String s1 = "selenium";
		String s2 = "selenium";
		if(s1.equals(s2) && s1==s2) {
			System.out.println("Both Equals");
		}else {
			System.out.println("Not Equals");
		}
	
		
		String address = "Hyderabad";
		address = address.concat(" City.");
		System.out.println(address);
		
		
	}
	
	
	
	
	
	
	

}
