package com.exercise;

public class TypeConversion 
{
	public static void main(String[] args) 
	{
		int i1=12;
		byte b1=(byte)i1;//Explicit : Bigger Data Type in size to Smaller data type.....(Type Casting)
		long l1=i1;//Implicit  : Smaller data Type in size to Bigger data type....(Automatically)
		
		System.out.println("Implicit Types     : "+l1);
		System.out.println("Explict Types      : "+b1);
		
	}

}
