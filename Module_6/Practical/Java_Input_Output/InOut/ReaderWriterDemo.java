package com.InOut;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriterDemo 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileReader fr=new FileReader("File1.txt");
			int x;
			try 
			{
				while((x=fr.read())!= -1)
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
		
		try 
		{
			FileWriter fw=new FileWriter("File.txt");
			String s="Hello This is the Last Topic of the Basic Java....";
			fw.write(s);
			fw.flush();
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
