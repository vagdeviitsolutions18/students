package com.vagdeviitstudents.naveen.collections;

public class PrintStudentData {
	String name;
	int age;
	int marks;

	public PrintStudentData(String name, int age, int marks){
		this.name = name;
		this.age = age;
		this.marks=marks;

	}

	// to sting for above student list
	public String toString()
	{
		return  "name:" + name +"  age:" + age + "  marks"+marks;
	}
//	public static void main(String[] args) {
//		PrintStudentData s1 = new PrintStudentData("ravi", 22,125);
//		PrintStudentData s2 = new PrintStudentData("raju",33,280);
//		
//		System.out.println(s1);
//		System.out.println(s2);
//	}
    }

