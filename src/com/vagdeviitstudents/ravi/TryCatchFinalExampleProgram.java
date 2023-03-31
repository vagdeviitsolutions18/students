package com.vagdeviitstudents.ravi;

public class TryCatchFinalExampleProgram 
{
	public static void main(String args[])
	{  
		System.out.println("Program execution start");
		int a=6;
		int b=0;
		int c=0;
		try
		{  
          c=a/b; 
		}

		catch(ArithmeticException ae)
		{
			System.out.println(ae.toString());
			System.out.println("Output is :"+c);
		}
		finally
		{
			System.out.println("finally block");
		}
		
		System.out.println("Program execution end");  
	}  
}  


