package com.col;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo 
{
	public static void main(String[] args) 
	{
		HashMap hm=new HashMap();
		System.out.println("Default Size of HashMap  : "+hm.size()); // size = 0
		System.out.println("Default Value of HashMap : "+hm);       // value = {}
		
		hm.put(1, 110);
		hm.put("Aman", "Ansari");
		hm.put(2, 'A');
		hm.put(2, "Aman");
		System.out.println("Now size of HaspMap   : "+hm.size());
		System.out.println("Now values of HashMap : "+hm);
		
		hm.remove(2);
		System.out.println("Now size of HaspMap   : "+hm.size());
		System.out.println("Now values of HashMap : "+hm);
		
		Set set=hm.entrySet();
		Iterator i1=set.iterator();
		while(i1.hasNext())
		{
			String[] s=i1.next().toString().split("=");
			System.out.println("Key is   : "+s[0]);
			System.out.println("Value is : "+s[1]);
			System.out.println();
		}
		
		
	}

}
