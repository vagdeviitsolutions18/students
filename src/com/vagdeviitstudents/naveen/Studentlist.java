package com.vagdeviitstudents.naveen;

import java.util.ArrayList;
import java.util.Iterator;

public class Studentlist {

	String name;
	int age;

	public Studentlist(String name, int age) {
		this.name = name;
		this.age = age;

	}

	//to sting for above student list 
	public String toString() {
		return "Studentlist [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		
		Studentlist s1=new Studentlist("ravi",22);
		Studentlist s2=new Studentlist("raju",22);
		Studentlist s3=new Studentlist("naveen",29);
		Studentlist s4=new Studentlist("anna",15);
		
	
		
	ArrayList<Studentlist> list = new ArrayList<Studentlist>();
	list.add(s1);
	list.add(s2);
	list.add(s3);
	list.add(s4);
	
	System.out.println(list);// print the above details 
	for(Studentlist user :list) {
		System.out.println(user); // basic define to print the details in order 
	}
	

}
}
