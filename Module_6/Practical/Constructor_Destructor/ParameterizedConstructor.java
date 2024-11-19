package com.exercise;
//Write a program to create and initialize an object using a parameterized constructor
class Calculation
{
	int x,y;
	
	public Calculation()// Default Constructor.........
	{
		x=10;
		y=12;
		System.out.println("Addition is           : "+(x+y));
		System.out.println("Subtraction is        : "+(x-y));
		
		System.out.println("Multiplication is     : "+(x*y));
		if(y > 0)
			System.out.println("Division is       : "+(x/y));
		else
			System.out.println("Invalid Division....");
	}
	
	public Calculation(int a, int b)// Parameterized Constructor.....
	{
		x=a;
		y=b;
		System.out.println("Addition is           : "+(x+y));
	    System.out.println("Subtraction is        : "+(x-y));
		
		System.out.println("Multiplication is     : "+(x*y));
		if(y > 0)
			System.out.println("Division is         : "+(x/y));
		else
			System.out.println("Invalid Division....");
	}
}

public class ParameterizedConstructor 
{
	public static void main(String[] args) 
	{
		
		Calculation cal=new Calculation();
		Calculation cal1=new Calculation(24,12);
	}

}
