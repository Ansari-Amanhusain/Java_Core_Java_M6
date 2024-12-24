package com.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo1 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileWriter fw=new FileWriter("File1.txt");
			String s="This is the FileWriter and FileReader Class....";
			fw.write(s);
			fw.flush();
			fw.close();
			System.out.println("Data write Successfully.....");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try 
		{
			FileReader fr=new FileReader("File1.txt");
			int x;
			try {
				while((x=fr.read()) != -1)
				{
					System.out.print((char)x);
				}
				fr.read();
				fr.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
