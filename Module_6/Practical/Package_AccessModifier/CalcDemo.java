package com.exercise;
// Create a user-defined package and import it into another program
import com.Package1.UserDefined;

public class CalcDemo 
{
	public static void main(String[] args) 
	{
		UserDefined ud=new UserDefined();
		ud.setDate();
		System.out.println("Addition of "+ud.num1+" and "+ud.num2+" is        : "+(ud.num1+ud.num2));
		System.out.println("Subtraction of "+ud.num1+" and "+ud.num2+" is     : "+(ud.num1-ud.num2));
        System.out.println("Mutiplication of "+ud.num1+" and "+ud.num2+" is   : "+(ud.num1*ud.num2));
		System.out.println("Division of "+ud.num1+" and "+ud.num2+" is        : "+(ud.num1/ud.num2));
		
	}

}
