package com.col;

import java.util.HashSet;
import java.util.Iterator;

// Implement a program using HashSet to remove duplicate elements from a list.

public class HashsetDemo 
{
	public static void main(String[] args) 
	{
		HashSet h1=new HashSet();
		System.out.println("Default Size of Hashset    : "+h1.size());  // size = 0 
		System.out.println("Default Value of Hashset   : "+h1);        // Value = []
		
		h1.add(221);
		h1.add("Aman");
		h1.add('A');
		h1.add(23.45f);
		h1.add(921);
		h1.add("Aman");
		System.out.println("Now Size of Hashset   : "+h1.size());
		System.out.println("Now Values of Hashset : "+h1);
		
		h1.remove("Aman");
		System.out.println("Now Size of Hashset   : "+h1.size());
		System.out.println("Now Values of Hashset : "+h1);	
		
		h1.remove(921);
		System.out.println("Now Size of Hashset   : "+h1.size());
		System.out.println("Now Values of Hashset : "+h1);
		
		Iterator i1=h1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}

}
