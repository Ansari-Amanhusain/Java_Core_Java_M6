package com.exercise;

//Implement method overriding to show polymorphism in action.
class Person
{
	String name,gender;
	int age;
	
	public void setPersonalData()
	{
		name="Amanhusain";
		gender="Male";
		age=21;
	}
	public void getDisplay()
	{
		System.out.println("Name of the Person    : "+name);
		System.out.println("Gender of the Person  : "+gender);
		System.out.println("Age of the person     : "+age);
	}
}

class Customer1 extends Person
{
	int cid;
	String pro_name;
	int price;
	
	public void setCustomerData()
	{
		cid=101;
		pro_name="Monitor";
		price=3000;
	}
	
	public void getDisplay()
	{
		System.out.println("Customer ID         : "+cid);
		System.out.println("Customer Pro_name   : "+pro_name);
		System.out.println("Price of Product    : "+price);
	}
}

public class MethodOveriddingClass 
{
	public static void main(String[] args) 
	{
		Customer1 c1=new Customer1();
		c1.setPersonalData();
		c1.setCustomerData();
		c1.getDisplay();
	}

}
