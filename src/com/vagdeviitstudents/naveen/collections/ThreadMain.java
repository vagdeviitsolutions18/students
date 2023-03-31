package com.vagdeviitstudents.naveen.collections;

public class ThreadMain {

	public static void main(String[] args) {

		EvenNumbers ev = new EvenNumbers();
		ev.run();

		OddNumber od = new OddNumber();
		od.run();
	}
}
