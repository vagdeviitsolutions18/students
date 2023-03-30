package com.vagdeviitstudents.naveen.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap map = new HashMap<>();
		StudentData s1 = new StudentData("ravi", 22, 12);
		StudentData s2 = new StudentData("raju", 22, 8);
		StudentData s3 = new StudentData("naveen", 29, 6);
		StudentData s4 = new StudentData("anna", 15, 9);
		StudentData s5 = new StudentData("ragu", 19, 5);

		map.put(12, s1);
		map.put(8, s2);
		map.put(6, s3);
		map.put(9, s4);
		map.put(5, s5);
		map.put(10, s1);

		
		Set km =  map.entrySet();
		Iterator it = km.iterator();

		while (it.hasNext()) {

			Map.Entry en = (Map.Entry) it.next();

			System.out.println(en.getKey());
			System.out.println(en.getValue());

		}
	}

}
