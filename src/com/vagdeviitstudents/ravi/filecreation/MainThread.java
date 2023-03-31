package com.vagdeviitstudents.ravi.filecreation;

public class MainThread 
{
	public static void main(String[] args)
	{
		EvenNumberThread en=new EvenNumberThread();
		en.start();
		OddNumbersThread on=new OddNumbersThread();
	try {
		en.join();
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		on.start();
		}
		
	}
 


