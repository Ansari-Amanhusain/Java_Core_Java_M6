package com.exercise;

import java.util.Scanner;

/*Create a class Student with attributes (name, age) and a method to display the
details.
*/
class Student
{
	String name;
	int age;
	
	public void getStudentData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name of Student  : ");
		name=sc.nextLine();
		System.out.println("Enter the Age of Student   : ");
		age=sc.nextInt();
		sc.close();
	}
	
	public void showStudentData()
	{
		System.out.println("Name of the Student     :  "+name);
		System.out.println("Age of the Student      :  "+age);
	}
}
public class StudentClass 
{
	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.getStudentData();
		s1.showStudentData();
		
	}

}
