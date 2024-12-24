package com.InOut;

// Write a program to read input from the console using Scanner.

import java.util.Scanner;

public class ScannerDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name : ");
		String sname=sc.nextLine();
		
		System.out.println("Enter your age : ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println("Are you a Student (Yes/No) : ");
		String s=sc.nextLine( );
		
	    System.out.println("===========================================");
	    System.out.println("Name         : "+sname);
	    System.out.println("Age          : "+age);
	    System.out.println("Are you a Student : "+s);
	    System.out.println("===========================================");
	    
	    sc.close();
	}

}
