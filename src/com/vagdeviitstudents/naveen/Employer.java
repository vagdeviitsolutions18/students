 package com.vagdeviitstudents.naveen;

public class Employer  
{
	String employename;
	int age;

	Employer()   //default Constructor

		 {
			 System.out.println("This is Default constructor");
			 new Employer("Naveen",26);
		}
		 
		 Employer(String n,int a)  	//Parameterized Constructor

		 {
			this.employename=n;
			this.age=a; 
			System.out.println("Employe Name:"+n);
			System.out.println("Employe age:"+a);
		 }
		 }


		
		
