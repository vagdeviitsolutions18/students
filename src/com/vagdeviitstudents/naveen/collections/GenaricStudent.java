package com.vagdeviitstudents.naveen.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class GenaricStudent {
	ArrayList<PrintStudentData> hikeMarks(ArrayList listofMarks) {
		ArrayList markList = new ArrayList();

		Iterator tr = listofMarks.iterator();

		while (tr.hasNext()) {

			PrintStudentData em = (PrintStudentData) tr.next();
			double a = em.marks;
			a = a * 1.1;
			em.marks = (int) a;
			markList.add(em);
		}

		return markList;

}
	public static void main(String[] args) {

		ArrayList st = new ArrayList();
		
		PrintStudentData s1 = new PrintStudentData("ravi", 22,125);
		PrintStudentData s2 = new PrintStudentData("raju",33,280);
		
		st.add(s2);
		st.add(s1);
		
		GenaricStudent ehs = new GenaricStudent();

		ArrayList h = ehs.hikeMarks(st);
		
		System.out.println(h);
}
}
