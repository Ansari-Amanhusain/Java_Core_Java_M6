package com.exercise;
//Implement runtime polymorphism by overriding methods in the child class
class Animal
{
	public void display()
	{
		System.out.println("This is the Parent Class.....");
	}
}
class Dog extends Animal
{
	public void display()
	{
		System.out.println("This is the Child Class.....");
	}
}

public class RunTimePolymorphism 
{
	public static void main(String[] args) 
	{ 
//		Dog dg=new Dog();
//		dg.display();
		
		Animal al=new Animal();
		al.display();
		al=new Dog();
		al.display();
	}
}
