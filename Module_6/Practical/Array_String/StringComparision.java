package com.exercise;

//Implement string comparison using equals() and compareTo() methods.
import java.util.Scanner;

public class StringComparision 
{
	public static void main(String[] args) 
	{
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First String   : ");
		str1=sc.nextLine();
		System.out.println("Enter the Second String  : ");
		str2=sc.nextLine();
		
		//Using Equals() method.....
		if(str1.equals(str2))
			System.out.println("String are Equal....");
		else
			System.out.println("String are not Equal....");
		
		System.out.println("======================================================");
		int  n=str1.compareTo(str2);
		if(n==0)
			System.out.println("String are Equal......");
		else if(n>0)
			System.out.println("First String are greater than Second String");
		else
			System.out.println("First String are smaller than Second String");
		
	}

}
