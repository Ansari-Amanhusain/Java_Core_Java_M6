package com.exercise;

//Create a calculator using arithmetic and relational operators.
import java.util.Scanner;
public class SimpleCalculator 
{
	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number   : ");
		a=sc.nextInt();
		System.out.println("Enter the Second Number  : ");
		b=sc.nextInt();
		
		System.out.println("Addition of Two Number "+(a+b));
		System.out.println("Subtraction of Two Number "+(a-b));
		System.out.println("Multiplication of Two Number "+(a*b));
		if(b>0)
			System.out.println("Division of Two Number "+(a/b));
		else
			System.out.println("Invalid");
		
		sc.close();
		
	}

}
