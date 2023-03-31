package com.vagdeviitstudents.naveen;

public class Student {

	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

// contructor for above 
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	// need to add tostring object as to get parameters without address
	public String toString() {

		return "student age:" + age + "student name :" + name;
	}

	// to get use of hashcode object in this
	public int hashCode() {

		return age;
	}

	
	public class Teacher{
		int age;
		char name ;
		
		
		
	}
	// equals to
//	public boolean equals(Object obj) {
		
//		return 
//	}
	public static void main(String[] args) {
		Student s1 = new Student(22, "rahul");
		Student s2 = new Student(18, "raju");
		Student s3 = new Student(22, "rahul");
        Student s4 = s1;
        
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));
	
		
		
		System.out.println(s1.hashCode());

		System.out.println(s1.toString());
	}

}
