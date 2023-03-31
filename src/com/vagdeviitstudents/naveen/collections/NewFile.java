package com.vagdeviitstudents.naveen.collections;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NewFile {
	

	public static void main(String[] args) {

		try {

			File floder = new File("C:\\Users\\User\\students\\src\\com\\vagdeviitstudents");
			floder.mkdir();
			File f = new File(floder, "abc.txt");
			f.createNewFile();
			FileWriter fw = new FileWriter(f);
			BufferedWriter bf=new BufferedWriter(fw);
			bf.write("which class? \n");

			bf.write("what is ur age");
			bf.flush();
			bf.close();
		} catch (IOException oi) {
		
		}
			
			try {
			
		//	 FileReader reader = new FileReader();
			 File floder = new File("C:\\Users\\User\\students\\src\\com\\vagdeviitstudents\\abc.txt");
				FileReader fr= new FileReader(floder);
				BufferedReader br = new BufferedReader(fr);
				
				 String line;
				while ((line = br.readLine()) != null) {
		                System.out.println(line);
				}
		                
			
			
		} catch (IOException oi) {
			


}
	}
}
