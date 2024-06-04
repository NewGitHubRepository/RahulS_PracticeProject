package org.infosys.collectionEx;

import java.util.ArrayList;
import java.util.List;

public class CollectionExList {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(2);
		li.add(3);
		System.out.println("Size of the List :: "+ li.size());
		System.out.println("Get the 4th index value:: "+li.get(4));
		System.out.println("Before remove index 0th value");
		System.out.println(li.get(0));
		li.remove(0);
		System.out.println("After remove method index 0th value");
		System.out.println(li.get(0));
		System.out.println("for loop");
		for(int i = 0;i<li.size();i++) {
			
			System.out.println(li.get(i));
		}
		System.out.println("For-Each loop");
		for(Integer list : li) {
			
			System.out.println(list);
		}

	}

}
