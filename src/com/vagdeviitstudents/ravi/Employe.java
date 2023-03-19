package com.vagdeviitstudents.ravi;

class Employe 
{
   String empName;
   long empSalary;

   Employe() //Default constuctor
{
	System.out.println("Emplyee is Created");
	new Employe("Ravi",25);
}
Employe(String n,long s)//parameterized constuctor
{
	this.empName=n;
	this.empSalary=s;
	System.out.println("Emplyee Name :"+n);
	System.out.println("Emplyee Salary :"+s);
}
}