package com.vagdeviitstudents.naveen.collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFileDemo {

	public static void main(String[] args, String Line) {
		
	
		try {
			File floder = new File("C:\\Users\\User\\students\\src\\com\\vagdeviitstudents");
			FileReader fr= new FileReader(floder);
			BufferedReader br = new BufferedReader(fr);
			
			 String line;
			while ((line = br.readLine()) != null) {
	                System.out.println(line);
			}
	                
		} catch (Exception e) {
			
			
		}
	}
}
