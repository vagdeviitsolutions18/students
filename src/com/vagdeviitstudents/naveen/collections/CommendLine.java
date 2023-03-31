package com.vagdeviitstudents.naveen.collections;

import java.util.Scanner;

public class CommendLine {

	public static void main(String[] args) {
		System.out.println("what is the student Name:");
		Scanner sc= new Scanner(System.in);
		String Name=sc.next();
		System.out.println(Name);
		
		System.out.println("student marks");
		int marks=sc.nextInt();
		if(marks>35)
			System.out.println("student is passed.");
		else
			System.out.println("student is fail.");
		System.out.println(marks);
	}
}
