package com.vagdeviitstudents.ravi.filecreation;

public class OddNumbersThread extends Thread 
{
	public void run()
	{
		for(int i=0;i<=1000;i++)
		{
			if(1==i%2)
			{
				System.out.println(i);
			}
				
		}
	}
}
