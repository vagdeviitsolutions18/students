package com.vagdeviitstudents.ravi.filecreation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile 
{
	public static void main(String[] args) throws IOException
	{
		File folder =new File("C:\\newproject\\students\\src\\main\\java\\vagdeviitsol\\demo\\xyz.txt");
		FileReader fr=new FileReader(folder);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
	
	}

}
