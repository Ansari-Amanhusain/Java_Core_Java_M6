package com.exercise;
//Create a class hierarchy and demonstrate multilevel inheritance
class StudentDemo
{
	int roll_no;
	String name;
	public void getStudentData()
	{
		roll_no=10;
		name="Amanhusain";
	}
}
class Personal extends StudentDemo
{
	int age;
	String Branch;
	public void getPersonalData()
	{
		age=21;
		Branch="B.Tech";
	}
}
class SubjectMarks extends Personal
{
	int c,java,eng,math;
	public void getMarksData()
	{
		math=79;
		java=83;
		c=71;
		eng=62;
	}
	public void display()
	{
		System.out.println("Roll Number is        : "+roll_no);
		System.out.println("Name of Student       : "+name);
		System.out.println("Student's Age         : "+age);
		System.out.println("Student's Branch      : "+Branch);
		System.out.println("Mark of Java          : "+java);
		System.out.println("Mark of C             : "+c);
		System.out.println("Mark of English       : "+eng);
		System.out.println("Mark of Maths         : "+math);
	}
}
public class Hierarchy 
{
    public static void main(String[] args) 
    {
    	SubjectMarks sm=new SubjectMarks();
    	sm.getStudentData();
    	sm.getPersonalData();
    	sm.getMarksData();
    	sm.display();
		
	}
}
