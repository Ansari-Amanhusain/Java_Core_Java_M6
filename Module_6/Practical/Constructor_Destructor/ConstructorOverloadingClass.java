package com.exercise;
//Demonstrate constructor overloading by passing different types of parameters.
class Average
{
	int x,y,z;
	float Result;
	public Average()
	{
		x=10; 
		y=20; z=30;
		Result=(x+y+z)/3;
		System.out.println("First Average of Three Number is   : "+Result);
	}
	public Average(int a, int b)
	{
		x=a; 
		y=a; z=b;
		Result=(x+y+z)/3;
		System.out.println("Second Average of Three Number is   : "+Result);
	}
	public Average(int a)
	{
		x=a; 
		y=a; z=a;
		Result=(x+y+z)/3;
		System.out.println("Third Average of Three Number is   : "+Result);
	}
	public Average(int a, int b, int c)
	{
		x=a; 
		y=b; z=c;
		Result=(x+y+z)/3;
		System.out.println("Fourth Average of Three Number is   : "+Result);
	}
	
}
public class ConstructorOverloadingClass
{
	public static void main(String[] args) 
	{
		Average a1=new Average();
		a1=new Average(20);
		a1=new Average(45, 30);
		a1=new Average(30, 40, 20);
		
	}
}
