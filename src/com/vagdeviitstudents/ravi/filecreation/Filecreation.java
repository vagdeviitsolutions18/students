package com.vagdeviitstudents.ravi.filecreation;

import java.io.*;
public class Filecreation 
{
	public static void main(String[] args) throws IOException 
	{
		File folder =new File("C:\\newproject\\students\\src\\main\\java\\vagdeviitsol\\demo"); //Folder Creation
		folder.mkdir(); //Folder Creation
		File f= new File(folder,"xyz.txt"); //File Creation
		f.createNewFile(); //File Creation
		FileWriter fw=new FileWriter(f);
		BufferedWriter bf=new BufferedWriter(fw);
		bf.write("Raviteja\n");
		bf.write("Raviteja");
		bf.newLine();
		bf.write("Raviteja\n");
		bf.write("Raviteja");
		bf.newLine();
		bf.write("Raviteja\n");
		bf.write("Raviteja");
		bf.newLine();
		bf.write("Raviteja");
        bf.flush();
		bf.close();
		
		
	}

}
