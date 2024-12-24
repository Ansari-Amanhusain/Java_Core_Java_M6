package com.exercise;
//Write a program to demonstrate exception handling using try-catch-finally.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TryCatchDEmo 
{
	public static void main(String[] args) 
	{
		File obj=new File("File.txt");
		try {
			obj.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to create a file   : "+e);
			e.printStackTrace();
		}
		
		try {
			FileWriter fw=new FileWriter(obj);
			fw.write("Hello this is the First File.....");
			fw.close();
			System.out.println("Data Write.....");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
