package com.vagdeviitstudents.lingeswar;

public class javaExceptionHandling 
{

	public static void main(String args[])
	{  
		System.out.println("Program execution start");
		int  fNumber=15;
		int  sNumber=0;
		int result=0;
		try
		{  

			result=fNumber/sNumber; 
			
		}

		catch(ArithmeticException ae)
		{
			System.out.println(ae.toString());
			//throw ae;
	      }
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("Output is :"+result);
		
		System.out.println("Program execution end");  
	}  
}  


