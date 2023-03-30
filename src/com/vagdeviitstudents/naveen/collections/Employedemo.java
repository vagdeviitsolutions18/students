package com.vagdeviitstudents.naveen.collections;

import java.util.Date;

public class Employedemo implements Comparable {

	String name;
	int age;
	int salary;
	Date doj;

	public Employedemo(String name, int age, int salary, Date doj) {

		this.name = name;
		this.age = age;
		this.salary = salary;
		this.doj = doj;
	}

	@Override
	public int compareTo(Object o) {
		Employedemo em  = (Employedemo) o;
		if (this.salary < em.salary) 
			return 1;
		 else

			return -1;
	}

	@Override
	public String toString() {
		
				   return "[name=" + name + ", age=" + age + ", salary=" + salary + ", doj=" + doj + "]";
	}


	

}
