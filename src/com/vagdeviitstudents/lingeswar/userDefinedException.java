package com.vagdeviitstudents.lingeswar;

public class userDefinedException 
{
	public static void main(String[] args) throws Exception
	{
		try 
		{
			System.out.println(1/0);
		}
		catch(ArithmeticException e)
		{
			throw new InsufficientBalanceException("Insufficient Balance Please check the Balance");
		}
	}

}
