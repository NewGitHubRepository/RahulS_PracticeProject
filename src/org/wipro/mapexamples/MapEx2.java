package org.wipro.mapexamples;

import java.util.HashMap;

public class MapEx2 {

	public static void main(String[] args) {
		
		String data = "Selenium automation Testing";
		//character occurrence in string
		data.toLowerCase();
		String finaldata = data.replace(" ", "");
		System.out.println(finaldata);
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		System.out.println(hashmap.size());
		//hashmap.toString()=finaldata;
	}

}
