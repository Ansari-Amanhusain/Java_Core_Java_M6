package com.exercise;

public class EncapsulationClass 
{
	public static void main(String[] args) 
	{
		SetterGetterClass sg=new SetterGetterClass();
		sg.setA(10);
		sg.setName("Aman");
		
		System.out.println("Number is     : "+sg.getA());
		System.out.println("Name is       : "+sg.getName());
		
	}

}
