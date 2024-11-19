package com.exercise;
//Write a program that demonstrates inheritance using extends keyword
class Demo
{
	int no;
	public void setDemoData()
	{
		no=12;	
	}
}
class Demo1 extends Demo
{
	String name;
	int age;
	public void setDemo1Data()
	{
		name="Aakash";
		age=22;
	}
	public void displayData()
	{
		System.out.println("Number of Person      : "+no);
		System.out.println("Name of Person        : "+name);
		System.out.println("Age of Person         : "+age);
	}
}
public class InheritanceDemoClass 
{
	public static void main(String[] args) 
	{
		Demo1 d1=new Demo1();
		d1.setDemoData();
		d1.setDemo1Data();
		d1.displayData();
	}

}
