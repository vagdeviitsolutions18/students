package com.vagdeviitstudents.naveen;

import java.util.ArrayList;
import java.util.Iterator;

public class Teacher  {
	String name;
	int speed;
	int wight;

	public Teacher(String name, int speed, int wight) {

		this.name = name;
		this.speed = speed;
		this.wight = wight;
	}

	public String toString() {
		return "Superlist [name=" + name + ", speed=" + speed + ", wight=" + wight + "]";

	}

	static ArrayList<Teacher> list = new ArrayList<>();

	public static void main(String[] args) {
		Teacher list1 = new Teacher("John", 10, 20);
		Teacher list2 = new Teacher("Jane", 20, 30);
		Teacher list3 = new Teacher("Bob", 15, 25);

		list.add(list1);
		list.add(list2);
		list.add(list3);

		Iterator<Teacher> itr = list.iterator();
		while (itr.hasNext()) {
			Teacher st = itr.next();

			System.out.println(st);

		}
	}
//	ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c"));
//	ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("c", "d", "e"));
//
//	list.addAll(list);  //Merge both lists
//
//	System.out.println(listOne);
//	System.out.println(listTwo);
//	merged.list.addall(Teacher);
//	merged.list.addall(Studentlist);
		
}
