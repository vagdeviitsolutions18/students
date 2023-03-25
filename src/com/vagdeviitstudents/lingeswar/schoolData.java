package com.vagdeviitstudents.lingeswar;

import java.util.ArrayList;
import java.util.Iterator;

class Student4
{
	int id;
	String name;
	int age;
	public Student4(int id, String name, int age) 
	{
	
		this.id = id;
		this.name = name;
		this.age = age;
	}
}
class Teacher
{
		int id;
		String name;
		String subject;
		public Teacher(int id, String name, String subject) 
		{
		
			this.id = id;
			this.name = name;
			this.subject = subject;
		}
	}


public class schoolData 
{
	
	public static void main(String[] args)
	{
		ArrayList<Student4> stlist1=new ArrayList<Student4>();
		stlist1.add(new Student4(101,"Hari",25));
		stlist1.add(new Student4(102,"Sajeed",30));
		stlist1.add(new Student4(103,"Balu",35));
		
		
		ArrayList<Teacher> tlist=new ArrayList<Teacher>();
		tlist.add(new Teacher(201,"Megana","Engilish"));
		tlist.add(new Teacher(202,"Janshi","Hindi"));
		tlist.add(new Teacher(203,"Rajini","Science"));
		
		for(Teacher tr: tlist)
		{
			System.out.println(tr.id+","+tr.name+","+tr.subject);
		}
		System.out.println("\n@@ Using the iterator @@");
		Iterator<Teacher> itr1 = tlist.iterator();
		while(itr1.hasNext())
		{
	          Teacher tr=itr1.next();
			  System.out.println(tr.id+","+tr.name+","+tr.subject);
		}
		
		for(Student4 st: stlist1)
		{
			System.out.println(st.id+","+st.name+","+st.age);
		}
		System.out.println("\n%% Using the iterator %%");
		Iterator<Student4> itr = stlist1.iterator();
		while(itr.hasNext())
		{
	          Student4 s=itr.next();
			  System.out.println(s.id+","+s.name+","+s.age);
		}
	}

}


