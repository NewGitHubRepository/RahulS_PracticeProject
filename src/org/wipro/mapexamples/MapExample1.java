package org.wipro.mapexamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample1 {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(101, "Orange");
		map.put(102, "Apple");
		map.put(103, "Grapes");
		map.put(104, "Banana");
		map.put(102, "Apple");
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.containsKey(103));
		System.out.println(map.containsValue("Apple"));
		System.out.println(map.containsValue("apple"));
		//map.clear();
		//System.out.println(map.size());
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
