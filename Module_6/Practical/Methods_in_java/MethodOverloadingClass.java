package com.exercise;
//Implement method overloading by creating methods for different data types.
class MethodOverloading1
{
	int a,b;
	public void multiplication()
	{
		a=5;
		b=6;
		System.out.println("First Multiplication of Two Number is   : "+(a*b));
	}
	public void multiplication(int a, int b)
	{
		System.out.println("Second Multiplication of Two Number is  : "+(a*b));
	}
	public void multiplication(int x)
	{
		a=b=x;
		System.out.println("Third Multiplication of Two Number is   : "+(a*b));
	}
	public void multiplication(float x)
	{
		a=b=(int)x;
		System.out.println("Fourth Multiplication of Two Number is  : "+(a*b));
	}
}

public class MethodOverloadingClass 
{
	public static void main(String[] args) 
	{
		MethodOverloading1 md=new MethodOverloading1();
		md.multiplication();
		md.multiplication(2, 3);
		md.multiplication(5);
		md.multiplication(4.05f);
	}
}
