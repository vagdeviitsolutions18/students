package com.vagdeviitstudents.lingeswar;

import java.util.ArrayList;
import java.util.Iterator;

class Student1
{
	int id;
	String name;
	int age;
	public Student1(int id, String name, int age) 
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
}
public class ArrayListExample 
{
	public static void main(String[] args)
	{
		ArrayList<Student1> stlist=new ArrayList<Student1>();
		stlist.add(new Student1(101,"Hari",25));
		stlist.add(new Student1(102,"Sajeed",30));
		stlist.add(new Student1(103,"Balu",35));
		
		for(Student1 st:stlist)
		{
			System.out.println(st.id+","+st.name+","+st.age);
		}
		System.out.println("Using the iterator");
		Iterator<Student1> itr = stlist.iterator();
		while(itr.hasNext())
		{
	          Student1 s=itr.next();
			  System.out.println(s.id+","+s.name+","+s.age);
		}
	}

}

