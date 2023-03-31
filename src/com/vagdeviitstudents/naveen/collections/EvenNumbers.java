package com.vagdeviitstudents.naveen.collections;

public class EvenNumbers extends Thread {

	public void run() {

		for (int i = 1; i < 1000; i++) {
			if (i % 2 == 0) {

				System.out.println(i + " is even");
			}
		}
	}
}
