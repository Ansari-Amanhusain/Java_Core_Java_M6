package com.exercise;
//Create a class with static variables and methods to demonstrate their use.

class StaticDemo
{
	static int id=10;
	public static  int get(int n)
	{
		return n*n;
	}
}
public class StaticVariableMethod 
{
	public static void main(String[] args) 
	{
		// Without making Object of above class you can access if the variable and method is Static.
		int Num=StaticDemo.get(4);
		System.out.println("ID is    : "+StaticDemo.id); // Static Variable
		System.out.println("Multiplication of Static Method  : "+Num); // Static Method 
		
	}

}
