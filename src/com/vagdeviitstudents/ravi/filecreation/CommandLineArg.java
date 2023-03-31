package com.vagdeviitstudents.ravi.filecreation;

import java.util.Scanner;

public class CommandLineArg
{
  public static void main(String[] args) 
   {
	 System.out.println("Enter Student Name:");
	 Scanner sn=new Scanner(System.in);
	 String Name=sn.next();
	 System.out.println("Enter Student Marks:");
	 int marks=sn.nextInt();
	 if(marks>=35)
	 
		 System.out.println("Student is Passed");
		 else
			 System.out.println("Student is Fail");
	 System.out.println(marks);
	 //System.out.println("Stdent age :"+args[0]+"marks are: "+args[1]);
 
   }
}
