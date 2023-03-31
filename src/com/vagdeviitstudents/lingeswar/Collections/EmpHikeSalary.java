package com.vagdeviitstudents.lingeswar.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class EmpHikeSalary {
	
	ArrayList hikeSalaries(ArrayList listOfSalaries)
	{
		ArrayList salaryList=new ArrayList();
		
		Iterator tr=listOfSalaries.iterator();
		while(tr.hasNext())
		{
			EmpSalary em=(EmpSalary) tr.next();
			double a=em.salary;
			a=a*1.1;
			em.salary=(int)a;
			salaryList.add(em);
		}
		return salaryList;
	}
    public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		
		EmpSalary emp1=new EmpSalary(30000);
		EmpSalary emp2=new EmpSalary(45000);
		EmpSalary emp3=new EmpSalary(50000);
		
		ar.add(emp1);
		ar.add(emp2);
		ar.add(emp3);
		
		EmpHikeSalary ehs=new EmpHikeSalary();
		
		ArrayList hikedList=ehs.hikeSalaries(ar);
		
		System.out.println(hikedList);
	}
}
