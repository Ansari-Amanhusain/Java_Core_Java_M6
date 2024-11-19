package com.exercise;
//Write a program demonstrating single inheritance.

class Superclass
{
	String name;
	
}
class Subclass extends Superclass
{
	int id;
	public void getSubData()
	{
		name="Amanhusain K Ansari";
		id=123;
	}
	public void display()
	{
		System.out.println("Person's ID   : "+id);
		System.out.println("Person's Name : "+name);
	}
}
public class SingleInheritanceClass 
{
	public static void main(String[] args) 
	{
		Subclass sc=new Subclass();
		
		sc.getSubData();
		sc.display();
		
	}

}
