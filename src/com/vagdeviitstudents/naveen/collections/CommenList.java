package com.vagdeviitstudents.naveen.collections;

import java.util.ArrayList;

public class CommenList {

	public static void main(String[] args) {

		ArrayList list1 = new ArrayList();
		list1.add(4);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		System.out.println("List1: " + list1);

		ArrayList list2 = new ArrayList();
		list2.add(1);
		list2.add(6);
		list2.add(4);
		list2.add(9);

		System.out.println("List2: " + list2);
		
		list1.retainAll(list2);

		System.out.println("Common elements: " + list1);

	}

}
