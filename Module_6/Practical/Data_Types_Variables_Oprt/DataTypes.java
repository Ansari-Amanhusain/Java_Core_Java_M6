package com.exercise;

//Write a program to demonstrate the use of different data types.
public class DataTypes 
{
	public static void main(String[] args) 
	{
		int i1=12;
		float f1=3.14f;
		long l1=12345678;
		char c1='A';
		double d1=132.0432;
		byte b1=123;
		boolean bb=true;
		
		System.out.println("=======================================");
		//Print the Value
		System.out.println("Integer Number is : "+i1);
		System.out.println("Float Number is : "+f1);
		System.out.println("Long Interger Number is : "+l1);
		System.out.println("Character is : "+c1);
		System.out.println("Double Number is : "+d1);
		System.out.println("Byte Number is : "+b1);
		System.out.println("Boolean Number is : "+bb);
		
		System.out.println("========================================");
		//Size of DataTypes...
		System.out.println("Size of int  : "+Integer.BYTES);
		System.out.println("Size of Float  : "+Float.BYTES);
		System.out.println("Size of Double  : "+Double.BYTES);
		System.out.println("Size of Long  : "+Long.BYTES);
		System.out.println("Size of Char  : "+Character.BYTES);
		System.out.println("Size of byte  : "+Byte.BYTES);
		
	}

}
