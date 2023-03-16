package com.vagdeviitstudents.lingeswar;

   class Emplyee
   {
	   String empName;
	   long empSalary;
	Emplyee()
	{
		System.out.println("The Emplyee is Created");
	}
	Emplyee(String n,long s)
	{
		this.empName=n;
		this.empSalary=s;
		System.out.println("The Emplyee Name is :"+n);
		System.out.println("The Emplyee Salary is :"+s);
	}
   }