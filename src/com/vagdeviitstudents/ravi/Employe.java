package com.vagdeviitstudents.ravi;

class Employe 
{
   String empName;
   long empSalary;

   Employe() //Default constructor
{
	System.out.println("Emplyee is Created");
	new Employe("Ravi",25);
}
Employe(String n,long s)//parameterized constructor
{
	this.empName=n;
	this.empSalary=s;
	System.out.println("Emplyee Name :"+n);
	System.out.println("Emplyee Salary :"+s);
}
}