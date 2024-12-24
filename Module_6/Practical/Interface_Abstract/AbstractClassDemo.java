package com.exercise;
//Create an abstract class and implement its methods in a subclass
abstract class  Parentsdemo //abstract Class.....
{
	String sname, gender;
	int age;
	abstract public void getData(); //abstract method....
}
class Childdemo extends Parentsdemo //Child Class of Abstract class....
{
	public void getData()//abstarct class override in child class method...
	{
		sname="Amanhusain";
		age=20;
		gender="Male";
	}
	public void show()
	{
		System.out.println("Name   : "+sname);
		System.out.println("Age    : "+age);
		System.out.println("Gender : "+gender);
	}
}

public class AbstractClassDemo 
{
	public static void main(String[] args) 
	{
	     Childdemo cd=new Childdemo();
	     cd.getData();
	     cd.show();
	}

}
