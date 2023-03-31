package com.vagdeviitstudents.naveen.collections;

import java.io.BufferedWriter;
import java.io.File;
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
			
			
			
			File x = new File(floder, "text.txt");
        x.createNewFile();
         
        
			
			
			
		} catch (IOException oi) {
			


}
	}
}
