package com.vagdeviitstudents.ravi;

public class LivingThings implements Animals, Human {
	// implements the interface
	public void run() {
		System.out.println("Running the Animals");
	}

	public void sleep() {
		System.out.println("sleeping the Animals");
	}

	public void eat() {
		System.out.println("Eating the Animals");
	}

	public  void talking() {
		System.out.println("Talking the Human");
	}

	public void thinking() {
		System.out.println("Thinking the human");
	}

	public static void main(String[] args) {
		LivingThings ob = new LivingThings();
		ob.run();
		ob.sleep();

	}


}
