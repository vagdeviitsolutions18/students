package com.vagdeviitstudents.naveen.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Teachers  {
	String name;
	int speed;
	int wight;

	public Teachers(String name, int speed, int wight) {

		this.name = name;
		this.speed = speed;
		this.wight = wight;
	}

	public String toString() {
		return "name=" + name + " speed:" + speed + " wight:" + wight ;

	}
}

