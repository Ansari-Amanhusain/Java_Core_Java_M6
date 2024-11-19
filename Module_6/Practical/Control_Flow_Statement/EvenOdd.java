package com.exercise;

//Write a program to find if a number is even or odd using an if-else statement.
import java.util.Scanner;

public class EvenOdd 
{
	public static void main(String[] args) 
	{
		int n;
	    System.out.println("=======Check the Number is Even or Odd======");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		n=sc.nextInt();
		if(n%2==0)
			System.out.println(n+" Number is Even.....");
		else
			System.out.println(n+" Number is Odd.....");
		
		
	}

}
