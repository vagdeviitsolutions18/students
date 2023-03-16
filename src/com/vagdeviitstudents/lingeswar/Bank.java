package com.vagdeviitstudents.lingeswar;

interface Bank {
	
	float rateOfInterest();
	}
    class SBI implements Bank
{
	public float rateOfInterest()
	{
		return 9.15f;
	}
}
    class ICIC implements Bank
    {
    	public float rateOfInterest()
    	{
    		return 5.23f;
    	}
    	
    }


