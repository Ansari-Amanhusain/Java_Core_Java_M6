package com.exercise;
//Write a program to find the maximum of three numbers using a method

class MaxNum
{
	int a,b,c;
	public void max(int a, int b, int c)
	{
		if(a>b && a>c)
			System.out.println("Max is... "+a);
		else if(b>a && b>c)
			System.out.println("Max is... "+b);
		else
			System.out.println("Max is... "+c);
		
	}
	
}
public class MaxNumMethod 
{
	public static void main(String[] args) 
	{
		MaxNum mn=new MaxNum();
		mn.max(23, 10, 50);
		mn.max(9, 10, 5);
		mn.max(13, 7, 1);
		
	}
}
