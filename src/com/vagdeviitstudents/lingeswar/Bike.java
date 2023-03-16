package com.vagdeviitstudents.lingeswar;

abstract class Bike {
	
	abstract void run();
}
class Hond extends Bike
{
	void run()
	{
		System.out.println("Running Safelly...");
	}
	class TVS extends Bike
	{
		void run()
		{
			System.out.println("Running Safelly...");
		
		}
	}

}
