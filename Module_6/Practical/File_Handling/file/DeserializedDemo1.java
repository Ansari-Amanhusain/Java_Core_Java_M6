package com.file;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializedDemo1 
{
	public static void main(String[] args) 
	{
		DeserializedDemo1 dd1=new DeserializedDemo1();
		StudentDemo sd=dd1.getDeserialized();
		System.out.println(sd);
		
	}
	
	public StudentDemo getDeserialized()
	{
		StudentDemo sd=null;
		try 
		{
			FileInputStream fis=new FileInputStream("File2.ser");
			ObjectInputStream ois=new ObjectInputStream(fis);
			sd=(StudentDemo)ois.readObject();
			ois.close();
			fis.close();
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sd;
	}
	}

}
