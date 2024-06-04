package org.infosys.collectionEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionListEx2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Cat");
		list.add("Dog");
		list.add("Cow");
		list.add("Horse");
		list.add("Pig");
		list.add("Dog");
		System.out.println("name of the animals in the list :: ");
		for(String animals:list) {
			System.out.println(animals);
		}
		System.out.println(list.get(0));
	//set [collection Interface]
		Set<Integer> set = new HashSet<Integer>();
		set.add(1000);
		set.add(1001);
		set.add(1002);
		set.add(1001);
		set.add(1010);
		System.out.println("Size of the Set is :: "+set.size());
		System.out.println(set.isEmpty());
		System.out.println(set.getClass());
		set.remove(1002);
		System.out.println(set);
		for(Integer number :set) {
			System.out.println(number);
		}
		
	}
}
