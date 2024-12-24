package com.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MultipleTryCatch 
{
	public static void main(String[] args) 
	{
//		try 
//		{
//			FileOutputStream fos=new FileOutputStream("a1.txt");
//			String s="TOPS Technology at SG Highway....";
//			byte[] b=s.getBytes();
//			fos.write(b);
//			fos.flush();
//			fos.close();
//			System.out.println("Data Written Successfully...........");
//			
//		}
//		catch (Exception e) 
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		finally 
//		{
//            // Code in the `finally` block always executes
//            System.out.println("Execution completed. Closing resources...");
//        }
		
		try 
		{
			FileInputStream fis=new FileInputStream("a1.txt");
			int x;
			try 
			{
				while((x=fis.read())!= -1)
				{
					System.out.print((char)x);
				}
				System.out.println();
				fis.read();
				fis.close();
			} 
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally 
		{
            // Code in the `finally` block always executes
            System.out.println("Execution completed. Closing resources...");
          
        }
		
		
	}

}
