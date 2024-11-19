package com.exercise;

import java.util.Scanner;

//Write a program to perform matrix addition and subtraction using 2D arrays.
public class Array2D 
{
	public static void main(String[] args) 
	{
		int[][] a=new int[3][3];
		int[][] b=new int[3][3];
		int[][] c=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array 1 : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter the a["+(i+1)+"]["+(j+1)+"]  : ");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("First Matrix==========================");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter the b["+(i+1)+"]["+(j+1)+"]  : ");
				b[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Second Matrix==========================");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Addition of Two Matrix===========================");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Subtraction of Two Matrix===========================");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
