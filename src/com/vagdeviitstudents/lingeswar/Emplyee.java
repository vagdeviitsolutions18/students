package com.vagdeviitstudents.lingeswar;

    class Emplyee 
    {
	   String empName;
	   long empSalary;
	Emplyee()
	{
		System.out.println("Emplyee is Created");
	}
	Emplyee(String n,long s)
	{
		this.empName=n;
		this.empSalary=s;
		System.out.println("Emplyee Name :"+n);
		System.out.println("Emplyee Salary :"+s);
	}
    }
