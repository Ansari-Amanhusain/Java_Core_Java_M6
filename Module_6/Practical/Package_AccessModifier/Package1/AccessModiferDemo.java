package com.Package1;
/*Demonstrate the use of different access modifiers within the same package and
across different packages.*/
abstract public class AccessModiferDemo 
{
	private int p_id;
	protected String mob_no;
	public String name;
	abstract public void setData();
	public void setPId(int pid)
	{
		p_id = pid;
	}
	public void getPId()
	{
		System.out.println("Person Id Number   : "+p_id);
	}
	abstract public void show();
	
}

class AbstractDemo1 extends AccessModiferDemo
{
	public void setData()
	{
		setPId(123);
		mob_no="6452793784";
		name="Amanhusain";
		
	}
	public void show()
	{
		System.out.println("Mobile Number  : "+mob_no);
		System.out.println("Name           : "+name);
		getPId();
	}
}