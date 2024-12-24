package com.exercise;
//Write a program that implements multiple interfaces in a single class.
class Marksheet
{
	int total;
	float per;
}

class Studentdemo extends Marksheet implements Marksdemo
{
	int roll_no;
	String name;
	public void setStudentData()
	{
		roll_no=101;
		name="Aman";
		total=m1+m2+m3;
		per=total/3;
	}
	public void getData()
	{
		System.out.println("Roll Number       : "+roll_no);
		System.out.println("Student's Name    : "+name);
		System.out.println("Subject's Marks   : "+m1+" "+m2+" "+m3);
		System.out.println("Total Marks is    : "+total);
		System.out.println("Percentage is     : "+per);
		System.out.println("Student's Grade   : "+Grade);	
	}
}

public class MultipleClassDemo 
{
	public static void main(String[] args) 
	{
		Studentdemo sd=new Studentdemo();
		sd.setStudentData();
		sd.getData();
	}
}
