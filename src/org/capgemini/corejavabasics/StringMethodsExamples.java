package org.capgemini.corejavabasics;

public class StringMethodsExamples {

	public static void main(String[] args) {
		
		String name = "Selenium";
		System.out.println(name.toLowerCase());//1.LowerCase
		System.out.println(name.toUpperCase());//2.UpperCase
		System.out.println(name);
		
		String sentence = " Selenium_with_java ";
		String trimedSentence = sentence.trim();//3.trim
		System.out.println(trimedSentence);
		String[] splitedSentence = trimedSentence.split("_");//4.Split
		System.out.println(splitedSentence[0]);
		System.out.println(splitedSentence[2]);
		
		String replacedsentence = sentence.replace('i', 'z').replace('_', ' ').trim();//5.replace
		System.out.println(replacedsentence);
		
		System.out.println(sentence.startsWith("S"));//6.startsWith
		System.out.println(sentence.endsWith(" "));
		boolean endsWith = replacedsentence.endsWith("java");
		System.out.println(endsWith);//7.endsWith
		int lengthOfString = sentence.length(); //8.length
		System.out.println(lengthOfString);
		char indexValue = sentence.charAt(1); //9.charAt
		System.out.println(indexValue);
		System.out.println(splitedSentence[2].charAt(1));
		
		String emptyString = "";
		System.out.println(emptyString.isBlank());  //isBlank
		System.out.println(emptyString.isEmpty());  //isEmpty
		String internString =name.intern();	    //10. intern...(copy)
		System.out.println(internString);
		System.out.println(name);
		System.out.println(internString.isBlank());
	   
		int i= 10;
		String s = String.valueOf(i);               //11. valueOf
		System.out.println(s+ 10);
		boolean isMarried = true;
		System.out.println(String.valueOf(isMarried)+s);
		char c='A';
		String CharToString = String.valueOf(c);
		System.out.println(CharToString+" " + s +" "+ isMarried+" " + 10 + " all are string");
		
		
		
	}

}
