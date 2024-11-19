package com.exercise;

//Create multiple constructors in a class and demonstrate constructor overloading
class Calculator
{
	int x,y;
	public Calculator()
	{
		x=10;
		y=20;
		System.out.println("First Sum is   : "+(x+y));
	}
	public Calculator(int a)
	{
		x=a;
		y=a;
		System.out.println("Second Sum is  : "+(x+y));
	}
}
public class ConstructorOverLoading 
{
	public static void main(String[] args) 
	{
		Calculator c1=new Calculator();
		Calculator c2=new Calculator(20);
	}

}
