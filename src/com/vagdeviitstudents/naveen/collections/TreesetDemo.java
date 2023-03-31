package com.vagdeviitstudents.naveen.collections;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {

		TreeSet sdata = new TreeSet();

		Employedemo s1 = new Employedemo("John", 10, 2500, new Date(12, 10, 1999));
		Employedemo s2 = new Employedemo("ram", 12, 2923, new Date(12, 11, 2000));
		Employedemo s3 = new Employedemo("lucky", 25, 3645, new Date(07, 02, 2005));
		Employedemo s4 = new Employedemo("love", 21, 5214, new Date(10, 06, 2010));
		Employedemo s5 = new Employedemo("raviram", 23, 5555, new Date(14, 03, 2012));

		sdata.add(s1);
		sdata.add(s2);
		sdata.add(s3);
		sdata.add(s4);
		sdata.add(s5);
		
		TreeSet setdoj =new TreeSet(new EmployeDoj());
		
		setdoj.add(s1);
		setdoj.add(s2);
		setdoj.add(s3);
		setdoj.add(s4);
		setdoj.add(s5);

		System.out.println(sdata);
		
		System.out.println(setdoj);
	}

}
