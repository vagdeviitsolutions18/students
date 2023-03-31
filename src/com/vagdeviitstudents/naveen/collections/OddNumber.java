package com.vagdeviitstudents.naveen.collections;

public class OddNumber extends Thread {

	public void run() {
		for (int i = 1; i < 1000; i++) {
			if (i % 2 == 1) {

				System.out.println(i + " is odd");

			}
		}
	}
}
