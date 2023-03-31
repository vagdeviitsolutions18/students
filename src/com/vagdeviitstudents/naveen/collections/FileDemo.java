package com.vagdeviitstudents.naveen.collections;

import java.io.*;

import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {

		try {

			File floder = new File("C:\\Users\\User\\students\\src\\com\\vagdeviitstudents");
			floder.mkdir();
			File f = new File(floder, "abc.txt");
			f.createNewFile();

			FileWriter fw = new FileWriter(f);

			BufferedWriter bf = new BufferedWriter(fw);
			bf.write("which class? \n");
//			 bf.newLine();
			bf.write("what is ur age");
			 bf.newLine();
			bf.write("which class");
			 bf.newLine();
			bf.write("my namer is ?");
			 bf.newLine();
			bf.write("the student is passed");
			 bf.newLine();
			bf.write("the student is fail");
			 bf.newLine();
			bf.write("the student is poor in maths");
			
			bf.flush();
            bf.close();

		} catch (IOException oi) {

		}

	}

	
	
}
