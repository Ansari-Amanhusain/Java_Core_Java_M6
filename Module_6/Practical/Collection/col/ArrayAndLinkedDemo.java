package com.col;

//Write a program that demonstrates the use of an ArrayList and LinkedList.

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayAndLinkedDemo 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		System.out.println("Default Size of ArrayList    : "+a1.size());  // size  = 0
		System.out.println("Default Value of ArrayList   : "+a1);        // Values = []
		
		a1.add(101);
		a1.add("Aman");
		a1.add('A');
		a1.add(23.43f);
		
		System.out.println("Now Size of ArrayList   : "+a1.size());
		System.out.println("Now Value of ArrayList  : "+a1);
		
		a1.remove(3);
		System.out.println("Now Size of ArrayList   : "+a1.size());
		System.out.println("Now Value of ArrayList  : "+a1);
		
		
		LinkedList l1=new LinkedList();
		System.out.println("Default Size of LinkedList    : "+l1.size());  // size  = 0
		System.out.println("Default Value of LikedList   : "+l1);         // value  = []
		
		l1.add(101);
		l1.addFirst("Aman");
		l1.add(23.43f);
		l1.addFirst('A');
		l1.addLast("Ansari");
		
		System.out.println("Now Size of LinkedList   : "+l1.size());
		System.out.println("Now Value of LinkedList  : "+l1);
		
		l1.remove(2);
		l1.removeFirst();
		
		System.out.println("Now Size of LinkedList   : "+l1.size());
		System.out.println("Now Value of LinkedList  : "+l1);
		
	}

}
