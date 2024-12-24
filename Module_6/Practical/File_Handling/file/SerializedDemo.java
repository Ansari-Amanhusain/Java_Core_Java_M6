package com.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializedDemo 
{
	public static void main(String[] args) 
	{
		SerializedDemo sd=new SerializedDemo();
		sd.setSerialized();
		
	}
	
	public void setSerialized()
	{
		StudentDemo st=new StudentDemo();
		st.setSid(01);
		st.setSname("Aman");
		st.setDpart("B.Tech");
		

		try 
		{
			FileOutputStream fos = new FileOutputStream("File2.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(st);
			oos.flush();
			fos.flush();
			fos.close();
			System.out.println("Data Write.....");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}



