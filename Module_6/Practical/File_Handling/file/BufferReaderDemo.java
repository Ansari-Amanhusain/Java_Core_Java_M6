package com.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			BufferedReader br=new BufferedReader(new FileReader("File1.txt"));
			String line;
			try 
			{
				while((line=br.readLine()) != null)
				{
					System.out.println(line);
				}
				
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
