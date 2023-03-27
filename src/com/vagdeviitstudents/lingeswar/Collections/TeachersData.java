package com.vagdeviitstudents.lingeswar.Collections;

import java.util.ArrayList;

public class TeachersData 
{
	String name;
	int age;

	public TeachersData(String name, int age) 
	{
		this.name = name;
		this.age = age;
		
   }
	
	public String toString() {
		return this.name+" "+this.age;
	}

}
