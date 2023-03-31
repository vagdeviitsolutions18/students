package com.vagdeviitstudents.naveen.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class EmpHikeSalary {

	ArrayList hikeSalary(ArrayList listofSalarylist) {
		ArrayList salaryList = new ArrayList();

		Iterator tr = listofSalarylist.iterator();

		while (tr.hasNext()) {

			EmpSalary em = (EmpSalary) tr.next();
			double a = em.salary;
			a = a * 1.1;
			em.salary = (int) a;
			salaryList.add(em);
		}

		return salaryList;
	}

	public static void main(String[] args) {

		ArrayList st = new ArrayList();

		EmpSalary em1 = new EmpSalary(25000);
		EmpSalary em2 = new EmpSalary(32126);
		EmpSalary em3 = new EmpSalary(12345);
		EmpSalary em4 = new EmpSalary(223334);

		st.add(em1);
		st.add(em2);
		st.add(em3);
		st.add(em4);
		EmpHikeSalary ehs = new EmpHikeSalary();

		ArrayList h = ehs.hikeSalary(st);
		System.out.println(h);

	}

}
