package com.exercise;
//Create a program to reverse a string and check for palindromes.

import java.util.Scanner;

public class PalindromeClass 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String   : ");
		String word=sc.nextLine();
		
		int len=word.length();
		
		String original_word="";
		
		for(int i=len-1;i>=0;i--)
		{
			original_word += word.charAt(i); 
        }

        System.out.println("Reversed String: " + original_word);

        
        if (word.equalsIgnoreCase(original_word)) 
        {
            System.out.println("The string is a palindrome.");
        } 
        else 
        {
            System.out.println("The string is not a palindrome.");
        }

        sc.close(); 
		
	}
}
