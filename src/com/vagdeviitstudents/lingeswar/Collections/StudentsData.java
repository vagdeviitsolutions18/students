package com.vagdeviitstudents.lingeswar.Collections;

import java.util.ArrayList;



public class StudentsData
{
	String name;
	int age;

	public StudentsData(String name, int age) 
	{
		this.name = name;
		this.age = age;	
   }
	
	public String toString() 
	{
		return this.name+" "+this.age;
	}

}
