package com.InOut;

import java.io.FileInputStream;
// Implement a file copy program using FileInputStream and FileOutputStream
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIODemo 
{
	public static void main(String[] args) 
	{
//		try
//		{
//			FileOutputStream fos=new FileOutputStream("File3.txt");
//			String s="This File From Java Input and Output Topic ";
//			byte[] b1=s.getBytes();
//			try 
//			{
//				fos.write(b1);
//				fos.flush();
//				fos.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try 
		{
			FileInputStream fis=new FileInputStream("File3.txt");
			int x;
			try {
				while((x=fis.read()) != -1)
				{
					System.out.print((char)x);
				}
				fis.read();
				fis.close();
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
