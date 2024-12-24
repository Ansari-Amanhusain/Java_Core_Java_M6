package com.exercise;

//Create a custom exception class and use it in your program.

class InsufficientBalanceException extends Exception
{
	 public InsufficientBalanceException(String message) 
	 {
	     super(message);
	 }
}

//BankAccount Class
class BankAccount 
{
	 private String accountHolderName;
	 private double balance;
	
	 public BankAccount(String accountHolderName, double balance) 
	 {
	     this.accountHolderName = accountHolderName;
	     this.balance = balance;
	 }
	
	 public void displayBalance() 
	 {
	     System.out.println("Account Holder: " + accountHolderName);
	     System.out.println("Current Balance: RS " + balance);
	 }

	 
	 public void withdraw(double amount) throws InsufficientBalanceException 
	 {
	     if (amount > balance) 
	     {
	      
	         throw new InsufficientBalanceException("Insufficient balance for withdrawal. Available balance: RS " + balance);
	     }
	     balance -= amount;
	     System.out.println("Withdrawal successful! Amount withdrawn: RS " + amount);
	     System.out.println("New Balance: RS " + balance);
	 }
}


public class CustomException 
{
	
	 public static void main(String[] args) 
	 {
	     BankAccount account = new BankAccount("Amanhusain", 500.00);
	
	     account.displayBalance();
	
	     try 
	     {
	         
	         System.out.println("\nAttempting to withdraw RS 200...");
	         account.withdraw(200);
	
	         System.out.println("\nAttempting to withdraw RS 400...");
	         account.withdraw(400); // This will throw the custom exception
	
	     } 
	     catch (InsufficientBalanceException e)
	     {
	         // Handle the custom exception
	         System.out.println("Error: " + e.getMessage());
	     } 
	     finally 
	     {
	         // Display final balance
	         System.out.println("\nFinal account details:");
	         account.displayBalance();
	     }
	 }
}
