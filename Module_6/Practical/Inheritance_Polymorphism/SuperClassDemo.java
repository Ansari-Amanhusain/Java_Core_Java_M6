package com.exercise;
//Use the super keyword to call the parent class constructor and methods.
class Baseclass
{
	public Baseclass()
	{
		System.out.println("This is the Parent Class.......");
	}
}
class Subclass1 extends Baseclass
{
	Subclass1()
	{
		//Super keyword is used Call the Parents Class Constructor............
		super();
		System.out.println("This is the Child Class.........");
	}
	
}

public class SuperClassDemo 
{
	public static void main(String[] args) 
	{
		Subclass1 sb=new Subclass1();
	}

}
